package com.erikstackelberg.cocktailhour.adapters;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import com.erikstackelberg.cocktailhour.BR;
import com.erikstackelberg.cocktailhour.R;
import com.erikstackelberg.cocktailhour.models.Ingredient;

import io.realm.OrderedRealmCollection;
import io.realm.RealmRecyclerViewAdapter;

public class IngredientListAdapter extends RealmRecyclerViewAdapter<Ingredient,
        IngredientListAdapter.IngredientsViewHolder>  {
    private OnItemClickListener listener;
    private OnCheckboxClickListener checkBoxListener;

    public IngredientListAdapter(@Nullable OrderedRealmCollection<Ingredient> data,
                                 boolean autoUpdate, OnItemClickListener listener,
                                 OnCheckboxClickListener checkBoxListener) {
        super(data, autoUpdate);
        this.listener = listener;
        this.checkBoxListener = checkBoxListener;
    }

    @Override
    public IngredientsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new IngredientsViewHolder(DataBindingUtil.inflate(LayoutInflater.from(
                parent.getContext()), R.layout.list_item_ingredient, parent, false));
    }

    @Override
    public void onBindViewHolder(final IngredientsViewHolder holder, int position) {
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onItemClick(getItem(holder.getAdapterPosition()));
            }
        });
        CheckBox checkbox = holder.itemView.findViewById(R.id.list_item_ingredient_has_ingredient);
        checkbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                checkBoxListener.onCheckBoxClick(getItem(holder.getAdapterPosition()), b);
            }
        });
        holder.bind(getItem(position));
    }

    public interface OnItemClickListener {
        void onItemClick(Ingredient item);
    }

    public interface OnCheckboxClickListener {
        void onCheckBoxClick(Ingredient item, boolean newValue);
    }

    class IngredientsViewHolder extends RecyclerView.ViewHolder {
        private ViewDataBinding binding;

        IngredientsViewHolder(ViewDataBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        void bind(final Ingredient ingredient) {
            binding.setVariable(BR.ingredient, ingredient);
            binding.executePendingBindings();
        }
    }
}

package com.erikstackelberg.cocktailhour.adapters;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.erikstackelberg.cocktailhour.BR;
import com.erikstackelberg.cocktailhour.R;
import com.erikstackelberg.cocktailhour.models.Ingredient;

import io.realm.OrderedRealmCollection;
import io.realm.RealmRecyclerViewAdapter;

public class IngredientListAdapter extends RealmRecyclerViewAdapter<Ingredient,
        IngredientListAdapter.IngredientsViewHolder>  {
    private OnItemClickListener listener;

    public IngredientListAdapter(@Nullable OrderedRealmCollection<Ingredient> data,
                                 boolean autoUpdate, OnItemClickListener listener) {
        super(data, autoUpdate);
        this.listener = listener;
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
        holder.bind(getItem(position));
    }

    public interface OnItemClickListener {
        void onItemClick(Ingredient item);
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

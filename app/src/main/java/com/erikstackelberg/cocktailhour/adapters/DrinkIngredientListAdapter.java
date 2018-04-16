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
import com.erikstackelberg.cocktailhour.models.Drink;
import com.erikstackelberg.cocktailhour.models.DrinkIngredient;
import com.erikstackelberg.cocktailhour.models.Ingredient;

import io.realm.OrderedRealmCollection;
import io.realm.RealmRecyclerViewAdapter;


public class DrinkIngredientListAdapter extends RealmRecyclerViewAdapter<DrinkIngredient, DrinkIngredientListAdapter.DrinkIngredientsViewHolder> {
    private OnItemClickListener listener;
    public DrinkIngredientListAdapter(@Nullable OrderedRealmCollection<DrinkIngredient> data, boolean autoUpdate, OnItemClickListener listener) {
        super(data, autoUpdate);
        this.listener = listener;
    }

    @Override
    public DrinkIngredientsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new DrinkIngredientsViewHolder(DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()),
                R.layout.list_item_drink_ingredient, parent, false));
    }

    @Override
    public void onBindViewHolder(final DrinkIngredientsViewHolder holder, int position) {

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onItemClick(getItem(holder.getAdapterPosition()).getIngredient());
            }
        });
        holder.bind(getItem(position));
    }

    public interface OnItemClickListener {
        void onItemClick(Ingredient ingredient);
    }

    class DrinkIngredientsViewHolder extends RecyclerView.ViewHolder {
        private ViewDataBinding binding;

        DrinkIngredientsViewHolder(ViewDataBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        void bind(final DrinkIngredient drinkIngredient) {
            binding.setVariable(BR.drinkIngredient, drinkIngredient);
            binding.executePendingBindings();
        }
    }
}

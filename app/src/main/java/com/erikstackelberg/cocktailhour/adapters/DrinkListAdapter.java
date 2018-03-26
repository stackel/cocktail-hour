package com.erikstackelberg.cocktailhour.adapters;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.erikstackelberg.cocktailhour.BR;
import com.erikstackelberg.cocktailhour.R;
import com.erikstackelberg.cocktailhour.models.Drink;

import io.realm.OrderedRealmCollection;
import io.realm.RealmRecyclerViewAdapter;

public class DrinkListAdapter extends RealmRecyclerViewAdapter<Drink, DrinkListAdapter.DrinksViewHolder>  {
    private OnItemClickListener listener;

    public DrinkListAdapter(@Nullable OrderedRealmCollection<Drink> data,
                            boolean autoUpdate, OnItemClickListener listener) {
        super(data, autoUpdate);
        this.listener = listener;
    }

    @Override
    public DrinksViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new DrinksViewHolder(DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()), R.layout.list_item_drink, parent, false));
    }

    @Override
    public void onBindViewHolder(final DrinksViewHolder holder, int position) {
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onItemClick(getItem(holder.getAdapterPosition()));
            }
        });
        holder.bind(getItem(position));
    }

    public interface OnItemClickListener {
        void onItemClick(Drink item);
    }

    class DrinksViewHolder extends RecyclerView.ViewHolder {
        private ViewDataBinding binding;

        DrinksViewHolder(ViewDataBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        void bind(final Drink drink) {
            binding.setVariable(BR.drink, drink);
            binding.executePendingBindings();
        }
    }
}

package com.erikstackelberg.cocktailhour.adapters;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.erikstackelberg.cocktailhour.BR;
import com.erikstackelberg.cocktailhour.R;
import com.erikstackelberg.cocktailhour.enums.Unit;
import com.erikstackelberg.cocktailhour.models.DrinkIngredient;
import com.erikstackelberg.cocktailhour.models.Ingredient;

import java.util.ArrayList;

/**
 * Created by erik on 2017-11-23.
 */

public class DrinkIngredientAddListAdapter extends RecyclerView.Adapter<DrinkIngredientAddListAdapter.ViewHolder> {
    private ArrayList<DrinkIngredient> drinkIngredients;
    private ArrayAdapter<Ingredient> allIngredientsAdapter;
    private ArrayAdapter<Unit> unitSpinnerAdapter;

    public DrinkIngredientAddListAdapter(ArrayList<DrinkIngredient> drinkIngredients,
                                         ArrayAdapter<Ingredient> allIngredientsAdapter,
                                         ArrayAdapter<Unit> unitSpinnerAdapter) {
        this.drinkIngredients = drinkIngredients;
        this.allIngredientsAdapter = allIngredientsAdapter;
        this.unitSpinnerAdapter = unitSpinnerAdapter;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()),
                R.layout.list_item_add_drink_ingredient, parent, true));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return drinkIngredients.size();
    }

    public ArrayList<DrinkIngredient> getAllItems() {
        return drinkIngredients;
    }

    public void addDrinkIngredient(DrinkIngredient drinkIngredient) {
        drinkIngredients.add(drinkIngredient);
        notifyItemChanged(getItemCount() - 1);
    }

    private void removeDrinkIngredient(int position) {
        drinkIngredients.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position, getItemCount() - position);
    }

    public void setDrinkIngredients(ArrayList<DrinkIngredient> drinkIngredients) {
        this.drinkIngredients = drinkIngredients;
        notifyDataSetChanged();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private ViewDataBinding binding;
        private Button deleteButton;
        private AutoCompleteTextView autoCompleteTextView;
        private Spinner unitSpinner;
        private EditText amountEditText;

        ViewHolder(ViewDataBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
            this.deleteButton = binding.getRoot().findViewById(R.id.add_drink_ingredient_remove_button);
            this.autoCompleteTextView = binding.getRoot().findViewById(R.id.add_drink_ingredient_name_input);
            this.unitSpinner = binding.getRoot().findViewById(R.id.add_drink_unit_spinner);
            this.amountEditText = binding.getRoot().findViewById(R.id.add_drink_amount_input);
        }

        void bind(final int position) {
            final DrinkIngredient drinkIngredient = drinkIngredients.get(position);
            binding.setVariable(BR.drinkIngredient, drinkIngredient);
            binding.executePendingBindings();

            deleteButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    removeDrinkIngredient(position);
                }
            });

            autoCompleteTextView.setAdapter(allIngredientsAdapter);
            unitSpinner.setAdapter(unitSpinnerAdapter);
            unitSpinner.setSelection(unitSpinnerAdapter.getPosition(drinkIngredient.getUnit()));
            autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    drinkIngredient.setIngredient((Ingredient) autoCompleteTextView.getAdapter().getItem(i));
                }
            });

            unitSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    drinkIngredient.setUnit((Unit) unitSpinner.getAdapter().getItem(i));
                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {
                }
            });
            amountEditText.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    if(charSequence.length() > 0) {
                        drinkIngredient.setAmount(Double.parseDouble(charSequence.toString()));
                    }
                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });
        }
    }
}

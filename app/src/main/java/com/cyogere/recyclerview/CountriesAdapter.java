package com.cyogere.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CountriesAdapter extends RecyclerView.Adapter<CountriesAdapter.CountriesListHolder> {

   String[] countriesList;

    public CountriesAdapter(String[] countriesList) {
        this.countriesList = countriesList;
    }

    @NonNull
    @Override
    public CountriesListHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.country_layout, parent, false);
        CountriesListHolder countriesListHolder = new CountriesListHolder(view);

        return countriesListHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CountriesListHolder holder, int position) {
        holder.tvCountry.setText(countriesList[position]);
    }

    @Override
    public int getItemCount() {
        return countriesList.length;
    }

     class CountriesListHolder extends RecyclerView.ViewHolder {
            TextView tvCountry;
         CountriesListHolder(@NonNull View itemView) {
            super(itemView);
             tvCountry = itemView.findViewById(R.id.country_tv);
        }
    }
}

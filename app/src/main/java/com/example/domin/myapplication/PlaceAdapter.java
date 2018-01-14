package com.example.domin.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnItemClick;
import butterknife.OnItemSelected;

// 7. Utwórz klasę PlaceAdapter dziedzicząca po
// RecyclerView.Adapter<PlaceAdapter.ViewHolder>
public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.ViewHolder>
{
    // 14. W adapterze stwórz konstruktor, który przyjmować będzie listę miejsc.
    private ArrayList<Place> miasta = new ArrayList<>();

    PlaceAdapter(ArrayList<Place> miasta)
    {
        this.miasta = miasta;
    }


    // 16. Zmień wygenerowane metody, aby działały poprawnie:
    //a. onCreate – powinien być setowany .xml,

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout,null);
        return new ViewHolder(itemLayoutView);
    }

    //c. onBindView powinno wywoływać metody z viewholdera do uzupełnienia
    // danych na konkretnym itemie.
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.setItemName(miasta.get(position).getPlaceName());
        holder.setItemInformation(miasta.get(position).getInformation() + "");

    }

    //b. getItemCount powinno zwracać rozmiar listy danych,
    @Override
    public int getItemCount()
    {
        return miasta.size();
    }

    // 8. Utwórz klasę ViewHoldera
    public class ViewHolder extends RecyclerView.ViewHolder  {

        // 17. Ustawienie danych w ViewHolder
        @BindView(R.id.miasto)
        TextView ItemM;

        @BindView(R.id.informacja)
        TextView ItemI;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }


        private void setItemName(String miasto) {
            ItemM.setText(miasto);
        }

        private void setItemInformation(String info) {
            ItemI.setText(info);
        }




    }}


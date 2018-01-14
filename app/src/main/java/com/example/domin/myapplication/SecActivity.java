package com.example.domin.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.io.BufferedReader;
import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SecActivity extends AppCompatActivity {
    @BindView(R.id.rV)
    RecyclerView rV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);
        ButterKnife.bind(this);



        // 13. Stworzenie listy places
        ArrayList<Place> miasta = new ArrayList<>();
        miasta.add(new Place("Ruda Slaska", 30, "Słonecznie"));
        miasta.add(new Place("Zabrze ", 25, "Pochmurnie"));
        miasta.add(new Place("Katowice", 15, "Deszcz"));




        // 11. Stworzenie LayoutManagera
        // 12. Ustawienie go na adapterze
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        rV.setLayoutManager(layoutManager);

        // 11. Stworzenie Adaptera
        PlaceAdapter placeAdapter = new PlaceAdapter(miasta);
        rV.setAdapter(placeAdapter);



    }

}
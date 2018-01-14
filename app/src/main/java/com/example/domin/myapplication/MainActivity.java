package com.example.domin.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    // 2. Zmień w projekcie wszystkie findViewById na:
    //@BindView(R.id.nazwa_view)

    @BindView(R.id.wpisz) EditText wpisane;
    @BindView(R.id.zmienmiejsce) EditText zmienButton;
    @BindView(R.id.miasto) EditText tutaj;
    @BindView(R.id.pokaz) EditText poka;
    private View view;



    @OnClick(R.id.pokaz)
    void changeone()
    {
        String wpisanyTekst = tutaj.getText().toString();

        Bundle koszyk = new Bundle();
        koszyk.putString("dane", wpisanyTekst);

        Intent cel = new Intent(getApplicationContext(),SecActivity.class);
        cel.putExtras(koszyk);

        startActivity(cel);
    }

    @OnClick(R.id.zmienmiejsce)
    void change(){
        tutaj.setText(wpisane.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // 1. Dodaj bindowanie z ButterKnifa do aktywności
        ButterKnife.bind(this);

        //wpisane = (EditText) findViewById(R.id.wpisz);
        //zmienButton = (Button) findViewById(R.id.zmienmiejsce);
        // tutaj = (TextView) findViewById(R.id.miasto);
        //poka =(Button)findViewById(R.id.pokaz);


// 18. W pierwszej aktywności zmień zawartość ImageView z Drawable na obrazek
// związanym z pogodą, z linku URL. Wykorzystaj do tego bibliotekę Glide

        // link URL do wybranego obrazka
        String imgUrl = "https://www.google.pl/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=0ahUKEwjqv-Kr5LnYAhWFIVAKHRXjDYUQjRwIBw&url=https%3A%2F%2Fwww.superkid.pl%2Fkrzyzowki-online-pogoda&psig=AOvVaw2K09werDUAOHSqNWxPTAG_&ust=1514998854223192";
// metoda szukająca id ImageView
        ImageView imageView = (ImageView) getView().findViewById(R.id.image);

        Glide.with(getApplicationContext())
                .load(imgUrl)
                .into(imageView);

        Intent getData = getIntent();
        Bundle bundle = getIntent().getExtras();

    }

    public View getView() {
        return view;
    }

    // 3. Zamień wszystkie setOnClickListener na:
    //@OnClick (R.id.nazwa_view)
    //void onClick() { }

    // zmienButton.setOnClickListener(new View.OnClickListener()
    //      poka.setOnClickListener(new View.OnClickListener() {

    }


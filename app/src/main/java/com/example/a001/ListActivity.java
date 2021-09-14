package com.example.a001;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity
{
    private ArrayList<CompaniaTelefonica> companias = new ArrayList<>();
    private ListView listaCompanias;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        rellenarCompanias();

        CompaniasAdapter adapter = new CompaniasAdapter(this, companias);
        listaCompanias = findViewById(R.id.lvTelefonicas);
        listaCompanias.setAdapter(adapter);

    }

    private void rellenarCompanias()
    {
        companias.add(new CompaniaTelefonica("Movistar", R.drawable.movistarlogo, 80));
        companias.add(new CompaniaTelefonica("Euskaltel", R.drawable.euskaltellogo, 60));
        companias.add(new CompaniaTelefonica("Vodalfone", R.drawable.vodafonelogo, 50));
        companias.add(new CompaniaTelefonica("Yoigo", R.drawable.yoigologo, 30));
    }
}
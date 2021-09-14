package com.example.a001;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SpinnerActivity extends AppCompatActivity
{
    private Spinner sp = null;
    private int ver = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        sp = findViewById(R.id.spCursos);
        String[] datos = getResources().getStringArray(R.array.cursos);

        //ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.cursos, android.R.layout.simple_spinner_dropdown_item);

        SpinerDamAdapter adapter = new SpinerDamAdapter(this, R.layout.spinner_per, datos);
        sp.setAdapter(adapter);
    }
}
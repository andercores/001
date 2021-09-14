package com.example.a001;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

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

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
            {
                if (ver == 1 && i>0)
                {
                    Toast.makeText(adapterView.getContext(), "Has Seleccionado: "+ adapterView.getItemAtPosition(i - 1).toString(), Toast.LENGTH_SHORT).show();
                }
                ver = 1;

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView)
            {

            }
        });
    }
}
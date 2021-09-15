package com.example.a001;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityAdaptadores extends AppCompatActivity
{
    private Button btnListView, btnSpinner, btnGridView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adaptadores);

        btnListView = findViewById(R.id.btnListView);
        btnSpinner = findViewById(R.id.btnSpinner);
        btnGridView = findViewById(R.id.btnGridView);

        btnListView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(getApplicationContext(), ListActivity.class);
                startActivity(intent);
            }
        });

        btnSpinner.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(getApplicationContext(), SpinnerActivity.class);
                startActivity(intent);
            }
        });
    final ActivityAdaptadores miActividad = this;
        btnGridView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(getApplicationContext(), GridActivity.class);
                startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(miActividad).toBundle());
            }
        });
    }


}
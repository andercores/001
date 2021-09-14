package com.example.a001;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final int duracion = Toast.LENGTH_SHORT;
        LayoutInflater inflater=getLayoutInflater();

        final View miToast=inflater.inflate(R.layout.toast_per,(ViewGroup) findViewById(R.id.layoutToast));

        final Toast toast=new Toast(getApplicationContext());
        //modificamos la foto del toast
        ImageView fotoToast=(ImageView) miToast.findViewById(R.id.ivToast);
        fotoToast.setImageResource(R.drawable.a1);

        TextView textoToast= miToast.findViewById(R.id.tvToast);
        textoToast.setText("Ander y Sergio");

        ImageButton ivBtnToast =findViewById(R.id.ivBtn1);
        ivBtnToast.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //Toast.makeText(getApplicationContext(),"Hola!", Toast.LENGTH_SHORT).show();
                //Log.d("wsss", "ererereer");

                toast.setView(miToast);
                toast.setGravity(Gravity.CENTER_VERTICAL,  0,0);
                toast.setDuration(duracion);
                toast.show();
            }
        });

        //ENLACE CON ASYNTASK
        ImageButton btnAsyntask=(ImageButton) findViewById(R.id.ivBtn1);
        btnAsyntask.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Bundle bundle=new Bundle();
                bundle.putString("saludo","Hola Curso Dam");

                Intent intent= new Intent(getApplicationContext(), AsyntaskDam2.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        ImageButton btnFrame = findViewById(R.id.ivBtnFrame);
        btnFrame.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intentFrame = new Intent(getApplicationContext(), ActivityFrame.class);
                startActivity(intentFrame);

            }
        });

        ImageButton btnAdaptadores = findViewById(R.id.ivBtnAdaptadores);
        btnAdaptadores.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent adaptadoresIntent = new Intent(getApplicationContext(), ActivityAdaptadores.class);
                startActivity(adaptadoresIntent);
            }
        });
    }
}
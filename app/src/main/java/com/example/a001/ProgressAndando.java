package com.example.a001;

import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class ProgressAndando implements Runnable
{
    private AsyntaskDam2 miActividad = null;
    public ProgressAndando(AsyntaskDam2 asyntaskDam2)
    {
        miActividad = asyntaskDam2;
    }

    @Override
    public void run()
    {
        int numFoto =0;
        ProgressBar barra = miActividad.getBarra();
        ImageView foto = miActividad.getImagenCentral();
        //dos maneras de llamar la primera arriba
        miActividad.getTexto().setText("0%");

        for (int i=0; i<100; i++) {
            try
            {
                Thread.sleep(100);
                miActividad.getTexto().setText(i+"%");
                if (numFoto>=3){
                    numFoto=0;
                }else{
                    numFoto++;
                }
                barra.setProgress(i);
                //segunda manera de hacerlo
                foto.setImageResource(miActividad.getImagenes().getResourceId(numFoto, -1));
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }


        }
        //Toast.makeText(miActividad,"Hilo Finalizado", Toast.LENGTH_SHORT).show();
    miActividad.finalizar();
    }
}

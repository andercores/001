package com.example.a001;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CompaniasAdapter extends BaseAdapter
{
    private Context contexto = null;
    ArrayList<CompaniaTelefonica> companiaTelefonicas = new ArrayList<CompaniaTelefonica>();

    public CompaniasAdapter(Context contexto, ArrayList<CompaniaTelefonica> companiaTelefonicas)
    {
        this.contexto = contexto;
        this.companiaTelefonicas = companiaTelefonicas;
    }

    //LOS ADAPTADORES SIEMPRE SE MANEJAN IGUALES
    @Override
    public int getCount()
    {
        return companiaTelefonicas.size();
    }

    @Override
    public Object getItem(int i)
    {
        return companiaTelefonicas.get(i);
    }

    @Override
    public long getItemId(int i)
    {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup)
    {
        LayoutInflater inflater = ((Activity) contexto).getLayoutInflater();
        View fila = inflater.inflate(R.layout.compania_telefonica_list, null);

        CompaniaTelefonica compania = companiaTelefonicas.get(i);

        ImageView ivCompania = fila.findViewById(R.id.ivCompaniaTelefonica);
        ivCompania.setImageResource(compania.getLogo());

        TextView tvNombre = fila.findViewById(R.id.tvNombreCompania);
        tvNombre.setText(compania.getNombre());

        TextView tvPrecio = fila.findViewById(R.id.tvPrecioCompania);
        tvPrecio.setText(compania.getPrecio()+ "");

        return fila;
    }
}

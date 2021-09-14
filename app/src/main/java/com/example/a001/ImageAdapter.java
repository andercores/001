package com.example.a001;

import android.content.Context;
import android.content.res.TypedArray;
import android.media.tv.TvInputService;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ImageAdapter extends BaseAdapter
{
    private Context contexto = null;
    private TypedArray imagenes = null;

    public ImageAdapter(Context contexto, TypedArray imagenes)
    {
        this.contexto = contexto;
        this.imagenes = imagenes;
    }



    @Override
    public int getCount()
    {
        return imagenes.length();
    }

    @Override
    public Object getItem(int i)
    {
        return imagenes.getResourceId(i, -1);
    }

    @Override
    public long getItemId(int i)
    {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup)
    {
        LayoutInflater inflater = LayoutInflater.from(this.contexto);
        View vistaImagen = inflater.inflate(R.layout.grid_item_view, viewGroup, false);
        ImageView imagen = vistaImagen.findViewById(R.id.ivItemGrid);
        //imagen.setImageResource(imagenes.getResourceId(i, -1));
        Glide.with(contexto).load(this.imagenes.getResourceId(i, -1)).into(imagen);
        return vistaImagen;
    }
}

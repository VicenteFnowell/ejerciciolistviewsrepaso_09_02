package com.example.ejerciciolistviewsrepaso_09_02;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Vicente FN on 09/02/2018.
 */

public class AdaptadorJugadores extends ArrayAdapter<Jugadorhistorico> {

    ArrayList <Jugadorhistorico> jugadores;
    Context c;

    public AdaptadorJugadores(Context c, ArrayList<Jugadorhistorico> jugadores){
        super(c,R.layout.item_jugadorhistorico,jugadores);
        this.c = c;
        this.jugadores = jugadores;

    }

    @NonNull
    @Override

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){

        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.item_jugadorhistorico,null);

        //TextView Nombre JUGADOR
        TextView tv_nombre=(TextView)item.findViewById(R.id.tvnombrejug);
        tv_nombre.setText(jugadores.get(position).getNombrejugador());

        //TextView DORSAL
        TextView tv_dorsal=(TextView)item.findViewById(R.id.tvdorsal);
        tv_dorsal.setText(jugadores.get(position).getDorsal());

        //TextView TEMPORADAS
        TextView tv_temporadas=(TextView)item.findViewById(R.id.tvtemporadas);
        tv_temporadas.setText(jugadores.get(position).getTemporadas());

        //ImageView
        String logo = jugadores.get(position).getImagen();

        int idImagen = c.getResources().getIdentifier(logo, "drawable", c.getPackageName());
        ImageView iv_logo = (ImageView)item.findViewById(R.id.imgfotojug);
        iv_logo.setImageResource(idImagen);


        return item;


    }

}



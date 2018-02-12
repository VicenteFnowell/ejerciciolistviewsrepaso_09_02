package com.example.ejerciciolistviewsrepaso_09_02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lvjugadoreshistoricos;
    ImageView imagenjugador;
    TextView tvnombre,tvdorsal,tvtemporadas;
    ArrayList<Jugadorhistorico> lista_jugadores = new ArrayList<Jugadorhistorico>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cargarjugadores();



        tvnombre = (TextView)findViewById(R.id.nombre);
        tvdorsal = (TextView)findViewById(R.id.dorsal);
        tvtemporadas = (TextView)findViewById(R.id.temporadas);
        lvjugadoreshistoricos=(ListView)findViewById(R.id.lvceltics);
        imagenjugador = (ImageView)findViewById(R.id.imagenjug);
        AdaptadorJugadores adaptadorJugadores = new AdaptadorJugadores(this,lista_jugadores);
        lvjugadoreshistoricos.setAdapter(adaptadorJugadores);

        lvjugadoreshistoricos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Jugadorhistorico c =((Jugadorhistorico)parent.getItemAtPosition(position));

            }
        });

        lvjugadoreshistoricos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Jugadorhistorico jugadorhistorico =((Jugadorhistorico)parent.getItemAtPosition(position));
                String nombrejugador = jugadorhistorico.getNombrejugador();
                String dorsal = jugadorhistorico.getDorsal();
                String temporadas = jugadorhistorico.getTemporadas();

                String imagen=jugadorhistorico.getImagen();
                int idImagen = getApplicationContext().getResources().getIdentifier(imagen, "drawable", getApplicationContext().getPackageName());

                tvnombre.setText("NOMBRE: "+nombrejugador);
                tvdorsal.setText("DORSAL: "+dorsal);
                tvtemporadas.setText("TEMPORADAS: "+temporadas);
                imagenjugador.setImageResource(idImagen);


            }
        });



    }//FIN ONCREATE


    private void cargarjugadores(){

        lista_jugadores.add(new Jugadorhistorico("bill", "Bill Rusell","33", "1956-1969"));
        lista_jugadores.add(new Jugadorhistorico("bird", "Larry Bird","33", "1979-1992"));
        lista_jugadores.add(new Jugadorhistorico("hav", "John Havlicek","17", "1962-1978"));
        lista_jugadores.add(new Jugadorhistorico("bob", "Bob Cousy","14", "1950-1963"));
        lista_jugadores.add(new Jugadorhistorico("pierce", "Paul Pierce","34", "1998-2013"));
        lista_jugadores.add(new Jugadorhistorico("mchale", "Kevin McHale","32", "1980-1993"));
        lista_jugadores.add(new Jugadorhistorico("jojo", "JoJo White","10", "1969-1979"));


    }



}//Fin MainActivity

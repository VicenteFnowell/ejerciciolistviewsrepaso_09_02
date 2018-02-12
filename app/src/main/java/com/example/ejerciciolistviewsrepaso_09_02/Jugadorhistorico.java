package com.example.ejerciciolistviewsrepaso_09_02;

/**
 * Created by Vicente FN on 09/02/2018.
 */

public class Jugadorhistorico {

    //Atributos
    String imagen;
    String nombrejugador;
    String dorsal;
    String temporadas;

    //Constructor

    public Jugadorhistorico(String imagen, String nombrejugador, String dorsal, String temporadas) {
        this.imagen = imagen;
        this.nombrejugador = nombrejugador;
        this.dorsal = dorsal;
        this.temporadas = temporadas;
    }

    //Getter y Setters

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getNombrejugador() {
        return nombrejugador;
    }

    public void setNombrejugador(String nombrejugador) {
        this.nombrejugador = nombrejugador;
    }

    public String getDorsal() {
        return dorsal;
    }

    public void setDorsal(String dorsal) {
        this.dorsal = dorsal;
    }

    public String getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(String temporadas) {
        this.temporadas = temporadas;
    }
}

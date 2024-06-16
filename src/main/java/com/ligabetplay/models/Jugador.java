package com.ligabetplay.models;

import com.ligabetplay.team.Equipo;

public class Jugador  extends Persona{
    // Atributos
    private static int contadorJugadores;
    private int jugadorId;
    private int dorsal;
    private int golesAnotados;
    private int tarjetasRojas;
    private int tarjetasAmarillas;

    // Constructor
        public Jugador(String nombre, String nacionalidad, int dorsal, Equipo equipo){
            super(nombre, nacionalidad, "Jugador",equipo );
            Jugador.contadorJugadores++;
            this.jugadorId = Jugador.contadorJugadores;
            this.dorsal = dorsal;
        }

    // getters y setters
    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public int getGolesAnotados() {
        return golesAnotados;
    }

    public void setGolesAnotados(int golesAnotados) {
        this.golesAnotados = golesAnotados;
    }

    public int getTarjetasRojas() {
        return tarjetasRojas;
    }

    public void setTarjetasRojas(int tarjetasRojas) {
        this.tarjetasRojas = tarjetasRojas;
    }

    public int getTarjetasAmarillas() {
        return tarjetasAmarillas;
    }

    public void setTarjetasAmarillas(int tarjetasAmarillas) {
        this.tarjetasAmarillas = tarjetasAmarillas;
    }

    public int getJugadorId(){
        return this.jugadorId;
    }



    //toString
    @Override
    public String toString() {
        return "Jugador [jugadorId=" + jugadorId + ", dorsal=" + dorsal + ", golesAnotados=" + golesAnotados
                + ", tarjetasRojas=" + tarjetasRojas + ", tarjetasAmarillas=" + tarjetasAmarillas + "]";
    }
    
}

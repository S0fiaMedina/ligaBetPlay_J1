package com.ligabetplay.views;
import com.ligabetplay.Utileria;

public class Menu {
    protected String[] opciones;

    private String[] opcionesMenuPrincipal = {
        "Equipos",
        "Personas",
        "Registrar partidos",
        "Tabla de posiciones",
        "Salir"
    };

    private String[] opcionesMenuEquipo = {
        "Registro de equipos",
        "Equipo que más puntos tiene",
        "Equipo que más goles anotó",
        "Total de goles de todos los equipos",
        "Promedio de goles anotados",
        "Salir"
    };

    private String[] opcionesMenuPersona = {
        "Registro de personas",
        "Jugador que más goles anotó",
        "Jugador que más tarjetas amarillas tiene",
        "Jugador que mas tarjetas rojas tiene",
        "Salir "
    };

    public Menu() {
        
    }

    // actualiza opciones
    public void setOpciones(String[] nuevasOpciones) {
        this.opciones = nuevasOpciones;
    }

    public void menuEquipo(){
        this.setOpciones(opcionesMenuEquipo);
    }

    public void menuPersona(){
        this.setOpciones(opcionesMenuPersona);
    }

    public void menuPrincipal(){
        this.setOpciones(opcionesMenuPrincipal);
    }



    // Mostrar las opciones y retornar la opción elegida
    public int mostrarOpciones() {
        Utileria.imprimirOpciones(opciones);
        System.out.println(">> Digite la opción de su preferencia: ");
        int choice = Utileria.validarRango(1, opciones.length);
        if (choice == opciones.length){
            this.salir();
        }
        return choice;
    }

    //salir del menu
    public int salir(){
        return 0;
    }


}
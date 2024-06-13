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
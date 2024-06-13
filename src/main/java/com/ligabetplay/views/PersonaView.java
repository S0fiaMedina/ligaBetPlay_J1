package com.ligabetplay.views;
import com.ligabetplay.Utileria;
import com.ligabetplay.controllers.PersonaController;


public class PersonaView {
    Menu menu = new Menu();
    String rolesEquipo[] = {"Medico", "Tecnico", "Jugador"};
    String rolesMedico[] = {"Medico", "Fisioterapeuta"};
    String rolesTecnico[] = {"Tecnico", "Asistente tecnico", "Preparador fisico"}; 
    JugadorView jugadorView = new JugadorView();

        //**--- MENU DE REGISTRO DE PERSONAS --- */
        public int mostrarMenuRegistroPersonas(){
            System.out.println("--- NUEVA PERSONA ---\n Digite 0 si desea salir");
            Utileria.imprimirOpciones(rolesEquipo);
            int op = Utileria.validarRango(0, rolesEquipo.length);
            return op;
        }

    /*
    // HANDLER GENERAL 
    public void personaHandler(int opcionEscogida){
        switch (opcionEscogida) {
            case 1: // registro de personas
                this.mostrarMenuRegistroPersonas();
                break;
            case 2: // jugador con + goles
                jugadorView.mostrarJugadorConMasGoles();
                break;
            case 3: // jugador  con + tarjetas amarillas
                jugadorView.mostrarJugadorConMasTarjetasAmarillas();
                break;
            case 4: // jugador  con + tarjetas rojas
                jugadorView.mostrarJugadorConMasTarjetasRojas();
                break;
        }
    }
     */



    
    public String getInputNombre(){
        return Utileria.getStringInput("Ingrese el nombre: ");
    }

    public String getInputNacionalidad(){
        return Utileria.getStringInput("Ingrese la  nacionalidad: ");
    }



    public String eleccionRolesMedico(){
        return this.eleccionDeRoles("Escoge el rol del medico", rolesMedico);
    }

    public String eleccionRolesTecnico(){
        return this.eleccionDeRoles("Escoge el rol del tecnico", rolesMedico);
    }

    public String eleccionDeRoles(String mensaje, String[] opciones){
        System.out.println(mensaje);
        Utileria.imprimirOpciones(opciones);
        int opInt = Utileria.validarRango(1, opciones.length);
        return  opciones[opInt - 1];
    }

}

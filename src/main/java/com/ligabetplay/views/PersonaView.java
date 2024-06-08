package com.ligabetplay.views;
import com.ligabetplay.Utileria;
import com.ligabetplay.controllers.PersonaController;


public class PersonaView {
    String rolesEquipo[] = {"Medico", "Tecnico", "Jugador"};
    String rolesMedico[] = {"Medico", "Fisioterapeuta"};
    String rolesTecnico[] = {"Tecnico", "Asistente tecnico", "Preparador fisico"}; 
    PersonaController personaController = new PersonaController();
    JugadorView jugadorView = new JugadorView();

    /*--- HANDLER GENERAL ---*/
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

    //**--- MENU DE REGISTRO DE PERSONAS --- */
    public void mostrarMenuRegistroPersonas(){
        String[] opcionesRegistro = {"Nueva persona", "Salir"};
        Utileria.imprimirOpciones(opcionesRegistro);
        int op = Utileria.validarRango(1, 2);
        
        // llamada a funciones
        if (op == 1){
            personaController.registroPersona();
        }
    }
    
    public String getInputNombre(){
        return Utileria.getStringInput("Ingrese el nombre: ");
    }

    public String getInputNacionalidad(){
        return Utileria.getStringInput("Ingrese la  nacionalidad: ");
    }


    public String eleccionRolesEquipo(){
        return this.eleccionDeRoles("Escoge el rol de la persona", rolesEquipo);
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

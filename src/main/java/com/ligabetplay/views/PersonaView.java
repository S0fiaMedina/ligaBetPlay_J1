package com.ligabetplay.views;
import com.ligabetplay.Utileria;
import com.ligabetplay.controllers.PersonaController;
import java.util.Scanner;



public class PersonaView {
    String rolesEquipo[] = {"Medico", "Tecnico", "Jugador"};
    String rolesMedico[] = {"Medico", "Fisioterapeuta"};
    String rolesTecnico[] = {"Tecnico", "Asistente tecnico", "Preparador fisico"}; 
    Scanner scanner = new Scanner(System.in);
    PersonaController personaController = new PersonaController();

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
        return this.inputString("Ingrese el nombre: ");
    }

    public String getInputNacionalidad(){
        return this.inputString("Ingrese la  nacionalidad: ");
    }

    public String inputString(String mensaje) {
        return this.scanner.nextLine();
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

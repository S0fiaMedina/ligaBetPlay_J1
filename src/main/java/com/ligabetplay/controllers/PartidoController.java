package com.ligabetplay.controllers;
import java.util.Scanner;

import com.ligabetplay.Utileria;
import com.ligabetplay.views.EquipoView;

public class PartidoController {
    Scanner scanner = new Scanner(System.in);
    public void registroDePartidos(){
        System.out.println(">> Digite la fecha del partido en formato dd/mm/yy: ");
        String fecha = Utileria.validarFecha(scanner.nextLine());
        System.out.println("\nSeleccione el equipo local: ");
        int op = scanner.nextInt();
    }

    
}

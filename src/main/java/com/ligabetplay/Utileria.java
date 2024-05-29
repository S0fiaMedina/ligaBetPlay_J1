package com.ligabetplay;

import java.util.ArrayList;
import java.util.Scanner;

public class Utileria {

    // validar que la entrada del usuario sea un numero y este dentro de ciertos
    // rangos
    public static int validarRango(int numMinimo, int numMaximo) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int numero;
        do {
            try {
                System.out.print(" >> Ingrese un número entre " + numMinimo + " y " + numMaximo + ": ");
                numero = sc.nextInt();

                if (numero >= numMinimo && numero <= numMaximo) {
                    return numero;
                } else {
                    System.out.println("Error: El número debe estar dentro del rango especificado.");
                }
            } catch (Exception e) {
                System.out.println("Error: Debes introducir un número entero.");
                sc.next();
            }
        } while (true);
    }

    //  verifica que el equipo local y visitante no sean los mismos 
    public static int verificarEquipo(ArrayList<String> nombreEquipos, int numComparador) {
       
    
        do {
            int num = Utileria.validarRango(1, nombreEquipos.size());
            System.out.println("Ingresa una opcion");
            if (num == numComparador) {
                System.out.println("Error: Esa opcion ya la has escogido antes.");
            } else {
                return num;
            }
        } while (true);

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author NET
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
   public static void imprimirEdadPersona() {
        Scanner leer = new Scanner(System.in);
        String continuar = "Si";
        
        while (continuar.equals("Si")) {
            String nombre = pedirNombre(leer);
            int edad = pedirEdad(leer);
            
            if (edad >= 18) {
                System.out.println(nombre + " es mayor de edad.");
            } else {
                System.out.println(nombre + " es menor de edad.");
            }
            
            System.out.print("¿Desea seguir agregando personas? (Si/No): ");
            continuar = leer.nextLine();
        }
    }
    
    public static String pedirNombre(Scanner scanner) {
        System.out.print("Ingrese el nombre de la persona: ");
        return scanner.nextLine();
    }
    
    public static int pedirEdad(Scanner scanner) {
        System.out.print("Ingrese la edad de la persona: ");
        return scanner.nextInt();
    }
}
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
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = leer.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = leer.nextInt();
        EsMultiplo(num1, num2);
    }
    
    public static void EsMultiplo(int num1, int num2) {
        if (num1 % num2 == 0) {
            System.out.println(num1 + " is true " + num2);
        } else {
            System.out.println(num1 + " is false " + num2);
        }
    }
    
}
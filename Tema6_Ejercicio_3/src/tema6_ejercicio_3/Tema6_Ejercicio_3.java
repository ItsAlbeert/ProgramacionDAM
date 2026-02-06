/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema6_ejercicio_3;

import java.util.Scanner;

/**
 *
 * @author alberto.gonnie
 */
public class Tema6_Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Introduce tu dni");
        String dni=sc.next();
        System.out.println("Introduce tu nombre");
        String titular=sc.next();
        
        CuentaCorriente nueva= new CuentaCorriente(dni, titular);
        
        System.out.println("Introduce la cantidad de dinero a ingresar: ");
        double ingreso=sc.nextDouble();
        
        nueva.ingresarDinero(ingreso);
        nueva.sacarDinero(350);
        nueva.mostrarInfo();
        nueva.sacarDinero(750);
    }
    
}

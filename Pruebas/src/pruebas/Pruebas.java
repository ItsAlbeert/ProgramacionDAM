/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author albert
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        Random num = new Random();
        
        int numeroAleatorio=num.nextInt(10,20);
        
        System.out.println("Numero: "+numeroAleatorio);
        
        
    }
    
}

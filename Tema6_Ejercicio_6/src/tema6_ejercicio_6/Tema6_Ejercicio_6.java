/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema6_ejercicio_6;

/**
 *
 * @author alberto.gonnie
 */
public class Tema6_Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Rectangulo uno=new Rectangulo(0, 0, 5, 5);
        uno.mostrarCoordenadas();
        System.out.println("Perimetro: "+uno.perimetro());
        System.out.println("Area: "+uno.area());
        
        Rectangulo dos=new Rectangulo(7, 9, 2, 3);
        dos.mostrarCoordenadas();
        System.out.println("Perimetro: "+dos.perimetro());
        System.out.println("Area: "+dos.area());
    }
    
}

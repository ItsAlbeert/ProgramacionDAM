/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema6_ejercicio_4;

/**
 *
 * @author albert
 */
public class Tema6_Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        CuentaCorriente constructor1=new CuentaCorriente("70922053N", 30);
        
        constructor1.mostrarInfo();
        
        CuentaCorriente constructur2=new CuentaCorriente("00000999A", "Jesus", 600);
        constructur2.mostrarInfo();
        
        CuentaCorriente constructor3=new CuentaCorriente("76092347J", "Alberto");
        constructor3.mostrarInfo();
    }
    
}

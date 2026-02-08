/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema6_ejercicio_10;

/**
 *
 * @author albert
 */
public class Tema6_Ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cancion can1 = new Cancion();
        
        can1.setArtista("Michael Jackson");
        can1.setTitulo("Thriller");
        can1.setDuracion(4);
        
        Cancion can2 = new Cancion();
        
        can2.setArtista("Eminem");
        can2.setTitulo("Lose Yourself");
        can2.setDuracion(2);
        
        can1.mostrarInfo();
        can2.mostrarInfo();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema6_ejercicio_16;

/**
 *
 * @author albert
 */
public class Tema6_Ejercicio_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Semaforo sem1=new Semaforo(ColorSemaforo.ROJO);
        
        sem1.mostrarEstado();
        
        sem1.setColor(ColorSemaforo.VERDE);
        
        sem1.mostrarEstado();
        
        sem1.setColor(ColorSemaforo.AMARILLO);
        
        sem1.mostrarEstado();
    }
    
}

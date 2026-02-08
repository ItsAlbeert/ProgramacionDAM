/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema6_ejercicio_13;

/**
 *
 * @author albert
 */
public class Tema6_Ejercicio_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Videojuego video1=new Videojuego("Minecraft","Steam",70.0);
        Videojuego video2=new Videojuego("League of Legends","Riot");
        
        video2.setPrecio(0);
        
        
        System.out.print("Numero de juegos: ");
        Videojuego.getContador();
        
        video1.mostrarVideojuego();
        video2.mostrarVideojuego();
        
        video1.aplicarDescuento(20);
        video2.aplicarDescuento(15);
        
        System.out.println("Descuentos aplicados");
        video1.mostrarVideojuego();
        video2.mostrarVideojuego();
    }
    
}

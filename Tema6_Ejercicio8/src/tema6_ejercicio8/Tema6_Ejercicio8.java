/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema6_ejercicio8;

/**
 *
 * @author albert
 */
public class Tema6_Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("=== Creando rectángulo VÁLIDO ===");
        // Rectángulo válido: (2,3) inferior izquierda, (7,8) superior derecha
        Rectangulo rect1 = new Rectangulo(2, 3, 7, 8);
        rect1.mostrarCoordenadas();
        System.out.println("Perímetro: " + rect1.perimetro());
        System.out.println("Área: " + rect1.area());
        
        System.out.println("\n=== Creando rectángulo INVÁLIDO (debería mostrar ERROR) ===");
        // Rectángulo inválido: x1 > x2 (7 > 2)
        Rectangulo rect2 = new Rectangulo(7, 3, 2, 8);
        
        System.out.println("\n=== Creando otro rectángulo INVÁLIDO ===");
        // Rectángulo inválido: y1 > y2 (8 > 3)
        Rectangulo rect3 = new Rectangulo(2, 8, 7, 3);
        
        System.out.println("\n=== Creando otro rectángulo VÁLIDO ===");
        Rectangulo rect4 = new Rectangulo(0, 0, 10, 5);
        rect4.mostrarCoordenadas();
        System.out.println("Perímetro: " + rect4.perimetro());
        System.out.println("Área: " + rect4.area());
    

    }
    
}

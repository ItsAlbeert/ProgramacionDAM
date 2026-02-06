/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6_ejercicio8;

/**
 *
 * @author albert
 */
public class Rectangulo {
    int x1;
    int y1;
    int x2;
    int y2;
    
    // Constructor con validación
    Rectangulo(int x1, int y1, int x2, int y2){
        // Validar que x1 < x2 (izquierda < derecha)
        // Y que y1 < y2 (inferior < superior)
        if ((x1 < x2) && (y1 < y2)) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        } else {
            System.err.println("ERROR al instanciar Rectangulo: las coordenadas no son válidas.");
            System.err.println("La coordenada (x1,y1) debe estar en la esquina inferior izquierda");
            System.err.println("y la coordenada (x2,y2) en la esquina superior derecha.");
        }
    }
    
    void mostrarCoordenadas(){
        System.out.println("Coordenadas del rectángulo: (" + x1 + "," + y1 + ") - (" + x2 + "," + y2 + ")");
    }
    
    int perimetro(){
        return 2 * ((x2 - x1) + (y2 - y1));
    }
    
    int area(){
        return (x2 - x1) * (y2 - y1);
    }
}

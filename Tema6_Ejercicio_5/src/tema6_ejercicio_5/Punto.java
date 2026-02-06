/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6_ejercicio_5;

/**
 *
 * @author alberto.gonnie
 */
public class Punto {
    int x;
    int y;
    
    Punto(int puntox, int puntoy){
        this.y=puntoy;
        this.x=puntox;
    }
    
    void mostrarCoordenadas(){
        System.out.println("Coordenada x "+x+" coordenaday "+y);
    }
}

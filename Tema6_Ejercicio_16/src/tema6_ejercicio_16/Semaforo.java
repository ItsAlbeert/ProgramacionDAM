/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6_ejercicio_16;

/**
 *
 * @author albert
 */
public class Semaforo {
    
    private ColorSemaforo color;

    public Semaforo(ColorSemaforo color) {
        this.color=color;
    }

    public ColorSemaforo getColor() {
        return color;
    }

    public void setColor(ColorSemaforo color) {
        this.color = color;
    }
    
    void mostrarEstado(){
        System.out.println(color);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6_ejercicio_6;

/**
 *
 * @author alberto.gonnie
 */
public class Rectangulo {
    int x1;
    int y1;
    int x2;
    int y2;
    
    Rectangulo(int x1,int y1, int x2, int y2){
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
    }
    
    void mostrarCoordenadas(){
        System.out.println("Coordenadas rectangulo 1: "+x1+" "+y1+" "+x2+" "+y2);
    }
    
    int perimetro(){
        return 2*((x2-x1)+(y2-y1));
    }
    int area(){
        return (x2-x1)*(y2-y1);
    }
    
}

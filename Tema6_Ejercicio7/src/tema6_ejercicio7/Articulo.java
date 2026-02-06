/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6_ejercicio7;

/**
 *
 * @author albert
 */

public class Articulo {
    
    String nombre;
    double precio;
    static final int IVA=21;
    int cuantosQuedan;
    
    Articulo(String nombre, double precio, int cuantosQuedan){
        this.nombre=nombre;
        this.precio=precio;
        this.cuantosQuedan=cuantosQuedan;
        
    }
    
    double calculoIva(){
        return (precio*IVA/100.0)+precio;
    }
    
    void mensaje(){
        System.out.println(nombre+"-Precio: "+precio+"-PVP: "+calculoIva());
    }
}

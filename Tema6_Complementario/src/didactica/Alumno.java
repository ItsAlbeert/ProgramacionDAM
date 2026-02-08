/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package didactica;

/**
 *
 * @author albert
 */
public class Alumno {
    
    public String nombre;
    private double notaMedia;
    String direccion;
    
    Alumno(String nombre, double notaMedia, String direccion){
        this.nombre=nombre;
        this.notaMedia=notaMedia;
        this.direccion=direccion;
    }
}

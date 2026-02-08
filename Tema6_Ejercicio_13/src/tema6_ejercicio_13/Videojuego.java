/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6_ejercicio_13;

/**
 *
 * @author albert
 */
public class Videojuego {
    //atributos de la clase
    private String nombre;
    private String plataforma;
    private double precio;
    static private int contVideojuegos=0;

    //Constructores
    /**
     * Contructor principal
     * @param nombre
     * @param plataforma
     * @param precio 
     */
    public Videojuego(String nombre, String plataforma, double precio) {
        setNombre(nombre);
        setPlataforma(plataforma);
        setPrecio(precio);
        contVideojuegos++;
    }
    public Videojuego(String nombre, String plataforma){
        this(nombre,plataforma,59.99);
    }
    
    //Creacion de setter
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setPlataforma(String plataforma){
        this.plataforma=plataforma;
    }
    public void setPrecio(double precio){
        if(precio>0){
            this.precio=precio;
        }else{
            System.err.println("El precio debe ser mayor que 0");
        }
        
    }
    
    //Creacion de getter
    public String getNombre(){
        return nombre;
    }
    public String getPlataforma(){
        return plataforma;
    }
    public double getPrecio(){
        return precio;
    }
    
    //Muestra el contador
    static void getContador(){
        System.out.println("Total videojuegos creados: "+contVideojuegos);
    }
    
    //Aplica el descuento
    double aplicarDescuento(double porcentaje){
         precio=precio-(precio*porcentaje/100.0);
         return precio;
    }
    
    void mostrarVideojuego(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Plataforma: "+plataforma);
        System.out.println("Precio inicial: "+precio);
    }
}

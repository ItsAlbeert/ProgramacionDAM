/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6_ejercicio_11;

/**
 *
 * @author albert
 */
public class CuentaUsuario {
    
    private String nombreUsuario;
    private String email;
    public boolean activa;
    
    /**
     * Constructor que inicializa los 3 atributos
     * @param nombreUsuario
     * @param email
     * @param activa 
     */
    public CuentaUsuario(String nombreUsuario, String email) {
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.activa = true;
    }
    /**
     * Constructor que da un email por defecto
     * @param nombreUsuario 
     */
    public CuentaUsuario(String nombreUsuario){
        this(nombreUsuario, "sin_email@ejemplo.com");
    }
    
    //Generamos los getter
    public String getUsuario(){
        return nombreUsuario;
    }
    public String getEmail(){
        return email;
    }
    //Generamos los setter
    public void setEmail(String email){
        this.email=email;
    }
    public void setUsuario(String usuario){
        this.nombreUsuario=usuario;
    }
}

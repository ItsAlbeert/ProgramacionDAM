/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6_ejercicio_9;

/**
 *
 * @author albert
 */
public class CuentaCorriente {
    String dni;
    public String titular;
    private double saldo;
    
    public CuentaCorriente(String dni, String titular){
        this.dni=dni;
        this.titular=titular;
        this.saldo=0;
    }
    
    
    
    void ingresarDinero(double ingreso){
        if(ingreso<=0){
            System.err.println("No puedes introducir un saldo negativo");
            return;
        }
        saldo+=ingreso;
        
    }

    void sacarDinero(double sacar){

        if(saldo<sacar){
            System.err.println("No tienes suficiente saldo");
            return;
        }

        saldo-=sacar;
    }

    public void mostrarInfo(){
        System.out.println(titular+" tu cuenta tiene: "+saldo);
    }
}

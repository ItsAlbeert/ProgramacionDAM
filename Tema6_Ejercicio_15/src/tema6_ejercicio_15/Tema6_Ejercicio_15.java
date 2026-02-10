/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema6_ejercicio_15;


/**
 *
 * @author albert
 */
public class Tema6_Ejercicio_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Hora nueva1 = new Hora(0,1439,45); 
        
        nueva1.mostrarHora();
        
        siguientes(15, nueva1);
    }
    
    static void siguientes(int n, Hora nueva1){
        
        for (int i = 1; i <= n; i++) {
            nueva1.setSegundos(nueva1.getSegundos()+1);
            nueva1.mostrarHora();
            
        }
       
    }
}

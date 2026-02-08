/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema6_ejercicio_12;

/**
 *
 * @author albert
 */
public class Tema6_Ejercicio_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        SerieTv serie1=new SerieTv();
        
        SerieTv serie2=new SerieTv("Juego de Tronos",2,false);
        
        serie1.setTemporadas(0);
        
        serie2.sumarTemporada();
        
        //Finaliza la serie 2
        serie2.finalizarSerie();
        //Sumo a la serie finalizada
        serie2.sumarTemporada();
        
        serie1.mostrarSerie();
        serie2.mostrarSerie();
    
    }
    
}

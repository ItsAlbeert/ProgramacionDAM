/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6_ejercicio_12;

/**
 *
 * @author albert
 */
public class SerieTv {
    private String titulo;
    private int temporadas;
    private boolean finalizada;

    
    public SerieTv(String titulo, int temporadas) {
        setTitulo(titulo);
        setTemporadas(temporadas);
        setFinalizada(false);
    }
    public SerieTv(){
        this("Sin Titulo",1);
    }
    
    //Creacion de setter
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public void setTemporadas(int temporada){
        if(temporada>=1){
            this.temporadas=temporada;
        }else{
            System.err.println("Debe haber minimo 1 temporada");
        }
        
    }
    public void setFinalizada(boolean finalizada){
        this.finalizada=finalizada;
    }
    
    //Creacion de getter
    
    public String getTitulo(){
        return titulo;
    }
    public int getTemporada(){
        return temporadas;
    }
    public boolean getFinalizada(){
        return finalizada;
    }
    
    void sumarTemporada(){
        if(finalizada){
            System.err.println("No se pueden añadir mas temporadas, serie finalizada.");
        }else{
            temporadas++;
        }
    }
    
    void finalizarSerie(){
        finalizada=true;
    }
    
    void mostrarSerie(){
        System.out.println("Serie: "+titulo);
        System.out.println("Numero de temporadas: "+temporadas);
        System.out.println("Finalizada: "+finalizada);
    }
}

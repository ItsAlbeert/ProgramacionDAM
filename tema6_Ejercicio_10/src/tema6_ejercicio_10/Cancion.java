/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6_ejercicio_10;

/**
 *
 * @author albert
 */
public class Cancion {
    
    private String titulo;
    private String artista;
    public int seg;
    
    
    Cancion(){        
        this.titulo="Desconocido";
        this.artista="Desconocido";
        this.seg=0;
    }
    
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    
    public String getArtista(){
        return artista;
    }
    
    public void setArtista(String artista){
        this.artista=artista;
    }
    
    public int getDuracion(){
        return seg;
    }
    
    public void setDuracion(int seg){
        if(seg>3){
            this.seg=seg;
        }else{
            System.err.println("Tiene que durar mas de 3 segundos.");
        }
    }
    
    public void mostrarInfo(){
        System.out.println("Nombre artista: "+artista);
        System.out.println("Titulo cancion: "+titulo);
        System.out.println("Duracion cancion: "+seg);
    }
}

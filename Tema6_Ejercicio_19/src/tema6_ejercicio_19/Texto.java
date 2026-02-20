/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6_ejercicio_19;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author albert
 */
public class Texto {

    private int longitud;
    private String caracteres;
    private LocalDate fechaCreacion;
    private LocalDateTime ultimaModificacion;

    /**
     *
     * @param longitud
     */
    public Texto(int longitud) {
        this.longitud = longitud;
        this.caracteres = "";

        this.fechaCreacion = LocalDate.now();
        this.ultimaModificacion = LocalDateTime.now();
    }

    //Getter y setter
    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getCaracteres() {
        return caracteres;
    }

    public void setCaracteres(String caracteres) {
        this.caracteres = caracteres;
    }
    //Fin de getter y setter

    boolean esEspacio(String palabra) {

        return caracteres.length() + palabra.length() <= longitud;
    }

    void añadirCaracterPrincipio(char caracterm) {

        if ((caracteres.length() + 1) > longitud) {
            System.err.println("No puedes añadir nada mas.");
        } else {
            caracteres = caracterm + caracteres;
            ultimaModificacion = LocalDateTime.now();
        }

    }

    void añadirCaracterFinal(char caracterm) {
        if ((caracteres.length() + 1) > longitud) {
            System.err.println("No puedes añadir nada mas.");
        } else {
            caracteres = caracteres + caracterm;
            ultimaModificacion = LocalDateTime.now();
        }
    }

    void añadirCadenaFinal(String palabra) {

        if (esEspacio(palabra)) {
            caracteres = caracteres + palabra;
            ultimaModificacion = LocalDateTime.now();
        } else {
            System.err.println("No hay espacio para añadir la cadena: " + palabra);
        }
    }

    void añadirCadenaPrincipio(String palabra) {

        if (esEspacio(palabra)) {
            caracteres = palabra + caracteres;
            ultimaModificacion = LocalDateTime.now();
        } else {
            System.err.println("No hay espacio para añadir la cadena: " + palabra);
        }
    }

    int contadorVocales() {
        int numVocales = 0;
        String copiaCaracteres = caracteres.toLowerCase();

        for (int i = 0; i < caracteres.length(); i++) {

            char letra = copiaCaracteres.charAt(i);

            switch (letra) {
                case 'a', 'e', 'i', 'o', 'u' ->
                    numVocales++;
            }
        }

        return numVocales;
    }
    
    void mostrarInformacion(){
        System.out.println("La frase actual es: "+caracteres);
        System.out.println("Longitud: "+longitud);
        System.out.println("Espacio disponible: "+(longitud-caracteres.length()));
        System.out.println("Fecha de creacion: "+fechaCreacion);
        System.out.println("Fecha de ultima modificacion: "+ultimaModificacion);
    }
}

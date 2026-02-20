/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6_ejercicio_20;

import java.util.Random;
import static tema6_ejercicio_20.TipoTiro.EFECTO;
import static tema6_ejercicio_20.TipoTiro.NORMAL;
import static tema6_ejercicio_20.TipoTiro.POTENTE;


/**
 *
 * @author albert
 */
public class Jugador {

    private String nombre;
    private int nivelPrecision;
    private TipoTiro tiro;
    
    Random numRandom=new Random();
    
    public Jugador(String nombre, int nivelPrecision) {
        this.nombre = nombre;
        this.nivelPrecision = nivelPrecision;
    }
    
    int lanzamiento(int introduceTiro) {
        int BolosDerribados = 0;

        //Nivel de precision Muy baja 0-2, baja 3-4, media-5-6, alta 7-8, muy alta 9-10
        switch (tiro) {
            case EFECTO:
                BolosDerribados=numRandom.nextInt(calculadorProbabilidades());
                break;
            case NORMAL:
                break;
            case POTENTE:
                break;
            default:
                throw new AssertionError();
        }
        return BolosDerribados;
    }
    
    //En funcion de la precision devuelve un numero de los bolos que es probable que tire.
    int calculadorProbabilidades() {
        int probabilidad=0;
        
        switch (nivelPrecision) {
            case 0 -> probabilidad=numRandom.nextInt(1);
            case 1,2 -> probabilidad=numRandom.nextInt(2,4);
            case 3,4 -> probabilidad=numRandom.nextInt(3,5);
            case 5,6 -> probabilidad=numRandom.nextInt(4,6);
            case 7,8 -> probabilidad=numRandom.nextInt(7,8);
            case 9,10 ->probabilidad=numRandom.nextInt(9,10);
        }
        return probabilidad;
    }

    int contadorTiradas() {

    }

    //Metodo que determina el tipo de tiro
    void tipoTirada(int num) {
        //Primero seleccionamos el tipo de tiro

        switch (num) {
            case 1:
                tiro = TipoTiro.NORMAL;
                break;
            case 2:
                tiro = TipoTiro.EFECTO;
                break;
            case 3:
                tiro = TipoTiro.POTENTE;
                break;
            default:
                throw new AssertionError();
        }
    }

}

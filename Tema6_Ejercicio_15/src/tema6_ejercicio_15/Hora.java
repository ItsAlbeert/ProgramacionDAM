/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6_ejercicio_15;

/**
 *
 * @author albert
 */
public class Hora {

    private int hora;
    private int minuto;
    private int segundos;

    public Hora(int hora, int minuto, int segundos) {
        setHora(hora);
        setMinuto(minuto);
        setSegundos(segundos);
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora == 24) {
            this.hora = 0;
        } else {
            this.hora = hora;
        }

    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto > 0) {
            if (minuto >= 60) {
                this.minuto = minuto % 60;
                setHora(this.hora += minuto / 60);
            } else {
                this.minuto = minuto;
            }
        }

    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {

        if (segundos > 0) {
            if (segundos >= 60) {
                this.segundos = segundos % 60;
                setMinuto(this.minuto += segundos / 60);

            } else {
                this.segundos = segundos;
            }

        } else {
            System.err.println("No puede ser negativo.");
        }
    }

    //Metodo para mostrar hora
    public void mostrarHora() {
        System.out.printf("La hora es: %2d:%2d:%2d\n", this.hora, this.minuto, this.segundos);
    }

}

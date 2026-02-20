/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6_ejercicio_17;

/**
 *
 * @author albert
 */
public class Pedido {
    int id;
    EstadoPedido estado;

    public Pedido(int id) {
        this.id = id;
        this.estado = EstadoPedido.PENDIENTE;
    }
    
    
    void cambiarEstado(int tipo){
        
        switch (tipo) {
            case 1:
                estado=EstadoPedido.ENVIADO;
                break;
                case 2:
                estado=EstadoPedido.PENDIENTE;
                break;
                case 3:
                estado=EstadoPedido.CANCELADO;
                break;
                case 4:
                estado=EstadoPedido.ENTREGADO;
                break;
            default:
                System.out.println("Estado no valido");
        }
    }
    
    void mostrarEstado(){
        
        switch (estado) {
            case ENVIADO:
                System.out.println("El pedido ha sido enviado");
                break;
            case ENTREGADO:
                System.out.println("El pedido ha sido entregado");
                break;
            case CANCELADO:
                System.out.println("El pedido ha sido cancelado");
                break;
            case PENDIENTE:
                System.out.println("El pedido esta pendiente de envio");
                break;
            default:
                throw new AssertionError();
        }
        
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaexamen2;

/**
 *
 * @author Cristofer
 */
public class NodePila {
    private Platos valor;
    private NodePila siguiente;
    
    //constructor para inicializar

    public NodePila() {
        this.valor = null;
        this.siguiente = null;
    }

    public Platos getValor() {
        return valor;
    }

    public void setValor(Platos valor) {
        this.valor = valor;
    }

    public NodePila getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodePila siguiente) {
        this.siguiente = siguiente;
    }

   
    
}

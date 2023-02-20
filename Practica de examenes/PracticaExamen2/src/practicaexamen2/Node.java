/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaexamen2;

/**
 *
 * @author Cristofer
 */
public class Node {
    private Ordenes dato;
    private Node atras;
    
    //constructor para inicializar

    public Node(Ordenes dato) {
        this.dato = dato;
        this.atras = null;
    }

    public Ordenes getDato() {
        return dato;
    }

    public void setDato(Ordenes dato) {
        this.dato = dato;
    }

    public Node getAtras() {
        return atras;
    }

    public void setAtras(Node atras) {
        this.atras = atras;
    }

    

    
    
   
    
    
}

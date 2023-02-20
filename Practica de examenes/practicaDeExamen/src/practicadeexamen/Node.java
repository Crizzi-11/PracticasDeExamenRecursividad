
package practicadeexamen;

/**
 *
 * @author Cristofer
 */
public class Node {
    private Archivos valor;
    private Node siguiente;
    
    //constructor para inicializar

    public Node() {
        this.valor = null;
        this.siguiente = null;
    }

    public Archivos getValor() {
        return valor;
    }

    public void setValor(Archivos valor) {
        this.valor = valor;
    }

    public Node getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Node siguiente) {
        this.siguiente = siguiente;
    }

   
    
}


package practicaexamen4;

/**
 *
 * @author Cristofer
 */
public class Node {
     private Atiendas dato;
    private Node atras;
    
    
    //constructor para inicializar

    public Node(Atiendas dato) {
        this.dato = dato;
        this.atras = null;
        
    }

    public Atiendas getDato() {
        return dato;
    }

    public void setDato(Atiendas dato) {
        this.dato = dato;
    }

    public Node getAtras() {
        return atras;
    }

    public void setAtras(Node atras) {
        this.atras = atras;
    }

  

   
}


package practicaexamen2;

/**
 *
 * @author Cristofer
 */
public class Cola {
    private Node frente;
    private Node ultimo;
    private int largo;
    
    public Cola(){
    this.frente = null;
    this.ultimo = null;
    this.largo = 0;
    }
    
    public void imprimeTercero(){
        System.out.println("El cuatro  es: "+ frente.getAtras().getAtras().getAtras()
        .getDato().getNombre());
    }
    
    public void encola(Node nuevoNode){
        if (frente == null) {
            frente = nuevoNode;
            ultimo = nuevoNode;
        }else if (nuevoNode.getDato().isDiscapacidad()) {
            nuevoNode.setAtras(frente);
            frente = nuevoNode;
            
        }
        
        else{
            ultimo.setAtras(nuevoNode);
            ultimo = nuevoNode;
        }
        largo++;
    }
    
    public Node atiende(){
    Node aux = frente;
        if (frente!=null) {
            frente= frente.getAtras();
            aux.setAtras(null);
            largo--;
        }
        return aux;
    }
    
    public boolean encuentra(Ordenes referencia){
        if(frente!= null){
            if (ultimo.getDato().getId().equals(referencia.getId())) 
                return true;
            else{
                   Node aux = frente;
                   while (aux!=null) {
                        if(aux.getDato().getId().equals(referencia.getId())){
                            return true;
                        }
                        aux=aux.getAtras();
                    }
                }
        }
        return false;
    }
    

    public String imprimir(){
    String s="";
    Node aux = frente;
        while (aux!=null) {
            s+=aux.getDato().getId()+"\n";
            aux=aux.getAtras();
        }
        return s;
    }
    
}

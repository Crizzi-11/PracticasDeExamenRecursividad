
package practicadeexamen;

/**
 *
 * @author Cristofer
 */
public class Main {


    public static void main(String[] args) {
        Pila pila =new Pila();
        pila.push(new Archivos("001",400,false));
        pila.push(new Archivos(
                "002",200,false));
        pila.push(new Archivos(
                "003",600,false));
        pila.push(new Archivos(
                "004",700,true));
        pila.listar();
        
        System.out.println("Clasificados #:"+pila.getClasificado());
        System.out.println("No Clasificados #:"+(pila.tamanio() - 
                pila.getClasificado()));
        
        
        
    }
    
}

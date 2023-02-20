package practicaexamen2;



/**
 *
 * @author Cristofer
 */
public class Main {

    public static void main(String[] args) {
        
       
        
        Cola cola = new Cola();
        Pila pila = new Pila();

        cola.encola(new Node(new Ordenes("001", "Juan",
       "604692161", false, "Hambuerguesa", 4500,
                new Platos("P001", false))));

        cola.encola(new Node(new Ordenes("002", "Pepe",
       "60469", false, "Empanada", 1500,
                new Platos("P002", true))));

        cola.encola(new Node(new Ordenes("003", "Marcos",
                "6046", true, "pizza", 4500,
                new Platos("P003", false))));
        
        
        System.out.println(cola.imprimir());
        System.out.println(cola.encuentra());
        
        System.out.println("------------------------");
        
        


        Ordenes ordenAtiende1 = cola.atiende().getDato();
        Ordenes ordenAtiende2 = cola.atiende().getDato();
        Ordenes ordenAtiende3 = cola.atiende().getDato();
        pila.push(ordenAtiende1.getPlatos());
        pila.push(ordenAtiende2.getPlatos());
        pila.push(ordenAtiende3.getPlatos());
        
        pila.listar();

         
                
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaexamen4;

/**
 *
 * @author Cristofer
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cola cola = new Cola();
        cola.encola(new Node(new Atiendas("600", "Hector",
                false)));
        cola.encola(new Node(new Atiendas("400", "Ana",
                false)));
        cola.encola(new Node(new Atiendas("100", "Pedro",
                true)));
        
        
        
        System.out.println(cola.imprimir());
//        System.out.println(cola.encuentra(new Atiendas("100",
//                "Pedro", true)));
        System.out.println(cola.encuentra(new Identificador("600")));
        
        
        
        

        
        
        
        
        
    }
    
}

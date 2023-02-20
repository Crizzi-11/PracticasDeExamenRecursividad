/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaexamen4;

/**
 *
 * @author Cristofer
 */
public class Atiendas {
    private String id;
    private String nombre;
    private boolean discapacidad;

    public Atiendas(String id, String nombre,
                    boolean discapacidad) {
        this.id = id;
        this.nombre = nombre;
        this.discapacidad = discapacidad;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isDiscapacidad() {
        return discapacidad;
    }
    
}

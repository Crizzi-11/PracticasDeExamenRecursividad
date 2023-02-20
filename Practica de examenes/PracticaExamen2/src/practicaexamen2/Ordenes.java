
package practicaexamen2;

/**
 *
 * @author Cristofer
 */
public class Ordenes {
    private String id;
    private String nombre;
    private String cedula;
    private boolean discapacidad;
    private String producto;
    private double total;
    private Platos platos;

    public Ordenes(String id, String nombre, String cedula,
                   boolean discapacidad, String producto, 
                   double total, Platos platos) {
        this.id = id;
        this.nombre = nombre;
        this.cedula = cedula;
        this.discapacidad = discapacidad;
        this.producto = producto;
        this.total = total;
        this.platos = platos;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public boolean isDiscapacidad() {
        return discapacidad;
    }

    public String getProducto() {
        return producto;
    }

    public double getTotal() {
        return total;
    }

    public Platos getPlatos() {
        return platos;
    }



}

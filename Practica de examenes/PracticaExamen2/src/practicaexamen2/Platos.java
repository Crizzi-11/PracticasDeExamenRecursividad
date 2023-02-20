
package practicaexamen2;

/**
 *
 * @author Cristofer
 */
public class Platos {
    private String id;
    private boolean cubiertos;

    public Platos(String id, boolean cubiertos) {
        this.id = id;
        this.cubiertos = cubiertos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isCubiertos() {
        return cubiertos;
    }

    public void setCubiertos(boolean cubiertos) {
        this.cubiertos = cubiertos;
    }
    
    
    
    
}

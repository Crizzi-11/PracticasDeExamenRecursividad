
package practicadeexamen;

/**
 *
 * @author Cristofer
 */
public class Archivos {
    private  String numeroDocumentoAsociado;
    private int cantpaginas;
    private boolean clasificado;

    public Archivos(String numeroDocumentoAsociado, int cantpaginas,
        boolean clasificado) {
        
        this.numeroDocumentoAsociado = numeroDocumentoAsociado;
        this.cantpaginas = cantpaginas;
        this.clasificado = clasificado;
        
        
    }

    public String getNumeroDocumentoAsociado() {
        return numeroDocumentoAsociado;
    }

    public int getCantpaginas() {
        return cantpaginas;
    }

    public boolean isClasificado() {
        return clasificado;
    }
    
}

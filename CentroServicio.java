
package activitysemana6erick;

/**
 *
 * @author DANIEL BARRANTES
 */
public class CentroServicio {
    
    private String tipo;
    private String nombreC;

    public String getTipo() {
        return tipo;
    }

    public String getNombreC() {
        return nombreC;
    }

    public CentroServicio(String tipo, String nombreC) {
        this.tipo = tipo;
        this.nombreC = nombreC;
    }
}
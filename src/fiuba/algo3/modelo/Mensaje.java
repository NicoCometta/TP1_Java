package fiuba.algo3.modelo;

/**
 * Created by nico on 13/06/17.
 */
public abstract class Mensaje {

    private String emisor;
    private String receptor;
    private String contenido;

    //region Métodos getters
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }
    //endregion

    //region Métodos getters
    public String getEmisor() {
        return this.emisor;
    }

    public String getContenido() {
        return this.contenido;
    }
    //endregion

    //region Métodos Públicos Abtractos
    public abstract int enviado();

    public abstract int recibido();
    //endregion
}



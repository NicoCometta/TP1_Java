package fiuba.algo3;

/**
 * Created by nico on 13/06/17.
 */
public abstract class Mensaje {

    private String emisor;
    private String receptor;
    private String contenido;

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    public abstract int enviado();

    public abstract int recibido();
}



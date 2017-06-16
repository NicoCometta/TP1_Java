package fiuba.algo3.modelo;

/**
 * Created by nico on 13/06/17.
 */
public class MensajeRecibido extends Mensaje {

    //region Constructor
    public MensajeRecibido(String yoUsuario, String unEmisor, String unContenido) {
        this.setReceptor(yoUsuario);
        this.setEmisor(unEmisor);
        this.setContenido(unContenido);
    }
    //endregion

    //region Métodos Públicos
    @java.lang.Override
    public int enviado() {
        return 0;
    }

    @java.lang.Override
    public int recibido() {
        return 1;
    }
    //endregion
}

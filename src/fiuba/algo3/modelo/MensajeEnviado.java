package fiuba.algo3.modelo;

/**
 * Created by nico on 13/06/17.
 */
public class MensajeEnviado extends Mensaje {

    //region Constructor
    public MensajeEnviado(String yoUsuario, String unEmisor, String unContenido) {
        this.setReceptor(yoUsuario);
        this.setEmisor(unEmisor);
        this.setContenido(unContenido);
    }
    //endregion

    //region Métodos Públicos
    @java.lang.Override
    public int enviado() {
        return 1;
    }

    @java.lang.Override
    public int recibido() {
        return 0;
    }
    //endregion
}

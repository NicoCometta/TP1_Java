package fiuba.algo3;

/**
 * Created by nico on 13/06/17.
 */
public class MensajeRecibido extends Mensaje {
    public MensajeRecibido(String yoUsuario, String unEmisor, String unContenido) {
        this.setReceptor(yoUsuario);
        this.setEmisor(unEmisor);
        this.setContenido(unContenido);
    }

    @java.lang.Override
    public int enviado() {
        return 0;
    }

    @java.lang.Override
    public int recibido() {
        return 1;
    }
}

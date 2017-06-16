package fiuba.algo3;

import java.util.ArrayList;

/**
 * Created by nico on 13/06/17.
 */
public class Conversacion {

    //region Atributos
    private ArrayList<Mensaje> mensajes = new ArrayList<Mensaje>();
    //endregion

    //region Métodos Públicos
    public String get(int unMensaje){
        //return "Yo: Te dije que si...";
        return this.obtenerMensajeArmado(unMensaje);
    }

    public int cantidadMensajes() {
        return this.mensajes.size();
    }

    public int cantidadMensajesEnviados() {
        int cantidadRetorno = 0;

        for (Mensaje unMensaje: this.mensajes) {
            cantidadRetorno += unMensaje.enviado();
        }

        return cantidadRetorno;
    }

    public int cantidadMensajesRecibidos() {
        int cantidadRetorno = 0;

        for (Mensaje unMensaje: this.mensajes) {
            cantidadRetorno += unMensaje.recibido();
        }

        return cantidadRetorno;
    }

    public void agregarMensaje(Mensaje nuevoMensaje) {
        this.mensajes.add(nuevoMensaje);
    }

    public void borrarMensajes() {
        this.mensajes.clear();
    }
    //endregion

    //region Métodos Privados
    private String obtenerMensajeArmado(int unMensaje) {
        if (this.cantidadMensajes() == 0) throw new Exception();

        int posicionMensaje = unMensaje-1;

        Mensaje esteMensaje = this.mensajes.get(posicionMensaje);

        return esteMensaje.getEmisor().toString() + ": " + esteMensaje.getContenido().toString();
    }
    //endregion
}

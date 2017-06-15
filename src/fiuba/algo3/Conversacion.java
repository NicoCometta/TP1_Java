package fiuba.algo3;

import java.util.ArrayList;

/**
 * Created by nico on 13/06/17.
 */
public class Conversacion {

    private ArrayList<Mensaje> mensajes = new ArrayList<Mensaje>();

    public String get(int unMensaje){
        //Devuelve el mensaje armado
        return "Yo: Te dije que si...";
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
}

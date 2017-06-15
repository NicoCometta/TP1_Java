package fiuba.algo3;

import java.util.ArrayList;

/**
 * Created by nico on 13/06/17.
 */
public class Grupo {

    private String nombre;
    private ArrayList<Contacto> miembros;
    private Conversacion conversacion;

    public Grupo(String nombreGrupo) {
        this.nombre = nombreGrupo;

        miembros = new ArrayList<Contacto>();
    }

    public void agregarContacto(String nombreContacto) {
        Contacto nuevoMiembro = new Contacto(nombreContacto);

        miembros.add(nuevoMiembro);
    }

    public int cantidadMensajes() {
        return this.conversacion.cantidadMensajes();
    }

    public int cantidadMiembros() {
        return  this.miembros.size();
    }

    public boolean esGrupo(String nombreGrupo) {
        return (this.nombre == nombreGrupo);
    }

    public Conversacion obtenerConversacion() {
        return this.conversacion;
    }

    public int cantidadMensajesEnviadosAGrupo() {
        return this.conversacion.cantidadMensajesEnviados();
    }

    public void borrarMensajes() {
        this.conversacion.borrarMensajes();
    }

    public int cantidadMensajesRecibidosDeGrupo() {
        return this.conversacion.cantidadMensajesRecibidos();
    }

    public void recibirMensaje(String contenidoMensaje, String miembroEmisor) {
        MensajeRecibido nuevoMensaje = new MensajeRecibido(this.nombre,miembroEmisor,contenidoMensaje);

        this.conversacion.agregarMensaje(nuevoMensaje);
    }
}

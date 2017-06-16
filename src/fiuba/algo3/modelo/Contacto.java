package fiuba.algo3;

/**
 * Created by nico on 13/06/17.
 */
public class Contacto {

    //region Atributos
    private String nombre;
    private Conversacion conversacion;
    //end region

    //region Constructores
    public Contacto(String unNombre){
        this.nombre = unNombre;
        //conversacion = new Conversacion();
    }
    //end region

    //region Métodos Públicos
    public int cantidadMensajes() {
        return this.conversacion.cantidadMensajes();
    }

    public int cantidadMensajesEnviadosAContacto() {
        return this.conversacion.cantidadMensajesEnviados();
    }

    public boolean esContacto(String unNombreContacto) {
        return (this.nombre == unNombreContacto);
    }

    public void recibirMensaje(String unContenido) {
        MensajeRecibido nuevoMensaje = new MensajeRecibido("Yo",this.nombre,unContenido);

        this.conversacion.agregarMensaje(nuevoMensaje);
    }

    public void borrarMensajes() {
        this.conversacion.borrarMensajes();
    }

    public int cantidadMensajesRecibidosDeContacto() {
        return this.conversacion.cantidadMensajesRecibidos();
    }
    //end region
}

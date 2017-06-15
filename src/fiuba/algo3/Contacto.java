package fiuba.algo3;

/**
 * Created by nico on 13/06/17.
 */
public class Contacto {

    private String nombre;
    private Conversacion conversacion;

    public Contacto(String unNombre){
        this.nombre = unNombre;
        //conversacion = new Conversacion();
    }

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
    /*
    public void Nombre(String unNombreContacto) {
        nombre = unNombreContacto;
    }


    public String Nombre(){
        return nombre;
    }
    */
}

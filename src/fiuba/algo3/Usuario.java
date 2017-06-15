package fiuba.algo3;

/**
 * Created by nico on 13/06/17.
 */
import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private ArrayList<Contacto> contactos;
    private ArrayList<Grupo> grupos;

    public Usuario(String unNombre){
        this.nombre = unNombre;
        contactos = new ArrayList<Contacto>();
        grupos = new ArrayList<Grupo>();
    }

    public void agregarContacto(String unNombreContacto) {
        Contacto nuevoContacto = new Contacto(unNombreContacto);

        contactos.add(nuevoContacto);
    }

    public int cantidadDeContactos() {
        return this.contactos.size();
    }

    public String getNombre() {
        return nombre;
    }

    public void crearGrupo(String nombreGrupo) {
        Grupo nuevoGrupo = new Grupo(nombreGrupo);

        //deberia no haber dos grupos iguales: manejar Excepcion
        this.grupos.add(nuevoGrupo);
    }

    public int cantidadDeChatsIndividuales() {
        return this.calcularChatsIndividuales();
    }

    private int calcularChatsIndividuales() {
        int cantidadRetorno = 0;

        for (Grupo cadaGrupo: this.grupos) {
            if (cadaGrupo.cantidadMensajes()>0)
                cantidadRetorno ++;
        }
        return cantidadRetorno;
    }

    public int cantidadDeChatsGrupales() {
        int cantidadRetorno = 0;

        for (Contacto cadaContacto: this.contactos) {
            if (cadaContacto.cantidadMensajes()>0)
                cantidadRetorno ++;
        }
        return cantidadRetorno;
    }

    public int cantidadTotalmensajesEnviados() {
        return (this.cantidadMensajesEnviadosAContactos() + this.cantidadMensajesEnviadosAGrupos());
    }

    private int cantidadMensajesEnviadosAContactos() {
        int cantidadRetorno =0;

        for (Contacto cadaContacto: this.contactos) {
            cantidadRetorno += cadaContacto.cantidadMensajesEnviadosAContacto();
        }
        return cantidadRetorno;
    }

    private int cantidadMensajesEnviadosAGrupos() {
        int cantidadRetorno =0;

        for (Grupo cadaGrupo: this.grupos) {
            cantidadRetorno += cadaGrupo.cantidadMensajesEnviadosAGrupo();
        }
        return cantidadRetorno;
    }

    public int cantidadDeGrupos() {
        return this.grupos.size();
    }

    public boolean esContacto(String unNombreContacto) {
        for (Contacto cadaContacto: this.contactos) {
            if (cadaContacto.esContacto(unNombreContacto))
                return true;
        }

        return false;
    }

    public int cantidadMiembrosEnGrupo(String nombreGrupo) {
        int cantidadRetorno = 0;
        try {
            Grupo esteGrupo = this.obtenerGrupo(nombreGrupo);
            cantidadRetorno = esteGrupo.cantidadMiembros();
        }catch (Exception e){
            e.getMessage(); //momentaneo
        }

        return cantidadRetorno;
    }

    private Grupo obtenerGrupo(String nombreGrupo){
        for (Grupo cadaGrupo: this.grupos) {
            if (cadaGrupo.esGrupo(nombreGrupo))
                return cadaGrupo;
        }
        //throw new Exception("Grupos inexistente: Verifique nombre del Grupo.");
        return null; //momentaneo
    }

    public Conversacion obtenerConversacionConGrupo(String nombreGrupo) {
        return (this.obtenerGrupo(nombreGrupo)).obtenerConversacion();
    }

    public boolean existeGrupo(String nombreGrupo) {
        for (Grupo cadaGrupo: this.grupos) {
            if (cadaGrupo.esGrupo(nombreGrupo))
                return true;
        }

        return false;
    }

    public void recibirMensajeDe(String unEmisor, String unContenido) {
        //if (!this.esContacto(unEmisor))
        //    throw new Exception("No se verifica Contacto");
        Contacto esteContacto = this.obtenerContacto(unEmisor);

        esteContacto.recibirMensaje(unContenido);
    }

    private Contacto obtenerContacto(String unEmisor) {
        for (Contacto cadaContacto: this.contactos) {
            if (cadaContacto.esContacto(unEmisor))
                return cadaContacto;
        }
        //throw new Exception("Grupos inexistente: Verifique nombre del Grupo.");
        return null; //momentaneo
    }

    public int cantidadTotalMensajesRecibidos() {
        return (this.cantidadMensajesRecibidosDeContactos() + this.cantidadMensajesRecibidosDeGrupos());
    }

    private int cantidadMensajesRecibidosDeGrupos() {
        int cantidadRetorno =0;

        for (Grupo cadaGrupo: this.grupos) {
            cantidadRetorno += cadaGrupo.cantidadMensajesRecibidosDeGrupo();
        }
        return cantidadRetorno;
    }

    private int cantidadMensajesRecibidosDeContactos() {
        int cantidadRetorno =0;

        for (Contacto cadaContacto: this.contactos) {
            cantidadRetorno += cadaContacto.cantidadMensajesRecibidosDeContacto();
        }
        return cantidadRetorno;
    }

    public void borrarMensajesDelContacto(String nombreContacto) {
        Contacto unContacto = this.obtenerContacto(nombreContacto);
        unContacto.borrarMensajes();
    }

    public void borrarMensajesDelGrupo(String nombreGrupo) {
        Grupo unGrupo = this.obtenerGrupo(nombreGrupo);
        unGrupo.borrarMensajes();
    }

    public int cantidadMensajesDe(String unContacto) {
        return 0;
    }

    public int cantidadMensajesEnviadosA(String unContacto) {

        Contacto esteContacto = this.obtenerContacto(unContacto);

        return esteContacto.cantidadMensajesEnviadosAContacto();
    }

    public int cantidadDeMensajesRecibidosDelGrupo(String nombreGrupo) {
        Grupo esteGrupo = this.obtenerGrupo(nombreGrupo);

        return esteGrupo.cantidadMensajesRecibidosDeGrupo();
    }

    public int cantidadDeMensajesEnviadosAlGrupo(String nombreGrupo) {
        Grupo esteGrupo = this.obtenerGrupo(nombreGrupo);

        return esteGrupo.cantidadMensajesEnviadosAGrupo();
    }

    public void recibirMensajeDeGrupo(String nombreGrupo, String miembroEmisor, String contenidoMensaje) {
        this.grupoRecibeMensaje(nombreGrupo,contenidoMensaje,miembroEmisor);
    }

    public void enviarMensajeDeGrupo(String nombreGrupo, String contenidoMensaje) {
        this.grupoRecibeMensaje(nombreGrupo,contenidoMensaje,this.nombre);
    }

    private void grupoRecibeMensaje(String nombreGrupo, String contenidoMensaje, String miembroEmisor) {
        //if (!this.esContacto(unEmisor))
        //    throw new Exception("No se verifica Contacto");
        Grupo esteGrupo = this.obtenerGrupo(nombreGrupo);

        esteGrupo.recibirMensaje(contenidoMensaje,miembroEmisor);
    }
}

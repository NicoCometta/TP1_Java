package fiuba.algo3;

/**
 * Created by nico on 13/06/17.
 */
public class AlgoChat {

    //region Atributos
    private Usuario usuario;
    //endregion

    //region Constructor
    public AlgoChat (String nombreUsuario){
        usuario = this.nuevoUsuario(nombreUsuario);
    }
    //endregion

    //region Métodos Públicos
    public int cantidadDeChatsIndividuales() {
        return this.usuario.cantidadDeChatsIndividuales();
    }

    public int cantidadDeContactos() {
        return this.usuario.cantidadDeContactos();
    }

    public int cantidadDeChatsGrupales() {
        return this.usuario.cantidadDeChatsGrupales();
    }

    public int cantidadDeGrupos() {
        return this.usuario.cantidadDeGrupos();
    }

    public int cantidadDeMensajesEnviados() {
        return this.usuario.cantidadTotalmensajesEnviados();
    }

    public String nombreUsuario() {
        return usuario.getNombre();
    }

    public void agregarContacto(String unNombreContacto) {
        usuario.agregarContacto(unNombreContacto);
    }

    public boolean existeContacto(String unNombreContacto) {
        return this.usuario.esContacto(unNombreContacto);
    }

    public void recibirMensajeDe(String unEmisor, String unContenido) {
        this.usuario.recibirMensajeDe(unEmisor, unContenido);
    }

    public int cantidadTotalMensajesRecibidos() {

        return this.usuario.cantidadTotalMensajesRecibidos();
    }

    public int cantidadMensajesDe(String unContacto){
        return this.usuario.cantidadMensajesDe(unContacto);
    }

    public void enviarMensajeA(String unContacto, String unContenido) {
        this.usuario.enviarMensajeA(unContacto, unContenido);
    }

    public int cantidadTotalMensajesEnviados() {
        return this.usuario.cantidadTotalmensajesEnviados();
    }

    public int cantidadMensajesEnviadosA(String unContacto) {

        return this.usuario.cantidadMensajesEnviadosA(unContacto);
    }

    public Conversacion obtenerConversacionCon(String unContacto) {
        Conversacion unaConversacion = new Conversacion();
        return unaConversacion;
    }

    public void crearGrupo(String nombreGrupo) {
        this.usuario.crearGrupo(nombreGrupo);
    }

    public void agregarContactoAGrupo(String unContacto, String nombreGrupo) {
        Grupo unGrupo = this.grupo(nombreGrupo);

        unGrupo.agregarContacto(unContacto);
    }

    public int cantidadMiembrosEnGrupo(String nombreGrupo) {
        return  this.usuario.cantidadMiembrosEnGrupo(nombreGrupo);
    }

    public boolean existeGrupo(String nombreGrupo) {
        return this.usuario.existeGrupo(nombreGrupo);
    }

    public void recibirMensajeDeGrupo(String nombreGrupo, String miembroEmisor, String contenidoMensaje) {
        this.usuario.recibirMensajeDeGrupo(nombreGrupo, miembroEmisor, contenidoMensaje);
    }

    public void enviarMensajeAGrupo(String nombreGrupo, String contenidoMensaje) {
        this.usuario.enviarMensajeDeGrupo(nombreGrupo, contenidoMensaje);
    }

    public int cantidadMensajesRecibidosDelGrupo(String nombreGrupo) {
        return this.usuario.cantidadDeMensajesRecibidosDelGrupo(nombreGrupo);
    }

    public int cantidadMensajesEnviadosAlGrupo(String nombreGrupo) {
        return this.usuario.cantidadDeMensajesEnviadosAlGrupo(nombreGrupo);
    }

    public Conversacion obtenerConversacionConGrupo(String nombreGrupo) {
        return this.usuario.obtenerConversacionConGrupo(nombreGrupo);
    }

    public void borrarMensajesDelContacto(String nombreContacto) {
        this.usuario.borrarMensajesDelContacto(nombreContacto);
    }

    public void borrarMensajesDelGrupo(String nombreGrupo) {
        this.usuario.borrarMensajesDelGrupo(nombreGrupo);
    }
    //endregion

    //region Métodos Privados
    private Usuario nuevoUsuario(String nombreUsuario) {
        Usuario unUsuario = new Usuario(nombreUsuario);
        return unUsuario;
    }

    private Grupo grupo(String nombreGrupo) {
        return new Grupo(nombreGrupo);
    }

    //endregion
}

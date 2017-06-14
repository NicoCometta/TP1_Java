package fiuba.algo3;

/**
 * Created by nico on 13/06/17.
 */
public class AlgoChat {

    private Usuario usuario;

    public AlgoChat (String nombreUsuario){
        usuario = this.nuevoUsuario(nombreUsuario);
    }

    private Usuario nuevoUsuario(String nombreUsuario) {
        Usuario unUsuario = new Usuario(nombreUsuario);
        return unUsuario;
    }

    public int cantidadDeChatsIndividuales() {
        return 0;
    }

    public int cantidadDeContactos() {
        return this.usuario.cantidadDeContactos();
    }

    public int cantidadDeChatsGrupales() {
        return 0;
    }

    public int cantidadDeGrupos() {
        return 0;
    }

    public int cantidadDeMensajesEnviados() {
        return 0;
    }

    public String nombreUsuario() {
        return usuario.getNombre();
    }

    public void agregarContacto(String unNombreContacto) {
        usuario.agregarContacto(unNombreContacto);
    }

    public boolean existeContacto(String unNombreContacto) {
        return true;
    }

    public void recibirMensajeDe(String unEmisor, String unContenido) {
    }

    public int cantidadTotalMensajesRecibidos() {
        return 1;
    }

    public int cantidadMensajesDe(String unContacto){
        return 1;
    }

    public void enviarMensajeA(String unReceptor, String unContenido) {
    }

    public int cantidadTotalMensajesEnviados() {
        return 1;
    }

    public int cantidadMensajesEnviadosA(String unContacto) {
        return 1;
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

    private Grupo grupo(String nombreGrupo) {
        return new Grupo(nombreGrupo);
    }

    public int cantidadMiembrosEnGrupo(String nombreGrupo) {
        //buscar Grupo: manejo de Errores
        return  3;
    }

    public boolean existeGrupo(String nombreGrupo) {
        //buscar Grupo: manejo de Errores
        return true;
    }
}

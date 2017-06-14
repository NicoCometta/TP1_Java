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
}

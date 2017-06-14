package fiuba.algo3;

import java.util.ArrayList;

/**
 * Created by nico on 13/06/17.
 */
public class Grupo {

    private String nombre;
    private ArrayList<Contacto> miembros;

    public Grupo(String nombreGrupo) {
        this.nombre = nombreGrupo;

        miembros = new ArrayList<Contacto>();
    }

    public void agregarContacto(String nombreContacto) {
        Contacto nuevoMiembro = new Contacto(nombreContacto);

        miembros.add(nuevoMiembro);
    }
}

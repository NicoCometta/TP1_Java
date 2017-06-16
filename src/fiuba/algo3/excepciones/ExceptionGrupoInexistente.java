package fiuba.algo3.excepciones;

/**
 * Created by nico on 15/06/17.
 */
public class ExceptionGrupoInexistente extends RuntimeException {

    public ExceptionGrupoInexistente(){}

    public String mensajeError(){
        return "Grupo inexistente.";
    }
}

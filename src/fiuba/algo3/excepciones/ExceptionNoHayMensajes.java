package fiuba.algo3.excepciones;

/**
 * Created by nico on 15/06/17.
 */
public class ExceptionNoHayMensajes extends RuntimeException {

    public ExceptionNoHayMensajes(){}

    public String mensajeError(){
        return "Grupo inexistente.";
    }
}

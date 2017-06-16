package fiuba.algo3.excepciones;

/**
 * Created by nico on 15/06/17.
 */
public class ExceptionContactoInexistente extends RuntimeException {

    public ExceptionContactoInexistente(){}

    public String mensajeError(){
        return "Contacto inexistente.";
    }
}

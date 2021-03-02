package Factory.error;

public class FiguraNotFoundException extends Throwable {

    public FiguraNotFoundException(){
        super("La figura no se ha encontrado");
    }
}

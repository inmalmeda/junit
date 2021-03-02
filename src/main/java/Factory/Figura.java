package Factory;

/*Clase abstracta: no se puede instanciar. Puede tener metodos abstractos pero no declaramos, de esta
forma obligas a q la clase que llama a esta clase abstracta deba usar esos metodos.(como interfaz)
* */
public abstract class Figura {
    //si lo pongo abstract, no lo tengo qe desarrollar, sino que las clases lo tienen que implementar
    //Si no pongo abstract, hay que desarrollar el metodo y ya las clases hijas no tienen porqué implementarlo

    public abstract double area();

    public void otherMethod(){
        System.out.println("HOLA");
    }

    @Override
    public String toString() {
        return "Figura{}";
    }
}

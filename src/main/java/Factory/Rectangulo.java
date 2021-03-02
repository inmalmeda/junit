package Factory;

public class Rectangulo extends Figura{

    private int lado1;
    private int lado2;

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }


    public Rectangulo() {}


    public Rectangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    //Con override se sobreescribe el metodo del qe hereda. Es informativo y sirve para avisar de si hay problemas de que no sobreescribe
    @Override
    public double area() {
        return this.lado1 * this.lado2;
    }

    @Override
    public void otherMethod(){
        System.out.println("HOLA DESDE RECTANGULO");
    };

    @Override
    public String toString() {
        return "Rectangulo{" +
                "lado1=" + lado1 +
                ", lado2=" + lado2 +
                "} " + super.toString();
    }
}

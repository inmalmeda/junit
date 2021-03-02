package Factory;

public class Triangulo extends Figura{
    private int base;
    private int altura;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Triangulo(){}

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return (this.base * this.altura) / 2.0; //Poner double para que no quite decimales
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "base=" + base +
                ", altura=" + altura +
                "} " + super.toString();
    }
}

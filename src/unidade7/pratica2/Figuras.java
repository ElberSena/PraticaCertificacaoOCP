package unidade7.pratica2;

public abstract class Figuras {

    private int base;

    private int altura;

    public Figuras(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    abstract double area();

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

}

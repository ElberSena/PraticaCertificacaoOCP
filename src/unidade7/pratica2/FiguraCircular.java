package unidade7.pratica2;

public class FiguraCircular extends Figuras implements Figura2D{

    private int r;
    private final double PI = 3.14;

    public FiguraCircular(int base, int altura, int r) {
        super(base, altura);
        this.r = r;
    }

    @Override
    public double perimetro() {
        return 2 * PI * r;
    }

    @Override
    public double area() {
        return PI * (r * r);
    }

    public FiguraCircular(int base, int altura) {
        super(base, altura);
    }
}

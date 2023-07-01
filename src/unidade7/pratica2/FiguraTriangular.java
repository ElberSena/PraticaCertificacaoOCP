package unidade7.pratica2;

public class FiguraTriangular extends Figuras implements Figura3D{
    public FiguraTriangular(int base, int altura) {
        super(base, altura);
    }

    @Override
    public double volume() {
        return area() * getAltura();
    }

    @Override
    public double area() {
        return (getBase() * getAltura())/2;
    }


}

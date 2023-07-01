package unidade7.pratica2;

public class Main {
    public static void main(String[] args) {

        FiguraCircular circulo = new FiguraCircular(5, 6,7);
        FiguraTriangular triangulo = new FiguraTriangular(3, 8);

        System.out.println(circulo.area());
        System.out.println(circulo.perimetro());

        System.out.println(triangulo.area());
        System.out.println(triangulo.volume());
    }
}

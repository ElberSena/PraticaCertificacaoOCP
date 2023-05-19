package unidade6;

public class Circle extends TwoDShape{
    private int r;
    private final double PI = 3.14d;

    public Circle(int base, int altura, int r) {
        super(base, altura);
        this.r = r;

    }

    public double area(){
        double area = PI * (r^2);
        return area;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public double getPI() {
        return PI;
    }
}

package unidade6.pratica1;

import javax.swing.*;
import java.util.Scanner;

public class Circle extends TwoDShape{
    private int r;
    private final double PI = 3.14d;

    public Circle(int base, int altura, int r) {
        super(base, altura);
        this.r = r;

    }

    public double area(){
        return PI * (r^2);
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

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Para calcular a área do circulo digite as informações necessárias.");
        System.out.println("Qual a base do  círculo?");
        int base = sc.nextInt();
        System.out.println("Qual a alura do círculo?");
        int altura = sc.nextInt();
        System.out.println(" qual o raio do círculo?");
        int raio = sc.nextInt();

        Circle circle = new Circle(base ,altura, raio);
        System.out.println("A área do círculo é " + circle.area());
    }
}

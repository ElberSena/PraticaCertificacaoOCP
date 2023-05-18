package unidade5;

//Nessa atividade prática, deverás criar uma classe denominada Rational que permita
//        representar e manipular números racionais.

public class Rational {
    public static void main(String[] args) {


        Rational conta = new Rational();


        System.out.println(conta.mutiplicacao(19,3,4,5));
    }
    private int numerador1;
    private int denominador1;
    private int numerador2;
    private int denominador2;

    public Rational(){

    }
    public double soma(int numerador1, int denominador1, int numerador2, int denominador2){
        double resultado = ((numerador1 * denominador2) + (numerador2 * denominador1)) / (denominador2 * denominador1);
        return resultado;
    }
    public double subtracao(int numerador1, int denominador1, int numerador2, int denominador2){
        double resultado = ((numerador1 * denominador2) - (numerador2 * denominador1)) / (denominador2 * denominador1);
        return resultado;
    }
    public double mutiplicacao(int numerador1, int denominador1, int numerador2, int denominador2){
        double resultado = ((numerador1 * numerador2) / (denominador2 * denominador1));
        return resultado;
    }
    public double divisao (int numerador1, int denominador1, int numerador2, int denominador2){
        double resultado = ((numerador1 * denominador2) / (numerador2 * denominador1));
        return resultado;
    }
}

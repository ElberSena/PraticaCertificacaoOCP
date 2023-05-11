package unidade3;
/*
    O método candyCalculator deve receber um número de créditos e imprimir
    quantos chocolates e quantas chicletes conseguimos comprar com esse
    número de créditos bem como o troco a devolver, sabendo que o utilizador
    quer o maior número de chocolates possível.
    */
import java.util.Scanner;
public class CandyCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos créditos tens?");
        int credits = scanner.nextInt();
        candyCalculator(credits);

    }

    public static void candyCalculator(int valor){
        int gumPrice = 3;
        int chocolateBarPrice = 5;
        int quantC = 0, quantG = 0;
        int troco = 0;

        while (valor > 0) {
            if (valor <= 2){
                troco = valor;
                break;
            }else if (valor < 5){
                valor = valor - gumPrice;
                quantG ++;
            }else {
                valor = valor - chocolateBarPrice;
                quantC++;
            }
        }

        if (quantC > 0 && quantG > 0 && troco > 0){
            System.out.println(quantC + " Chocolate(s) " + quantG + " Gum " + troco + " Troco");
        } else if (quantC > 0 && troco > 0) {
            System.out.println(quantC + " Chocolate(s) " + troco + " Troco");
        } else if (quantC > 0 && quantG > 0) {
            System.out.println(quantC + " Chocolate(s) " + quantG + " Gum ");
        } else if (quantC < 0 && quantG < 0 && troco > 0) {
            System.out.println(quantG + " Gum" + troco + " Troco");
        } else {
            System.out.println(quantC + " Chocolate(s) ");
        }
    }
}


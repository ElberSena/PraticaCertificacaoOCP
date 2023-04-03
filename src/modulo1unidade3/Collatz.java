package modulo1unidade3;

import java.util.Scanner;

//Para essa atividade prática, considera o algoritmo seguinte definido por números
//        inteiros positivos:
//        1. Escolhe um número determinado
//        2. Se o número for par, divide-o por dois
//        3. Se o número for ímpar, multiplica-o por 3 e soma-lhe 1
//        4. Repetir todo o processo anterior até obter um 1
public class Collatz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Collatz p = new Collatz();

        System.out.println("Digite um número para a conjetura de Collatz:");
        int num = sc.nextInt();

        p.conjutura(num);
    }
    private void conjutura(int x){
        while (x != 1) {
            if ((x % 2) == 0){
                x = x / 2;
                System.out.println(x);
            } else {
                x = (x * 3) + 1;
                System.out.println(x);
            }
        }
    }
}

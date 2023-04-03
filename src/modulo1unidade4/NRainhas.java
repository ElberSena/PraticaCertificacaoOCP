package modulo1unidade4;

//Nesta atividade prática, deverá criar um programa que, ao receber um array
//        de inteiros (independentemente do tamanho), o programa ordena o array de
//        forma decrescente.
//        Tem que implementar o algoritmo de ordenação, portanto não é permitido
//        usar nenhum tipo de métodos do Java ou bibliotecas externas.

import java.sql.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class NRainhas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números quer ordenar: ");
        int tamanho = sc.nextInt();

        Integer decrecente [] = new Integer[tamanho];
        System.out.println("Digite os numeros que você quer ordenar:");
        for (int i = 0; i <  decrecente.length; i++) {
           decrecente[i] = sc.nextInt();
        }

        Arrays.sort(decrecente, Collections.reverseOrder());
        System.out.println("A ordem descecente do array: " + Arrays.toString(decrecente));
    }
}

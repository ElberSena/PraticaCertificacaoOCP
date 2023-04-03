package modulo1unidade4;

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

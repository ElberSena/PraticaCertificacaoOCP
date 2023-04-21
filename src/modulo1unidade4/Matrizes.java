package modulo1unidade4;

import java.util.Scanner;

//1. Criar uma função estática double mediaArray(double[] nums) na classe Matrizes
//        que, dado um array de elementos de tipo duplo, devolver o seu valor médio.
//        Nota: Para calcular a média, é necessário somar todos os valores do array, e
//        dividir o valor pelo length do array.

//2. Criar uma função estática public static int[] minMax(int[] nums) na classe
//        Matrizes que, dado um array de elementos de tipo inteiro, calcular o mínimo e o
//        máximo dos seus valores e devolvê-los como um array de dois elementos. O
//        primeiro valor será o mínimo e o segundo valor será o máximo. A função minMax
//        deve usar ciclos de estilo for-each.
public class Matrizes {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o tamanho do array");
        int tamanho = sc.nextInt();

        double [] array = new double[tamanho];
        for (int i = 0; i < array.length; i++){
            System.out.println("Digite os valores do array:");
            array[i] = sc.nextDouble();
        }

        System.out.println("A média dos valores do array é " + mediaArray(array));

    }
    public static double mediaArray(double[] nums){
        double media, somatorio  = 0d;
        for (int i = 0; i < nums.length; i++){
            somatorio += nums[i];
        }
        media = somatorio/nums.length;
        return media;
    }

}

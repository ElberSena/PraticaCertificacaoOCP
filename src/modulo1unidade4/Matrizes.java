package modulo1unidade4;

import java.util.Arrays;
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

        double [] media = new double[tamanho];
        for (int i = 0; i < media.length; i++){
            System.out.println("Digite os valores do array:");
            media[i] = sc.nextDouble();
        }

        System.out.println("A média dos valores do array é " + mediaArray(media));

        System.out.println("-------------------------------------------------------------");

        int[] array = new int[]{17, 28, 9, 4, 22, 7, 1, 3, 19, 42, 58, 47};
        System.out.println(Arrays.toString(array));

        System.out.println("Os valores mínimos e máximos do array são: " + Arrays.toString(minMax(array)));

    }
    public static double mediaArray(double[] nums){
        double media, somatorio  = 0d;
        for (int i = 0; i < nums.length; i++){
            somatorio += nums[i];
        }
        media = somatorio/nums.length;
        return media;
    }

    public static int [] minMax (int[] nums){
        int max = 0;
        int min = 1;

        for (int elemento : nums) {
            if (elemento > max ){
                max = elemento;
            }
            if (elemento < min){
                min = elemento;

            }

        }
        int [] array = new int [] {min,max};
      return array;
    }

}


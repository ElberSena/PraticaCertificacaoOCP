package modulo1unidade4;

//Nesta atividade prática, deverá criar um programa que, ao receber um array
//        de inteiros (independentemente do tamanho), o programa ordena o array de
//        forma decrescente.
//        Tem que implementar o algoritmo de ordenação, portanto não é permitido
//        usar nenhum tipo de métodos do Java ou bibliotecas externas.


import java.util.Scanner;

public class NRainhas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números quer ordenar: ");
        int tamanho = sc.nextInt();

        int[] array = new int[tamanho];
        for (int i = 0; i < array.length; i++){
            System.out.println("Digite o numero:");
            array[i] = sc.nextInt();
        }

        selectionSort(array);
        for (int i= 0; i < array.length; i++ ){
            System.out.println(array[i]);
        }

    }

    public static void selectionSort(int[] array){
        for (int fixo = 0; fixo < array.length - 1; fixo ++){
            int maior = fixo;

            for (int i = maior; i < array.length; i++){
                if (array[i] > array[maior]){
                    maior = i;
                }
            }
            if (maior != fixo){
                int p = array[fixo];
                array[fixo] = array[maior];
                array[maior] = p;
            }
        }
    }
}


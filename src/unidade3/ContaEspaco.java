package unidade3;

/*Nessa atividade prática, deverás criar um programa que leia caracteres do teclado até
receber um ponto. O programa deve contar o número de espaços. Indicar o total de espaços
ao final do programa.*/

import java.util.Scanner;
public class ContaEspaco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o texto:");
        String texto = sc.nextLine();

        int cont = 0;
        for (int i = 0; i < texto.length(); i++){
            if (texto.charAt(i) == ' ') {
                cont++;
            } else if ((texto.charAt(i) == '.')) {
                break;
            }
            }
        System.out.println(cont);
    }
}

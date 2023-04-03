package modulo1unidade3;

import java.util.Scanner;

//Tanto no código ASCII como no Unicode, as letras minúsculas separam-se das maiúsculas
//        por 32 posições. Por isso, para converter uma letra de maiúscula para minúscula, deve-se
//        somar 32. Nessa atividade prática, deverás criar um programa que leia caracteres do teclado
//        e que converta as maiúsculas em minúsculas e vice-versa. Os restantes caracteres não
//        alteram. O programa deve parar quando o utilizador introduzir um ponto. Para finalizar, o
//        programa deve mostrar o número de alterações realizadas.
public class maisculaMinuscula {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char c, maisc, minusc, espaco;

        System.out.println("Digite o texto:");
        String texto = sc.nextLine();
        int cont = 0;

        for (int i = 0; i < texto.length(); i++){
           c = texto.charAt(i);
            if (c == '.') {
                for (int j = i; j < texto.length(); j++) {
                    System.out.print(texto.charAt(j));
                }
                break;
            } else if (c == ' ') {
                    espaco = ' ';
                    System.out.print(espaco);
            } else if (Character.isUpperCase(c)) {
                    maisc = (char) (c + 32);
                    System.out.print((char) maisc);
                    cont++;
            } else if (Character.isLowerCase(c)) {
                    minusc = (char) (c - 32);
                    System.out.print(minusc);
                    cont++;
            }
        }
        System.out.println("\nHouve " + cont + " interaçoes");
    }
}



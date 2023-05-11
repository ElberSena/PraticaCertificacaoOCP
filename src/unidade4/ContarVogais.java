package unidade4;

import java.util.Scanner;

public class ContarVogais {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String frase = sc.nextLine();
        System.out.println("A frase possui " + contarVoais(frase) + " vogail(s)");
    }

    public static int contarVoais(String frase){
        int cont = 0;
        frase = frase.toLowerCase();
        for (int i = 0; i < frase.length(); i++){
            switch (frase.codePointAt(i)){
                case 97 :
                    cont++;
                    break;
                case 101:
                    cont++;
                    break;
                case 105:
                    cont++;
                    break;
                case 111:
                    cont++;
                    break;
                case 117:
                    cont++;
                    break;
            }

        }
        return cont;
    }
}

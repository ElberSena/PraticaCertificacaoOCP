package modulo1unidade4;

//Exemplos de palíndromos:
//        “Radar” (ignorar as diferenças entre maiúsculas e minúsculas)
//        “O galo ama o lago” (ignorar os espaços, os caracteres acentuados e os sinais de
//        exclamação)
//        Nessa atividade prática, deverás implementar a função boolean
//        esPalindromo(String) que dado um String passado por parâmetro, devolve
//        um valor booleano indicando se esse String é palíndromo ou não.

import java.text.Normalizer;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Palindromo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a frase para saber se é um Palíndromo");
        String teste = sc.nextLine();
        System.out.println(esPalindromo(teste));
    }
    public static boolean esPalindromo (String frase){
        frase = frase.replace(" ", "");
        frase = frase.replace("!", "");
        String normalize = Normalizer.normalize(frase,Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("[^\\p{ASCII}]");
        frase = pattern.matcher(normalize).replaceAll("");
        String fraseInversa = "";
        for(int i = frase.length()-1; i >=0 ; i--) {
            fraseInversa += frase.charAt(i);
        }
        return frase.equalsIgnoreCase(fraseInversa);
    }
}

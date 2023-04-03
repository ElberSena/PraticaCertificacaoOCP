package modulo1unidade2;

/*A gravidade da Lua é aproximadamente 17% da gravidade da Terra. Nessa atividade
 prática, deverás criar um programa para que, dado um peso da Terra, se calcule o
 seu equivalente na Lua.*/

import java.util.Scanner;

public class Galoes {
    public static void main (String[] args){

            Scanner sc = new Scanner(System.in);

            System.out.println("Digite o peso na Terra:");
            double pesoTerra = sc.nextDouble();

            double pesoLua = ((pesoTerra * 17)/100);

            System.out.println(pesoTerra + " Kg na Terra equivale a " + pesoLua + " Kg na Lua." );
    }
}

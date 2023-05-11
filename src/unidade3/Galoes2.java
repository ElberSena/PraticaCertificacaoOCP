package unidade3;
//Nessa atividade prática, deverás criar um programa que imprima uma tabela de
//        conversão de polegadas em metros.
public class Galoes2 {

    public static void main(String[] args) {

        double metro,polegada;

        int cont = 0;
        for (polegada = 1; polegada < 145; polegada++){
            metro = (polegada / 39.37);
            System.out.println(polegada + " polegada são " +  metro + " metros"); cont++;
            if (cont == 12){
                System.out.println("");
                cont = 0;
            }
        }
    }
}

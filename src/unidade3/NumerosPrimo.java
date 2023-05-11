package unidade3;
//Nessa atividade prática, deverás criar um programa que procure e imprima por ecrã todos os
//números primos entre 2 e 100 (Crivo de Eratóstenes).
public class NumerosPrimo {
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {
            boolean primo = true;
            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    primo = false;
                }
            }
            if (primo){
                System.out.println(i);
            }
        }



    }
}

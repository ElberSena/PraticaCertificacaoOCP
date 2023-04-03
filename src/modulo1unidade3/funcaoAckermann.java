package modulo1unidade3;
//A função de Ackermann é um exemplo de uma função computável que não é função
//        recursiva primitiva. Todas as funções recursivas primitivas são totais e computáveis,
//        mas a função de Ackermann mostra que nem toda a função total-computável é
//        recursiva primitiva. É preciso executá-la apenas com números muito pequenos,
//        porque é uma função de crescimento rápido (a chamada A(3,4) cria mais de 10.000
//        chamadas recursivas) e depois deixaria o computador sem memória para resolver os
//        cálculos.
import java.util.Scanner;

public class funcaoAckermann {
    public static void main(String[] args) {
        funcaoAckermann ak = new funcaoAckermann();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valores de X e Y:");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("Os valores passado na função de Ackermann retornam " + ak.fAcker(x, y));
    }
   private int fAcker(int x, int y){
       if(x == 0)
           return y + 1;

       if (y == 0)
           return fAcker(x-1,1);
       return fAcker(x-1, fAcker(x,y-1));
   }
}

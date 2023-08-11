package modulo1.unidade2.unidade5.StackII;

//Nessa atividade prática, tem de se fazer uma aula de Stack que implemente uma
//        pilha que armazene caracteres. A pilha deve permitir criar-se através de
//        construtores com um determinado tamanho, deve permitir introduzir valores (push)
//        e retirar valores (pop).

import java.util.Scanner;

public class Stack {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Stack novaPilha = new Stack();
        int opcao = 0;
        char num = ' ';

        while (opcao != 3) {
            System.out.println("Escolha uma das opções no quadro abaixo");
            System.out.println(" 1 - Para adicionar um caracter a pilha.");
            System.out.println(" 2 - Para retirar um caracter da pilha.");
            System.out.println(" 3 - Para sair.");
            opcao = scan.nextInt();
            if (opcao == 1) {
                while (num != '.') {
                    System.out.println("Presione o caracter desejado. Para sair aperte ponto '.':");
                    num = scan.next().charAt(0);
                    if (num != '.') {
                        novaPilha.push(num);
                    }
                }
            } else if (opcao == 2) {
                System.out.println("Item valor " + novaPilha.pop() + " retirada da pilha");
            }
        }
    }
    private static int max = 4;
    private int topo;
    private char pilha[] = new char[max];

    public Stack(){
        topo = -1;
    }

    public void push (char elemento){

        if (topo == pilha.length -1) {
            throw new StackFullException();
        }
        pilha[++topo] = elemento;

    }
    public char pop (){
        if (topo == -1) {
            throw new StackEmptyException();
        }
        char elemento = pilha[topo--];
        return elemento;
    }
}

package unidade5.StackII;

public class StackEmptyException extends RuntimeException{

    public StackEmptyException(){
        super("Pilha vazia!");
    }

}

package modulo1.unidade2.unidade5.StackII;

public class StackFullException extends RuntimeException{

    public StackFullException(){
        super("A pilha está cheia!");
    }
}

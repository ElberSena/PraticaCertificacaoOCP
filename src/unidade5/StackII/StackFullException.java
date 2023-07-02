package unidade5.StackII;

public class StackFullException extends RuntimeException{

    public StackFullException(){
        super("A pilha está cheia!");
    }
}

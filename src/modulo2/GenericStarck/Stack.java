package modulo2.GenericStarck;

public class Stack {
    public static void main(String[] args) {
        GenericStack<Character> stack = new GenericStack<>();

        stack.push('J');
        stack.push('A');
        stack.push('V');
        stack.push('A');

        System.out.println(stack.toString());

        stack.pop();
        System.out.println(stack.toString());
        stack.pop();
        System.out.println(stack.toString());
        stack.pop();
        System.out.println(stack.toString());
        stack.pop();
        System.out.println(stack.toString());
    }



}

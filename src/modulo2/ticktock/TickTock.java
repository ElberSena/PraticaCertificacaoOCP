package modulo2.ticktock;

public class TickTock {

    public static void main(String[] args) throws InterruptedException {
        int tempo = 0;

        while (tempo < 3600){
            System.out.print("Tick ");
            Thread.currentThread().sleep(500);
            System.out.println("- Tock");
            Thread.currentThread().sleep(500);
            tempo++;
        }

    }
}

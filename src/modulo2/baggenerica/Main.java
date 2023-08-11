package modulo2.baggenerica;

public class Main {

    public static void main(String[] args) {

        BagGeneric<String> myBag = new BagGeneric<>();

        myBag.PutInBag("Pen");
        myBag.PutInBag("Book");
        myBag.PutInBag("Laptop");
        myBag.PutInBag("Powerbank");
        myBag.PutInBag("Keys");

        System.out.println("Itens da minha " + myBag.toString());

        System.out.println("Minha Bag tem Laptop: " + myBag.Contains("Laptop"));

        System.out.println("Minha Bag esta vazia: " + myBag.isEmpty());

        System.out.println("Minha Bag possuie " + myBag.isEmpty() + " itens");

        System.out.println("Item aleatório removido: " + myBag.TakeFromBag());

        System.out.println("Esvaziando a Bag");
        myBag.CleanBag();

        System.out.println("Minha Bag esta vazia: " + myBag.isEmpty());

    }

}


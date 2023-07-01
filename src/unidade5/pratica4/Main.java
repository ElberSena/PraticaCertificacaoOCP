package unidade5.pratica4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bag myBag = new Bag();
//PutInBag(String items) deve aceitar e guardar uma coleção de Objects
        myBag.PutInBag(getItems());
//TakeFromBag() deve remover e retornar um elemento aleatório da Bag
        System.out.println(myBag.TakeFromBag());
    }
    private static List<String> getItems() {
        return List.of(
                "Pen",
                "Book",
                "Laptop",
                "Powerbank",
                "Keys"
        );
    }

}


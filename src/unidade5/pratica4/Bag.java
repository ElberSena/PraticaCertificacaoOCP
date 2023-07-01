package unidade5.pratica4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bag {
    List<String> objetos = new ArrayList<>();

   public void PutInBag(List<String> items){
       for (String objeto : items) {
           objetos.add(objeto);
       }


   }

    public String TakeFromBag(){
        Random random = new Random();
        objetos.remove(random.nextInt(objetos.size()));
        return objetos.get(random.nextInt(objetos.size()));
    }

    @Override
    public String toString() {
        return "Bag{" +
                "objetos=" + objetos +
                '}';
    }
}

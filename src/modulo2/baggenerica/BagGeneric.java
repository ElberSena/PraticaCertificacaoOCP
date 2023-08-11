package modulo2.baggenerica;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BagGeneric <T>{
    List<T> objetos = new ArrayList<>();

    public void PutInBag( T itens){
       objetos.add((T) itens);
    }

    public void CleanBag(){
        objetos.clear();

    }

    public boolean Contains ( T itens){
        return objetos.contains(itens);

    }

    public boolean isEmpty(){
        return objetos.isEmpty();
    }

    public int Size(){
        return objetos.size();
    }

    public T TakeFromBag(){
        Random random = new Random();
        objetos.remove(random.nextInt(objetos.size()));
        return objetos.get(random.nextInt(objetos.size()));
    }


    @Override
    public String toString() {
        return "Bag " + objetos;
    }
}

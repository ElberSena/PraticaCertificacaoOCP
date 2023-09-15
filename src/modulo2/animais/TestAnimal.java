package modulo2.animais;

import java.util.ArrayList;
import java.util.List;

public class TestAnimal {
    public static void main(String[] args) {

        List<Animal> animais = new ArrayList<>();

        Animal a1 = new Animal("jagun", "Cão", "Shinauzer", 9,
                0.50,false, "Comida crua", 0);
        Animal a2 = new Animal("Felix", "Gato", "Siames", 9,
                0.30,false, "Racao", 0);
        Animal a3 = new Animal("Chico", "Papagaio", "Calopicita", 9,
                0.15,false, "Girassol", 0);
        Animal a4 = new Animal("Fofinha", "Cão", "Pit Bul", 40,
                0.15,true, "Comida crua", 0);
        Animal a5 = new Animal("Ema", "Girafa", "Masai", 12000,
                0.15,false, "Folhas", 0);


        animais.add(a1);
        animais.add(a2);
        animais.add(a3);
        animais.add(a4);
        animais.add(a5);

        animais.get(0).marcarComoPerigoso();

        for (Animal a: animais) {
            System.out.println("Nome dos animais cadastrados: " + a.getDescricao());
        }

        animais.forEach(animal -> {
            animal.alimentar(10);
        });
        System.out.println("******************** Foi acrescentado 10kg de comida para cada animal ********************");

        animais.forEach(animal -> System.out.println(animal));

        System.out.println("******************** Retirada dos animais perigosos ********************");
        animais.removeIf(p -> p.isPerigoso());

        animais.forEach(animal -> System.out.println(animal));

        System.out.println("******************** Retirada dos animais que pesam mais de 10kg ********************");
        animais.removeIf(k -> k.getPeso()>10);

        animais.forEach(animal -> System.out.println(animal));


//





    }
}

package modulo2.cidades;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestCidades {

    public static void main(String[] args) {
        List<Cidade> cidades = List.of(
        new Cidade("Lisboa", "Grande Lisboa", 548.703),
        new Cidade("Sintra", "Grande Lisboa", 388.767),
        new Cidade("Vila Nova de Franca", "Grande Porto",307.563 ),
        new Cidade("Porto", "Grande Porto", 240.592),
        new Cidade("Cascais", "Grande Lisboa", 213.928),
        new Cidade("Braga", "Cavado", 197.594),
        new Cidade("Almada", "Grande Lisboa", 178.254),
        new Cidade("Matosinhos", "Grande Porto", 176.617),
        new Cidade("Amadora", "Grande Lisboa", 174.511),
        new Cidade("Gondomar", "Grande Porto", 166.900),
        new Cidade("Odivelas", "Grande Lisboa", 150.366),
        new Cidade("Coimbra", "Coimbra", 142.252),
        new Cidade("Leiria", "Leiria", 130.605),
        new Cidade("Corvo", "Açores", 0.432)
        );


        System.out.println("Quantas cidades há no total?");
        long qtdCidades = cidades.stream()
                            .count();
        System.out.println(qtdCidades);
        System.out.println(          );

        System.out.println("Quantas cidades de Portugal têm mais de 1.000 habitantes?");
        long maisDe1000Habitantes = cidades.stream()
                        .filter(cidade -> cidade.getHabitantes() > 1.000)
                        .count();
        System.out.println(maisDe1000Habitantes);
        System.out.println(          );

        System.out.println("De que distrito são as cidades?");
        List<String> listaDistritos = cidades.stream()
                        .map(cidade -> cidade.getProvincia())
                        .distinct()
                        .collect(Collectors.toList());
        System.out.println(listaDistritos);
        System.out.println(          );

        System.out.println("De quantos distritos diferentes são as cidades?");
        long qtdDistritosDiferentees = cidades.stream()
                        .map(cidade -> cidade.getProvincia())
                                .distinct()
                                        .count();
        System.out.println(qtdDistritosDiferentees);
        System.out.println(          );

        System.out.println("Alguma cidade de Portugal tem mais de 50.000 habitantes?");
        List<Cidade> cidadeMaisDeCiquentaMilHab = cidades.stream()
                .filter(cidade -> cidade.getHabitantes() > 50.000)
                .collect(Collectors.toList());
        System.out.println(cidadeMaisDeCiquentaMilHab);
    }
}

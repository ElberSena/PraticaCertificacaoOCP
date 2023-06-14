package unidade6.pratica4;

import java.util.*;

public class OrdPalNumDec extends AlgoritmoOrdenacao{

    @Override
    public void ordena(List listaCartas) {
        // algoritmo de ordenacao
        listaCartas = new ArrayList<>();
        listaCartas.sort(Comparator.comparing(Carta :: getNaipe).thenComparing(Carta :: getNumero, Collections.reverseOrder()));
    }

    public static int comparadorCarta(Carta c1, Carta c2) {
        // Comparador de cartas usado no algoritmo de ordenacao
        return 0;
    }

}


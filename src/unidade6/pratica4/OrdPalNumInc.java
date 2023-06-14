package unidade6.pratica4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdPalNumInc extends AlgoritmoOrdenacao{

        @Override
    public void ordena(List listaCartas) {
            // Algoritmo de ordenacao
            listaCartas = new ArrayList<>();
            listaCartas.sort(Comparator.comparing(Carta :: getNaipe).thenComparing(Carta :: getNumero));

    }

    public static int comparadorCarta(Carta c1, Carta c2) {
            // Comparador de cartas usado no algoritmo de ordenacao
            return 0;
    }

}


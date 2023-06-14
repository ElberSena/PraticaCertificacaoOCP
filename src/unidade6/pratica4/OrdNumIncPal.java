package unidade6.pratica4;

import java.util.Collections;
import java.util.List;

public class OrdNumIncPal extends AlgoritmoOrdenacao {

    @Override
    public void ordena(List listaCartas) {
        // Algoritmo de ordenacao
        Collections.sort(listaCartas);

        //listaCartas = new ArrayList<>();
        //listaCartas.sort(Comparator.comparing(Carta :: getNumero).thenComparing(Carta :: getNaipe));
    }

    public static int comparadorCarta(Carta c1, Carta c2) {
        // Comparador de cartas usado no algoritmo de ordenacao
        return 0;
    }
}
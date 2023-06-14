package unidade6.pratica5;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Orquestra {
    private static List<Instrumento> listaInstrumentos;

    public static void main(String[] args) {
        listaInstrumentos = new ArrayList<>();
        Percussao percussao = new Percussao("tocar","Timbale", "DO");
        Percussao percussao1 = new Percussao("tocar","Xilofone", "RE");
        listaInstrumentos.add(percussao);
        listaInstrumentos.add(percussao1);

        Sopro sopro = new Sopro("sopar", "Tuba", "MI");
        Sopro sopro1 = new Sopro("sopar","Saxofone", "FA");
        listaInstrumentos.add(sopro);
        listaInstrumentos.add(sopro1);

        Cordas cordas = new Cordas("vibrar", "Violino", "SO");
        Cordas cordas1 = new Cordas("vibrar","Contra Baixo", "LA");
        listaInstrumentos.add(cordas);
        listaInstrumentos.add(cordas1);

        for (Instrumento i : listaInstrumentos) System.out.println(i.toString());

        System.out.println(percussao1.tocar("Sol"));

        /***
         * Falta implementar o método tocar da classe main
         */
        for (Instrumento i : listaInstrumentos){
            System.out.println(i);
        }

    }
}

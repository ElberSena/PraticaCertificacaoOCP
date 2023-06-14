package unidade6.pratica3;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Repositor extends Funcionario{

    @Override
    public void salario(double salario) {
        super.salario(salario);
    }

    @Override
    public String toString() {
        return "Repositores" +
                "\n nome: " + getNome() +
                "\n apelido: " + getApelido() +
                "\n numIdentificacao='" + getNumIdentificacao() +
                "\n morada: " + getMorada() +
                "\n telefone: " + getTelefone() +
                "\n segurancaSocial: " + getSegurancaSocial() +
                "\n salario: " + getSalario() +
                "\n turno: " + getTurno();
    }
}

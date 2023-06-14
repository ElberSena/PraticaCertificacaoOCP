package unidade6.pratica3;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Subcontratado extends Funcionario{
    private String especialidade;

    @Override
    public void salario(double salario) {
        super.salario(salario);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return "Subcontratado{" +
                "\n nome: " + getNome() +
                "\n apelido: " + getApelido() +
                "\n numIdentificacao: " + getNumIdentificacao() +
                "\n morada: " + getMorada() +
                "\n telefone: " + getTelefone() +
                "\n segurancaSocial: " + getSegurancaSocial() +
                "\n salario: " + getSalario() +
                "\n turno: " + getTurno() +
                "\n especialidad: " + especialidade;
    }
}

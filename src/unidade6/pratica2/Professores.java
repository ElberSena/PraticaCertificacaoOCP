package unidade6.pratica2;

import javax.swing.*;

public class Professores extends Pessoal{
    private String departamento;
    private String avaliacao;

    public Professores(){

    }
    public Professores(String nome, String CC, double salario, String departamento) {
        super(nome, CC, salario);
        this.departamento = departamento;
    }

    public void salario(){
        this.salario = ((37 * 8) * 4);
    }
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }
    @Override
    public String toString() {
        return "Professor " +
                "\nNome: " + getNome() +
                "\nCartão Cidadão: " + getCC() +
                "\nsalario: " + salario +
                "\ndepartamento: " + departamento;
    }
}

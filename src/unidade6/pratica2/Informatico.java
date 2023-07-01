package unidade6.pratica2;

import javax.swing.*;

public class Informatico extends Pessoal{
    private String departamento;

    public Informatico(){

    }

    public Informatico(String nome, String CC, double salario, String departamento) {
        super(nome, CC, salario);
        this.departamento = departamento;
    }
    @Override
    public void salario(){
        int quantExtra = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de horas extras:"));
        if (quantExtra > 0){
            this.salario = ((40 * 7.5) * 4) + (quantExtra * 6);
        } else {
            this.salario = ((40 * 7.5) * 4);
        }
    }
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Informático " +
                "\nNome: " + getNome() +
                "\nCartão Cidadão: " + getCC() +
                "\nsalario: " + salario +
                "\ndepartamento: " + departamento;
    }
}

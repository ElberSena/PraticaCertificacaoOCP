package unidade6.pratica2;

import javax.swing.*;

public class Professores extends Pessoal {
    private String departamento;
    private static String avaliacao;
    private static int cont = 7;

    public Professores(){

    }
    public Professores(String nome, String CC, double salario, String departamento) {
        super(nome, CC, salario);
        this.departamento = departamento;
    }

    @Override
    public void salario() {
        avaliacao = JOptionPane.showInputDialog(null,"Avalição do período: Positivo ou Negativo");
        if (avaliacao.equalsIgnoreCase("Positivo")){
            this.salario = ((37 * 8) * 4 + 100);
            cont -= 1;
        }else {
            this.salario = ((37 * 8) * 4);
        }
        if (cont == 0){
            this.salario = ((37 * 8) * 4);
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
        return "Professores" +
                "\nNome: " + getNome() +
                "\nCartão Cidadão: " + getCC() +
                "\ndepartamento: " + departamento +
                "\n salario: " + salario;
    }
}

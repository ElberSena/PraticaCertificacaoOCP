package unidade6.pratica2;


import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Universidade {

    public static List<Pessoal> listaPessoa = new ArrayList<>();


    public static void imprimirNominas() {
        if (listaPessoa.size() > 0) {
            for (Pessoal p : listaPessoa) {
                JOptionPane.showMessageDialog(null, p);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Lista vazia.");
        }
    }
//    public static double obterOrcamentoTotal(){
//        double orcamento = 0d;
//        for (int i = 0; i <= listaPessoa.size(); i++){
//
//            orcamento += listaPessoa.;
//
//        }
//        return orcamento;
//    }

    public static void main(String[] args) {
        listaPessoa = new ArrayList<>();
        menuOperacoes();
    }

    public static void menuOperacoes(){
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("-------Escolha uma opção-------" +
                "\n| Opção 1 - Cadastrar funcionário Administrativo" +
                "\n| Opção 2 - Cadastrar funcionário Informatica" +
                "\n| Opção 3 - Cadastrar funcionário Investigador" +
                "\n| Opção 4 - Cadastrar funcionário Professor" +
                "\n| Opção 5 - Obter lista de funcionários" +
                "\n| Opção 6 - Obter orçamento da universidade" +
                "\n| Opção 7 - Sair" ));

        switch (opcao){
            case 1:
                cadastroAdministrativo();
                menuOperacoes();
                break;
            case 2:
                cadastroInforrmatica();
                menuOperacoes();
                break;
            case 3:
                cadastroInvestigador();
                menuOperacoes();
                break;
            case 4:
                cadastroProfessor();
                menuOperacoes();
                break;
            case 5:
                imprimirNominas();
                menuOperacoes();
                break;
            case 6:
                obterOrcamentoTotal();
                menuOperacoes();
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Fim do programa! Até logo!");
                System.exit(0);
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!");
                menuOperacoes();
        }
    }

    public static void cadastroAdministrativo(){
        Administrativo administrativo = new Administrativo();
        administrativo.setNome(JOptionPane.showInputDialog("Nome:"));
        administrativo.setCC(JOptionPane.showInputDialog("Cartão Cidadão:"));
        administrativo.salario();
        administrativo.setDepartamento("PAS");
        listaPessoa.add(administrativo);
        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
    }

    public static void cadastroInforrmatica(){
        Informatico informatico = new Informatico();
        informatico.setNome(JOptionPane.showInputDialog("Nome:"));
        informatico.setCC(JOptionPane.showInputDialog("Cartão Cidadão:"));
        informatico.salario();
        informatico.setDepartamento("PAS");
        listaPessoa.add(informatico);
        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
    }

    public static void cadastroInvestigador(){
        Investigadores investigadores = new Investigadores();
        investigadores.setNome(JOptionPane.showInputDialog("Nome:"));
        investigadores.setCC(JOptionPane.showInputDialog("Cartão Cidadão:"));
        investigadores.setDepartamento("PDI");
        listaPessoa.add(investigadores);
        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
    }

    public static void cadastroProfessor(){
        Professores professores = new Professores();
        professores.setNome(JOptionPane.showInputDialog("Nome:"));
        professores.setCC(JOptionPane.showInputDialog("Cartão Cidadão:"));
        professores.salario();
        professores.setDepartamento("PDI");
        listaPessoa.add(professores);
        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
    }

    public static void obterOrcamentoTotal(){
        double orcamento = 0d;
        for (int i = 0; i < listaPessoa.size(); i++){
            orcamento += listaPessoa.get(i).getSalario();
        }
        JOptionPane.showMessageDialog(null, orcamento);
    }

}

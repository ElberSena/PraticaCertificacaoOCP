package unidade6.pratica3;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Mercado {

    private static List<Funcionario> funcionarioListMercado;

    public static void funcionariosMercado (){
        if (funcionarioListMercado.size() == 0) {
            JOptionPane.showMessageDialog(null, "Nenhum funcionário cadastrado.");
        } else {
            for (Funcionario func : funcionarioListMercado) {
                JOptionPane.showMessageDialog(null, func);
            }
        }
    }
    public static void main(String[] args) {

        funcionarioListMercado = new ArrayList<Funcionario>();
        menuPrincipal();

    }
    public static void menuPrincipal(){
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("|-----Escolha uma das opções abaixo:-----" +
                "\n| Opção 1. Cadastrar Cliente" +
                "\n| Opção 2. Cadastrar Funcionários" +
                "\n| Opção 3. Cadastrar Repositor" +
                "\n| Opção 4. Cadastrar Subcontrado" +
                "\n| Opção 5. Lista de Funcionários" +
                "\n| Opção 6. Sair"));
        switch (opcao) {
            case 1 -> {
                cadastroCliente();
                menuPrincipal();
            }
            case 2 -> {
                cadastroFuncionario();
                menuPrincipal();
            }
            case 3 -> {
                cadastroRepositor();
                menuPrincipal();
            }
            case 4 -> {
                cadastroSubcontrato();
                menuPrincipal();
            }
            case 5 -> {
                Mercado.funcionariosMercado();
                menuPrincipal();
            }
            case 6 -> {
                System.out.println("Fim do Programa! Até Breve!!!");
                JOptionPane.showMessageDialog(null,"Fim do Programa! Até Breve!!!");
                System.exit(0);
            }
            default -> {
                System.out.println("Opção inválida");
                JOptionPane.showMessageDialog(null,"Opção inválida.");
                menuPrincipal();
            }
        }
    }
    public static void cadastroCliente() {
        Cliente cliente = new Cliente();
        cliente.setNome(JOptionPane.showInputDialog("Nome:"));
        cliente.setApelido(JOptionPane.showInputDialog("Apelido:"));
        cliente.setNumIdentificacao(JOptionPane.showInputDialog("Número de identificação:"));
        cliente.setMorada(JOptionPane.showInputDialog("Morada:"));
        cliente.setTelefone(JOptionPane.showInputDialog("Telefone:"));
        cliente.setCodigoCliente(JOptionPane.showInputDialog("Código:"));
        cliente.setNumCompras(Integer.parseInt(JOptionPane.showInputDialog("Número de compras:")));
        JOptionPane.showMessageDialog(null,"Cliente cadastrado com sucesso.");
    }

    public static void cadastroFuncionario(){
        Funcionario funcionario = new Funcionario();
        funcionario.setNome(JOptionPane.showInputDialog("Nome:"));;
        funcionario.setApelido(JOptionPane.showInputDialog("Apelido:"));
        funcionario.setNumIdentificacao(JOptionPane.showInputDialog("Número de identificação:"));
        funcionario.setMorada(JOptionPane.showInputDialog("Morada:"));
        funcionario.setTelefone(JOptionPane.showInputDialog("Telefone:"));
        funcionario.setSegurancaSocial(JOptionPane.showInputDialog("Número da Segurança Social:"));
        funcionario.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Salario:")));
        funcionarioListMercado.add(funcionario);
        JOptionPane.showMessageDialog(null,"Funcionário cadastrado com sucesso.");
    }

    public static void cadastroRepositor(){
        Repositor repositor = new Repositor();
        repositor.setNome(JOptionPane.showInputDialog("Nome:"));
        repositor.setApelido(JOptionPane.showInputDialog("Apelido:"));
        repositor.setNumIdentificacao(JOptionPane.showInputDialog("Número de identificação:"));
        repositor.setMorada(JOptionPane.showInputDialog("Morada:"));
        repositor.setTelefone(JOptionPane.showInputDialog("Telefone:"));
        repositor.setSegurancaSocial(JOptionPane.showInputDialog("Número da Segurança Social:"));
        repositor.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Salario:")));
        funcionarioListMercado.add(repositor);
        JOptionPane.showMessageDialog(null,"Repositor cadastrado com sucesso.");
    }

    public static void cadastroSubcontrato(){
        Subcontratado subcontratado = new Subcontratado();
        subcontratado.setNome(JOptionPane.showInputDialog("Nome:"));
        subcontratado.setApelido(JOptionPane.showInputDialog("Apelido:"));
        subcontratado.setNumIdentificacao(JOptionPane.showInputDialog("Número de identificação:"));
        subcontratado.setMorada(JOptionPane.showInputDialog("Morada:"));
        subcontratado.setTelefone(JOptionPane.showInputDialog("Telefone:"));
        subcontratado.setSegurancaSocial(JOptionPane.showInputDialog("Número da Segurança Social:"));
        subcontratado.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Salario:")));
        funcionarioListMercado.add(subcontratado);
        JOptionPane.showMessageDialog(null,"Subcontratado cadastrado com sucesso.");
    }

}

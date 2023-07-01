package unidade6.pratica2;

abstract public class Pessoal {
    private String nome;
    private String CC;
    protected double salario;

    public Pessoal(){

    }

    public Pessoal(String nome, String CC, double salario) {
        this.nome = nome;
        this.CC = CC;
        this.salario = salario;
    }

    public abstract void salario();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCC() {
        return CC;
    }

    public void setCC(String CC) {
        this.CC = CC;
    }

    public double getSalario() {
        return salario;
    }


}

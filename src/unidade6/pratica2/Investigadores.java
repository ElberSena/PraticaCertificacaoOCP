package unidade6.pratica2;

public class Investigadores extends Pessoal{
    private String departamento;

    public Investigadores(){

    }

    public Investigadores(String nome, String CC, double salario, String departamento) {
        super(nome, CC, salario);
        this.departamento = departamento;
    }

    public void salario(){
        this.salario = ((35 * 7) * 4);
    }
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Investigador " +
                "\nNome: " + getNome() +
                "\nCartão Cidadão: " + getCC() +
                "\nsalario: " + salario +
                "\ndepartamento: " + departamento;
    }
}

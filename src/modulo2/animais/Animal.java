package modulo2.animais;

public class Animal {

    private String nome;
    private String descricao;
    private  String raca;
    private int peso;
    private double altura;
    private boolean perigoso;
    private String comida;
    private int quantidadeComida;

    public Animal(String nome, String descricao, String raca, int peso, double altura, boolean perigoso, String comida, int quantidadeComida) {
        this.nome = nome;
        this.descricao = descricao;
        this.raca = raca;
        this.peso = peso;
        this.altura = altura;
        this.perigoso = perigoso;
        this.comida = comida;
        this.quantidadeComida = quantidadeComida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public boolean isPerigoso() {
        return perigoso;
    }

    public void setPerigoso(boolean perigoso) {
        this.perigoso = perigoso;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public int getQuantidadeComida() {
        return quantidadeComida;
    }

    public void setQuantidadeComida(int quantidadeComida) {
        this.quantidadeComida = quantidadeComida;
    }

    public void marcarComoPerigoso(){
        perigoso = true;
    }
    public void alimentar(int quantidade){
        quantidadeComida = quantidade;
    }

    @Override
    public String toString() {
        return "Animais{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", raca='" + raca + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                ", perigoso=" + perigoso +
                ", comida='" + comida +'\'' +
                ", quantidadeComida=" + quantidadeComida + "KG" +
                '}';
    }
}

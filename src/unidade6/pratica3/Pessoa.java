package unidade6.pratica3;

public abstract class Pessoa {
    private String nome;
    private String apelido;
    private String numIdentificacao;
    private String morada;
    private String telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getNumIdentificacao() {
        return numIdentificacao;
    }

    public void setNumIdentificacao(String numIdentificacao) {
        this.numIdentificacao = numIdentificacao;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}

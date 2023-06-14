package unidade6.pratica5;

public abstract class Instrumento {

    private String tipo;
    private String nome;
    private String nota;

    public Instrumento(){

    }
    public Instrumento(String tipo, String nome, String nota){
        this.tipo = tipo;
        this.nome = nome;
        this.nota = nota;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNota(){
        return nota;
    }

    public void setNota(String nota){
        this.nota = nota;
    }

    @Override
    public String toString() {
        return tipo + "... " + nome +
                " (nota " + nota  +
                ')';
    }
}

package unidade6.pratica5;

public class Sopro extends Instrumento {

    public Sopro(String tipo, String nome, String nota) {
        super(tipo, nome, nota);
    }

    public String soprar(String nota){
        return "tocar... " + this.getNome() + " " + "(nota " + nota + ")";
    }
}

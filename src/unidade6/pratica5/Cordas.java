package unidade6.pratica5;

public class Cordas extends Instrumento {
    public Cordas(String tipo, String nome, String nota) {
        super(tipo, nome, nota);
    }

    public String vibar(String nota){
        return "tocar... " + this.getNome() + " " + "(nota " + nota + ")";
    }
}

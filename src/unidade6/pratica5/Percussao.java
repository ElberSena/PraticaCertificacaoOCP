package unidade6.pratica5;

public class Percussao extends Instrumento {

    public Percussao(){

    }

    public Percussao(String tipo , String nome, String nota) {
        super(tipo, nome, nota);
    }


    public String tocar(String nota) {
        return "tocar... " + this.getNome() + " " + "(nota " + nota + ")";
    }
}

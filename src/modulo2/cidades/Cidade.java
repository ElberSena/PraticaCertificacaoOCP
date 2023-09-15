package modulo2.cidades;

import java.util.Objects;

public class Cidade {

    private String nome;
    private String provincia;
    private double habitantes;

    public Cidade(String nome, String provincia, double habitantes) {
        this.nome = nome;
        this.provincia = provincia;
        this.habitantes = habitantes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public double getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(double habitantes) {
        this.habitantes = habitantes;
    }

    @Override
    public String toString() {
        return "\nCidade{" +
                "nome='" + nome + '\'' +
                ", provincia='" + provincia + '\'' +
                ", habitantes=" + habitantes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cidade cidade = (Cidade) o;
        return Double.compare(cidade.habitantes, habitantes) == 0 && Objects.equals(nome, cidade.nome) && Objects.equals(provincia, cidade.provincia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, provincia, habitantes);
    }
}

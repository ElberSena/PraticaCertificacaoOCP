package unidade6.pratica3;

public class Cliente extends Pessoa {
    private String codigoCliente;
    private int numCompras;

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public int getNumCompras() {
        return numCompras;
    }

    public void setNumCompras(int numCompras) {
        this.numCompras = numCompras;
    }

    public void compra (){
        if (numCompras == 100){
            System.out.println("O cliente tem o direito a 1% de desconto em sua compra.");
        }
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "\n nome='" + getNome() +
                "\n apelido='" + getApelido() +
                "\n numIdentificacao='" + getNumIdentificacao() +
                "\n morada='" + getMorada() +
                "\n telefone='" + getTelefone() +
                "\n codigoCliente='" + codigoCliente +
                "\n numCompras=" + numCompras +
                '}';
    }
}

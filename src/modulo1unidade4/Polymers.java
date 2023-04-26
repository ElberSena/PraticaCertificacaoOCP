package modulo1unidade4;

//Nessa atividade prática, deverás escrever uma função que dado um polímero
//        representado com as letras do alfabeto (maiúsculas e minúsculas), processa as
//        reações em cadeia desse polímero e devolve o polímero reduzido.
public class Polymers {
    public static void main(String[] args) {
        StringBuilder teste = new StringBuilder("“CaAdbb");

        System.out.println(polimero(teste));
    }
    public static StringBuilder polimero(StringBuilder poli){
        StringBuilder novaPoli = poli;
        for (int s = 0; s < poli.length(); s++) {
            for (int c = 1; c < poli.length(); c++){
                if ((poli.charAt(s) + 32) == poli.charAt(c)) {
                    poli.deleteCharAt(s);
                    poli.deleteCharAt(c-1);
                    s = 0;
                } else if ((poli.charAt(s) - 32) == poli.charAt(c)) {
                    poli.deleteCharAt(s);
                    poli.deleteCharAt(c-1);
                    s =0;
                }
            }
        }
        return poli;
    }
}

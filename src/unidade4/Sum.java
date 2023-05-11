package unidade4;
//Nessa atividade prática, deverás criar um método com o número sum() que utilize varargs
//        para somar um número indeterminado de valores inteiros e devolver o resultado.

public class Sum {
    public static void main(String[] args) {

        Sum s = new Sum();

        System.out.println(s.sumvarargs(1,2,3,4,5,6,7));


    }
    static int sumvarargs(int...  intArrays) {
        /* Implementar aqui */
        int soma = 0;
        for (int a :
             intArrays) {
            soma += a;
        }
        return soma;
    }

}

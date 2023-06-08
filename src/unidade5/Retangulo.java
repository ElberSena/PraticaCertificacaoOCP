package unidade5;

//A proposta dessa atividade prática é criar uma classe Retângulo com as seguintes
//        características:
//        ● Incluir um construtor ao qual se passam os dados da base e altura. Se tentar dar
//        valor negativo a alguma das dimensões, corrigir o valor positivo utilizando
//        Math.abs(int a).
//        ● Um construtor sem parâmetros que inicializa um novo retângulo com base 2 e
//        altura 1.
//        ● Um método esquadria que indica se o retângulo atual é um quadrado.
//        ● Um método área que calcula a área do retângulo atual.
//        ● Um método perímetro que calcula o perímetro do retângulo atual.
//        ● Um método gira que roda o ângulo atual a 90 graus (intercambiada a base pela
//        altura).
public class Retangulo {
    public static void main(String[] args) {
        Retangulo reto = new Retangulo();
        System.out.println(reto.area());

        Retangulo reto2 = new Retangulo(3,3);

        System.out.println(reto2.esquadria());
    }

    private double base;
    private double altura;

    public Retangulo(){
        this.base = 2;
        this.altura = 1;
    }
    public Retangulo (double base, double altura){
        this.base = Math.abs(base);
        this.altura = Math.abs(altura);
    }

    public boolean esquadria (){
        if (this.base == this.altura){
            return false;
        }else {
            return true;
        }
    }
    public double area (){
        double area = this.base * this.altura;
        return area;
    }
    public double perimetro (){
        double perimetro = (2 * this.base + 2 * this.altura);
        return perimetro;
    }
    public void giraRetangulo (){
        this.base = altura;
        this.altura = base;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

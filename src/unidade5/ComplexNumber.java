package unidade5;

//Defina uma classe ComplexNumber que represente um número real.

public class ComplexNumber {
    public static void main(String args[]){
        ComplexNumber c1 = new ComplexNumber(2,3);
        ComplexNumber c2 = new ComplexNumber(1,2);
        System.out.println(ComplexNumber.subtrair(c1,c2));
        System.out.println(c1.toString());
    }

    private double numReal;
    private double numImaginario;

    public ComplexNumber (){

    }
    public ComplexNumber (double numReal, double numImaginario){
        this.numReal = numReal;
        this.numImaginario =  numImaginario;
    }

    public double getNumReal() {
        return numReal;
    }

    public void setNumReal(double numReal) {
        this.numReal = numReal;
    }

    public double getNumImaginario() {
        return numImaginario;
    }

    public void setNumImaginario(double numImaginario) {
        this.numImaginario = numImaginario;
    }

    @Override
    public String toString() {
        if (numImaginario < 0) {
            return "ComplexNumber(" +
                    numReal +
                    numImaginario +
                    "i)";
        }else {
            return "ComplexNumber(" +
                    numReal +
                    " + " +
                    numImaginario +
                    "i)";
        }
    }

    public static ComplexNumber somar (ComplexNumber c1, ComplexNumber c2){
        ComplexNumber result = new ComplexNumber(c1.numReal + c2.numReal, c1.numImaginario + c2.numImaginario);
        return result;
    }

    public static ComplexNumber subtrair (ComplexNumber c1, ComplexNumber c2){
        ComplexNumber result = new ComplexNumber(c1.numReal - c2.numReal , c1.numImaginario - c2.numImaginario);
        return result;
    }
}

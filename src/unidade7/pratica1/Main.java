package unidade7.pratica1;

public class Main {
    public static void main(String[] args) {
        BackwardsStringCharSequenceTokio charSequenceTokio = new BackwardsStringCharSequenceTokio("elber de sena");
        ArrayCharSequenceTokio arrayCharSequenceTokio = new ArrayCharSequenceTokio("programador java");

        System.out.println(charSequenceTokio.charAt(6));
        System.out.println(charSequenceTokio.subSequence(0,12));
        System.out.println(arrayCharSequenceTokio.subSequence(6,8));







    }
}

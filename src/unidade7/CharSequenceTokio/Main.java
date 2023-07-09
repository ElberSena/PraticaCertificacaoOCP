package unidade7.CharSequenceTokio;

public class Main {
    public static void main(String[] args) {

        ArrayCharSequenceTokio arrayCharSequenceTokio = new ArrayCharSequenceTokio("Elber de Sena");
        BackwardsStringCharSequenceTokio backwardsStringCharSequenceTokio =
                new BackwardsStringCharSequenceTokio("Programador Junior");

        System.out.println(arrayCharSequenceTokio.length());
        System.out.println(arrayCharSequenceTokio.charAt(9));
        System.out.println(arrayCharSequenceTokio.subSequence(9,13));
        System.out.println("-----------------------------------------");
        System.out.println(backwardsStringCharSequenceTokio.length());
        System.out.println(backwardsStringCharSequenceTokio.charAt(13));
        System.out.println(backwardsStringCharSequenceTokio.subSequence(0,10));
    }
}

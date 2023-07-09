package unidade7.CharSequenceTokio;

public class BackwardsStringCharSequenceTokio implements CharSequenceTokio{
    private final String stringChar;

    public BackwardsStringCharSequenceTokio(String StringChar) {
        this.stringChar = StringChar;
    }

    @Override
    public int length() {
        return stringChar.length();
    }

    @Override
    public char charAt(int index) {
        for (int i = 0; i < stringChar.length(); i++){

            return stringChar.charAt(i);
        }
        return 0;
    }
    @Override
    public CharSequenceTokio subSequence(int start, int end) {
        BackwardsStringCharSequenceTokio backCharSequenceTokio;
        String inversa = "";
        if (start == end){
            return backCharSequenceTokio = new BackwardsStringCharSequenceTokio(inversa);
        } else if (start < 0 || end > stringChar.length() || start > end) {
            return null;
        }
        for (int i = end ; i >= start; i--){
            inversa += Character.toString(stringChar.charAt(i));
        }
        return backCharSequenceTokio = new BackwardsStringCharSequenceTokio(inversa);

    }

    @Override
    public String toString() {
        return stringChar;
    }
}

package unidade7.pratica1;

public class BackwardsStringCharSequenceTokio implements CharSequenceTokio{

    private String stringChar;

    public BackwardsStringCharSequenceTokio(String StringChar) {
        this.stringChar = StringChar;
    }

    @Override
    public int length() {
        return stringChar.length();
    }

    @Override
    public char charAt(int index) {
            return stringChar.charAt(index);
    }
    @Override
    public CharSequenceTokio subSequence(int start, int end) {
        CharSequenceTokio backCharSequenceTokio = new BackwardsStringCharSequenceTokio(stringChar);
        if (start == end){
            return backCharSequenceTokio;
        } else if (start < 0 || end > stringChar.length() || start < end) {
            return null;
        }
        return backCharSequenceTokio.subSequence(stringChar.charAt(end), stringChar.charAt(start));


    }

    @Override
    public String toString() {
        return "BackwardsStringCharSequenceTokio{" +
                "chars='" + stringChar + '\'' +
                '}';
    }
}


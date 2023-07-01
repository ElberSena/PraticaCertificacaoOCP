package unidade7.pratica1;

public class ArrayCharSequenceTokio implements CharSequenceTokio{

    private String chars;

    public ArrayCharSequenceTokio(String chars){
        this.chars = chars;
    }

    @Override
    public int length() {

        return chars.length();
    }

    @Override
    public char charAt(int index) {
        for (int i = index; i < chars.length(); i++){
            return chars.charAt(i);
        }
        return 0;
    }

    @Override
    public CharSequenceTokio subSequence(int start, int end) {
        CharSequenceTokio charSequenceTokio = new ArrayCharSequenceTokio(chars);

        if (start == end){
            return charSequenceTokio;
        } else if (start < 0 || end > chars.length() || start < end) {
            return null;
        }
        return charSequenceTokio.subSequence(charAt(start), charAt(end-1));
    }

    @Override
    public String toString() {
        return "ArrayCharSequenceTokio{" +
                "chars='" + chars + '\'' +
                '}';
    }
}

package unidade7.CharSequenceTokio;

import java.util.Arrays;

public class ArrayCharSequenceTokio implements CharSequenceTokio{

    private char [] chars;

    public ArrayCharSequenceTokio(String s) {
        this.chars = s.toCharArray();
    }

    @Override
    public int length() {
        return chars.length;
    }

    @Override
    public char charAt(int index) {
        for (int i = 0; i < chars.length; i++){
            return chars[index];
        }
        return 0;
    }

    @Override
    public CharSequenceTokio subSequence(int start, int end) {
        String novaSequencia = "";
        ArrayCharSequenceTokio arrayCharSequenceTokio;
        if (start == end){
            return arrayCharSequenceTokio = new ArrayCharSequenceTokio("");
        } else if (start < 0 || end > chars.length || start > end){
            return null;
        }
        for (int i = start; i < end; i++){
            novaSequencia += Character.toString(chars[i]);
        }
        return arrayCharSequenceTokio = new ArrayCharSequenceTokio(novaSequencia);
    }

    @Override
    public String toString() {
        return String.valueOf(chars);
    }
}

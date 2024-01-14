package crypto.task.alphabet;

import java.util.HashMap;
import java.util.Map;


public class TextTransisition {
    public  String transLettersRight(int trans, String text) {
        alphabet();

        return "";
    }
    public String transLettersLeft(int trans, String text) {
        return "";
    }



    private Map<String, String> alphabet(int move, int mode) {
        Map<String, String> alphabetLetters = new HashMap<>();;
        if (move == 4) {
            alphabetLetters.put("A", "E");
            alphabetLetters.put("B", "F");

        } else {
            alphabetLetters.put("Z", "A");
        }

        return alphabetLetters;
    }

}

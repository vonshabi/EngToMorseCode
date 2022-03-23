package MorseCode;

import java.util.HashMap;

public class MorseCodeMap {

    private HashMap<Character, String> map;
    private HashMap<String, String> morse;

    public MorseCodeMap() {
        map = new HashMap<>();
        morse = new HashMap<>();

        map.put('a', ".-");
        map.put('b', "-...");
        map.put('c', "-.-.");
        map.put('d', "-..");
        map.put('e', ".");
        map.put('f', "..-.");
        map.put('g', "--.");
        map.put('h', "....");
        map.put('i', "..");
        map.put('j', ".---");
        map.put('k', "-.-");
        map.put('l', ".-..");
        map.put('m', "--");
        map.put('n', "-.");
        map.put('o', "---");
        map.put('p', ".--.");
        map.put('q', "--.-");
        map.put('r', ".-.");
        map.put('s', "...");
        map.put('t', "-");
        map.put('u', "..-");
        map.put('v', "...-");
        map.put('w', ".--");
        map.put('x', "-..-");
        map.put('y', "-.--");
        map.put('z', "--..");

        morse.put(".-", "a");
        morse.put("-...", "b");
        morse.put("-.-.", "c");
        morse.put("-..", "d");
        morse.put(".", "e");
        morse.put("..-.", "f");
        morse.put("--.", "g");
        morse.put("....", "h");
        morse.put("..", "i");
        morse.put(".---", "j");
        morse.put("-.-", "k");
        morse.put(".-..", "l");
        morse.put("--", "m");
        morse.put("-.", "n");
        morse.put("---", "o");
        morse.put(".--.", "p");
        morse.put("--.-", "q");
        morse.put(".-.", "r");
        morse.put("...", "s");
        morse.put("-", "t");
        morse.put("..-", "u");
        morse.put("...-", "v");
        morse.put(".--", "w");
        morse.put("-..-", "x");
        morse.put("-.--", "y");
        morse.put("--..", "z");

        map.forEach((value, key) -> morse.put(String.valueOf(value), key));
    }


    public String EngToMorse(String e) {
        char[] arr = e.toUpperCase().toCharArray();
        StringBuilder result = new StringBuilder();
        for (char ch : arr) {
        result.append(getEngToMorse(ch));
        }
        return result.toString();
    }
    public String getEngToMorse(char ch) {
        if (!map.containsKey(ch)) {
            throw new IllegalArgumentException("Cannot read. Try again.");
        }
        return map.get(ch) + "";
    }

    public String MorseToEng(String morse) {
        StringBuilder result = new StringBuilder();
        String[] arr = morse.split("");
        for (String ch : arr) {
            result.append(getMorseToEng(ch));
        }
        return result.toString();
    }

    public String getMorseToEng(String m) {
        if (!morse.containsKey(m)) {
            throw new IllegalArgumentException("Cannot read. Please try again.");
        }
        return morse.get(m) + "";
    }
}



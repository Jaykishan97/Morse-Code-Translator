package com.morsecode;

import java.util.HashMap;

public class MorseCode {
    private static HashMap<Character, String> charToMorseMap;
    private static HashMap<String, Character> morseToCharMap;
    
    static {
        charToMorseMap = new HashMap<Character, String>();
        morseToCharMap = new HashMap<String, Character>();
        
        charToMorseMap.put('A', ".-");
        charToMorseMap.put('B', "-...");
        charToMorseMap.put('C', "-.-.");
        charToMorseMap.put('D', "-..");
        charToMorseMap.put('E', ".");
        charToMorseMap.put('F', "..-.");
        charToMorseMap.put('G', "--.");
        charToMorseMap.put('H', "....");
        charToMorseMap.put('I', "..");
        charToMorseMap.put('J', ".---");
        charToMorseMap.put('K', "-.-");
        charToMorseMap.put('L', ".-..");
        charToMorseMap.put('M', "--");
        charToMorseMap.put('N', "-.");
        charToMorseMap.put('O', "---");
        charToMorseMap.put('P', ".--.");
        charToMorseMap.put('Q', "--.-");
        charToMorseMap.put('R', ".-.");
        charToMorseMap.put('S', "...");
        charToMorseMap.put('T', "-");
        charToMorseMap.put('U', "..-");
        charToMorseMap.put('V', "...-");
        charToMorseMap.put('W', ".--");
        charToMorseMap.put('X', "-..-");
        charToMorseMap.put('Y', "-.--");
        charToMorseMap.put('Z', "--..");
        charToMorseMap.put('0', "-----");
        charToMorseMap.put('1', ".----");
        charToMorseMap.put('2', "..---");
        charToMorseMap.put('3', "...--");
        charToMorseMap.put('4', "....-");
        charToMorseMap.put('5', ".....");
        charToMorseMap.put('6', "-....");
        charToMorseMap.put('7', "--...");
        charToMorseMap.put('8', "---..");
        charToMorseMap.put('9', "----.");
        charToMorseMap.put('.', ".-.-.-");
        charToMorseMap.put(',', "--..--");
        charToMorseMap.put('?', "..--..");
        charToMorseMap.put('\'', ".----.");
        charToMorseMap.put('!', "-.-.--");
        charToMorseMap.put('/', "-..-.");
        charToMorseMap.put('(', "-.--.");
        charToMorseMap.put(')', "-.--.-");
        charToMorseMap.put('&', ".-...");
        charToMorseMap.put(':', "---...");
        charToMorseMap.put(';', "-.-.-.");
        charToMorseMap.put('=', "-...-");
        charToMorseMap.put('+', ".-.-.");
        charToMorseMap.put('-', "-....-");
        charToMorseMap.put('_', "..--.-");
        charToMorseMap.put('"', ".-..-.");
        charToMorseMap.put('$', "...-..-");
        charToMorseMap.put('@', ".--.-.");
        charToMorseMap.put(' ', "/");
        
        for (Character key : charToMorseMap.keySet()) {
            morseToCharMap.put(charToMorseMap.get(key), key);
        }
    }
    
    public static String toMorseCode(String text) {
        StringBuilder morseCode = new StringBuilder();
        
        for (char c : text.toUpperCase().toCharArray()) {
            if (charToMorseMap.containsKey(c)) {
                morseCode.append(charToMorseMap.get(c)).append(" ");
            } else {
                return "Invalid character: " + c;
            }
        }
        
        return morseCode.toString().trim();
    }
    
    public static String toText(String morseCode) {
        StringBuilder text = new StringBuilder();
        
        String[] words = morseCode.split(" / ");
        for (String word : words) {
            String[] letters = word.split(" ");
            for (String letter : letters) {
                if (morseToCharMap.containsKey(letter)) {
                    text.append(morseToCharMap.get(letter));
                } else if (letter.isEmpty()) {
                    text.append(" ");
                } else {
                    return "Invalid Morse code: " + morseCode;
                }
            }
            text.append(" ");
        }
        
        return text.toString().trim();
    }
}

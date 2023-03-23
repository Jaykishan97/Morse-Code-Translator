package com.morsecode;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueTranslating = true;
        while (continueTranslating) {
            System.out.println("Select an option:");
            System.out.println("1. Text to Morse code");
            System.out.println("2. Morse code to text");
            System.out.println("3. Quit");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Enter text to translate to Morse code:");
                    String textToMorse = scanner.nextLine();
                    String morseCode = MorseCode.toMorseCode(textToMorse);
                    if (morseCode.startsWith("Error")) {
                        System.out.println(morseCode);
                    } else {
                        System.out.println(morseCode);
                    }
                    break;
                case 2:
                    System.out.println("Enter Morse code to translate to text:");
                    String morseToText = scanner.nextLine();
                    String text = MorseCode.toText(morseToText);
                    if (text.startsWith("Error")) {
                        System.out.println(text);
                    } else {
                        System.out.println(text);
                    }
                    break;
                case 3:
                    System.out.println("Quitting program...");
                    continueTranslating = false;
                    break;
                default:
                    System.out.println("Invalid option selected. Please select again.");
                    break;
            }
            System.out.println();
        }
        scanner.close();
    }
}
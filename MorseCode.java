package MorseCode;

import java.util.HashMap;
import java.util.Scanner;

public class MorseCode {
    public static void main(String[] args) {
        MorseCodeMap mc = new MorseCodeMap();
        Scanner scan = new Scanner(System.in);
        HashMap<Character, String> map = new HashMap<>();
        System.out.println("Morse Code Translator");
        System.out.println("Welcome!");
        System.out.println("-----SELECT AN OPTION BELOW-----");
        System.out.println("1. English to Morse code");
        System.out.println("2. Morse code to English");

        int option = 0;
        try {
            option = Integer.parseInt(scan.nextLine());
        } catch (Exception e) {
            System.out.println("Incorrect typing. Restart the program and try again.");
        }

        String english = scan.nextLine();
        char[] array = english.toUpperCase().toCharArray();
        String result = "";
        for (char ch : array) {
            result += map.get(ch);

            try {
                if (option == 1) {
                    System.out.println("Enter English scentence: ");
                    String morse = scan.nextLine();
                    result = mc.MorseToEng(morse);
                    System.out.println("Morse code: " + result);

                } else if (option == 2) {
                    System.out.println("Enter Morse code: ");
                    try {
                        String morse = scan.nextLine();
                        result = mc.getMorseToEng(morse);
                    } catch (Exception d) {
                        System.out.println("Did you really type it in correctly? Please exit and try again.");
                        System.exit(0);
                    }
                    System.out.println("English: " + result);
                } else {
                    System.out.println("Error: Option not valid. Please restart the program.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                System.exit(0);
            }
        }
    }
}
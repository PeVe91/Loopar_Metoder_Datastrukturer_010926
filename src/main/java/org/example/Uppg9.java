package org.example;

import java.util.Scanner;

/*
---Skriv ett program som frågar användaren efter en mening och sedan:
---Skriver ut antalet tecken.
---Skriver ut meningen i versaler.
---Skriver ut meningen baklänges.
Kontrollerar om meningen innehåller ordet "Java"
*/

public class Uppg9 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        IO.println("Enter a full sentence: ");
        String inputString = scanner.nextLine();
        StringBuilder sb = new StringBuilder(inputString);
        int stringLength = inputString.length();


        IO.println(stringLength);
        IO.println(inputString.toUpperCase());
        IO.println(sb.reverse());
        containsJava(inputString);


    }

    private static void containsJava(String inputString) {

        if (inputString.toLowerCase().contains("java")) {
            IO.println("Sentence contains \"Java\"");
        } else {
            IO.println("Sentence doesn't contain \"Java\"");
        }
    }
}

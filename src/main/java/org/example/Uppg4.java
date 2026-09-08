package org.example;
/*

 */
public class Uppg4 {
    static void main() {

        String concatenated = "";
        String inputString;
        while(true) {

            inputString = IO.readln("Enter a word: ");

            if (inputString.isEmpty() || inputString.equals(".")) {
                break;
            }

            concatenated += inputString;

        }
        IO.println(concatenated);
    }
}

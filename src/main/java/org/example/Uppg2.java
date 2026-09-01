package org.example;

public class Uppg2 {
    static void main() {

        int number = 65536;

        while (number > 2) {

            System.out.println(number);

            number >>= 1;
        }
    }
}

package org.example;

/*
Skriv ett program som har talet 65536 i en variabel.
Så länge som variabeln är större än 2 ska programmet loopa,
skriva ut talet och sedan dela variabeln med 2.
Tips: Division med 2 i en dator är samma sak som att
skifta alla bitar ett steg höger.
*/

public class Uppg2 {
    static void main() {

        int number = 65536;

        while (number > 2) {

            System.out.println(number);

            number >>= 1;
        }
    }
}

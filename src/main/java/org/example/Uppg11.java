package org.example;
/*

 */
public class Uppg11 {
    static void main() {

        Uppg11Bok bok = new Uppg11Bok("Pers äventyr", "Per", 1991 );

        System.out.println(description (bok));
    }

    public static String description(Uppg11Bok b) {

        return "Titel: " + b.title() + "\n" +
                "Author: " + b.author() + "\n" +
                "Year: " + b.year();

    }

}

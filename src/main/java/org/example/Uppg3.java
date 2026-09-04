package org.example;
/*
Skapa en funktion som returnerar hur många värden som är true i en array.
Exempel
countTrue([true, false, false, true, false]) ➞ 2
countTrue([false, false, false, false]) ➞ 0
countTrue([]) ➞ 0
Returnera 0 om arrayen är tom.
*/
public class Uppg3 {
    static void main() {

        int size = Integer.parseInt(IO.readln("Bestäm storlek på arrayen:"));
        int[] inputNumbers = new int[size];

        for (int i = 0; i < inputNumbers.length; i++) {
            inputNumbers[i] = Integer.parseInt
                    (IO.readln("Mata in tal " + (i + 1) + ": "));
        }

        IO.println("Antal true: " + convertToBooleans(inputNumbers));

    }

    static int convertToBooleans (int[] numbers) {
        boolean[] countBoolean = new boolean[numbers.length];

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 0) {
                countBoolean[i] = true;
            }
        }

        int count = 0;

        for (boolean i : countBoolean) {
            if (i) count++;
        }
        /*
        Alternativt:
        //for (int i = 0; i < numbers.length; i++) {
        //    if (countBoolean[i])
        //        count++;
        */
        return count;
    }
}

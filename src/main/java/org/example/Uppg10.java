package org.example;

/*

*/

public class Uppg10 {
    static void main() {
        int[] numbersArray = new int[] {1, 2, 3};
        String sentence;



        System.out.println(sum(numbersArray[0], numbersArray[1]));
        System.out.println(sum(numbersArray[0], numbersArray[1], numbersArray[2]));
        System.out.println(sum(numbersArray));
        System.out.println(sum("1234"));

    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static int sum(int[] sumArray) {
        int sum = 0;
        for (int i = 0; i < sumArray.length; i++) {
            sum += sumArray[i];
        }
        return sum;
    }

    static int sum(String inputString) {
        int sum = 0;
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            sum += Character.getNumericValue(c);
        }
        return sum;
    }
}

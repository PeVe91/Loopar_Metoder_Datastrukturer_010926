package org.example;
/*

*/
public class Uppg7 {
    static void main() {

        int[] numbers = {5, 12, 8, 21, 3};
        smallestAndGreatest(numbers);
        IO.println("Sum: " + add(numbers));

    }

    private static void smallestAndGreatest(int[] numbers) {
        //int greatest = Integer.MIN_VALUE;
        //int smallest = Integer.MAX_VALUE;
        int greatest = numbers[0];
        int smallest = numbers[0];

        for (int number : numbers) {
            if (number > greatest) {
                greatest = number;
                //greatest= Math.max(max, number);
            }
            if (number < smallest) {
                smallest = number;
            }
        }
        IO.println("Greatest: " + greatest);
        IO.println("Smallest: " + smallest + "\n");
    }
    static int add(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}


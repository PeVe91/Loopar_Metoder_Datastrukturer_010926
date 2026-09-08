package org.example;
/*

*/
public class Uppg7 {
    static void main() {

        int[] numbers = {5, 12, 8, 21, 3};
        smallestGreatest(numbers);
        IO.println("Sum: " + add(numbers));

    }

    private static void smallestGreatest(int[] numbers) {
        int greatest = numbers[0];
        int smallest = numbers[0];

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > greatest){
                greatest = numbers[i];
            }
            if (numbers[i] < smallest){
                smallest = numbers[i];
            }
        }
        IO.println("Greatest: " + greatest);
        IO.println("Smallest: " + smallest + "\n");
    }
    static int add(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        return sum;
    }
}


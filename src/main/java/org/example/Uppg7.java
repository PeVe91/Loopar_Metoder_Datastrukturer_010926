package org.example;
/*

 */
public class Uppg7 {
    static void main() {
        int[] numbers = {5, 12, 8, 21, 3};

        int greatest = numbers[0];
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > greatest){
                greatest = numbers[i];
            }
        }
    }
}


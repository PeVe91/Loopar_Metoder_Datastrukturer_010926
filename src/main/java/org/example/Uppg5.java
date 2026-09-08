package org.example;
/*

 */
public class Uppg5 {
    static void main() {

        int count = 0;
        int secretNumber = (int) (Math.random() * 100) + 1;

        while (true) {
            int inputNumber = Integer.parseInt(IO.readln("Take a guess: "));

            if (inputNumber > secretNumber) {
                count++;
                IO.println("Too big.");
            } else if (inputNumber < secretNumber) {
                count++;
                IO.println("Too small.");
            } else {
                count++;
                break;
            }
        }

        IO.println("You guessed the secret number: " + secretNumber);
        IO.println("Number of tries: " + count);

    }
}

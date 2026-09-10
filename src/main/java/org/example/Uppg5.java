package org.example;

import java.util.Random;

/*

 */
public class Uppg5 {
    static void main() {

        int count = 0;
        //int secretNumber = new Random().nextInt(101);
        int secretNumber = (int) (Math.random() * 100 + 1);

        while (true) {
            int inputNumber = Integer.parseInt(IO.readln("Take a guess: "));
            count++;

            if (inputNumber > secretNumber)
                IO.println("Too big.");
            else if (inputNumber < secretNumber)
                IO.println("Too small.");
            else
                break;
        }

        IO.println("You guessed the secret number: " + secretNumber);
        IO.println("Number of tries: " + count);

    }
}

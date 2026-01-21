import java.util.Scanner;
import java.util.Random;

/**
 * Exercise 9: Number Guessing Game
 * PT821 - Object-Oriented Programming
 *
 * TASK:
 * Create a game where:
 * 1. Computer generates a random number between 1 and 100
 * 2. User tries to guess the number
 * 3. Program gives hints (too high, too low)
 * 4. Uses a while loop until user guesses correctly
 * 5. Counts the number of attempts
 *
 * CONCEPTS PRACTICED:
 * - while loop
 * - if-else statements
 * - Random number generation
 * - Counter variable
 */
public class Exercise9_NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("=== Number Guessing Game ===\n");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("Try to guess it!\n");

        // Generate random number between 1 and 100
        int secretNumber = random.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;

        // Game loop - continues until correct guess
        while (guess != secretNumber) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < secretNumber) {
                System.out.println("Too low! Try again.\n");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.\n");
            } else {
                System.out.println("\n🎉 Congratulations!");
                System.out.println("You guessed it in " + attempts + " attempts!");

                // Rating based on attempts
                if (attempts <= 5) {
                    System.out.println("Rating: Excellent! You're a mind reader!");
                } else if (attempts <= 10) {
                    System.out.println("Rating: Good job!");
                } else {
                    System.out.println("Rating: You got it eventually!");
                }
            }
        }

        scanner.close();
    }
}

/*
 * SAMPLE OUTPUT:
 * =============
 *
 * === Number Guessing Game ===
 *
 * I'm thinking of a number between 1 and 100.
 * Try to guess it!
 *
 * Enter your guess: 50
 * Too low! Try again.
 *
 * Enter your guess: 75
 * Too high! Try again.
 *
 * Enter your guess: 62
 * Too low! Try again.
 *
 * Enter your guess: 68
 *
 * 🎉 Congratulations!
 * You guessed it in 4 attempts!
 * Rating: Excellent! You're a mind reader!
 *
 * EXTENSION CHALLENGE:
 * - Add a maximum number of attempts (e.g., 10)
 * - Add difficulty levels (1-50, 1-100, 1-1000)
 * - Allow user to play again without restarting
 */

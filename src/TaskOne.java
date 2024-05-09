import java.util.Random;
import java.util.Scanner;
public class TaskOne
{
    public static void main(String[] args) {
        System.out.println("***Number Guessing Generator***\n\nYou have 3 attempts to guess the corrct number. Good Luck\n");
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 10;
        int totalAttempts = 0;
        int roundsWon = 0;

        String playAgainResponse;
        do {
            int numberToGuess = random.nextInt(maxRange - minRange + 1) + minRange;
            System.out.println("Guess a number between " + minRange + " and " + maxRange + ":");
            int attempts = 0;
            int userGuess;

            while (attempts < 3) {
                userGuess = input.nextInt();
                attempts++;
                totalAttempts++;

                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    roundsWon++;
                    break;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low. Try again:");
                } else {
                    System.out.println("Too high. Try again:");
                }
            }

            if (attempts >= 3) {
                System.out.println("Out of attempts! The correct number was: " + numberToGuess);
            }

            System.out.println("Do you want to play again? (yes/no)");
            playAgainResponse = input.next();
        } while (playAgainResponse.equalsIgnoreCase("yes"));

        if (roundsWon > 0) {
            System.out.println("Game over! You won " + roundsWon + " rounds with an average of " +
                    (totalAttempts / roundsWon) + " attempts per round.");
        } else {
            System.out.println("Game over! You didn't win any rounds.");
        }
        input.close();
    }
}

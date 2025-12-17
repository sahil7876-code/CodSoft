import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int totalScore = 0;
        int round = 1;

        System.out.println("===== NUMBER GUESSING GAME =====");

        while (true) {

            System.out.println("\n--- Round " + round + " ---");

            //Random number WITHOUT using Random class
            int numberToGuess = (int)(Math.random() * 100) + 1;

            int attemptsAllowed = 7;
            int attemptsUsed = 0;
            boolean guessedCorrectly = false;
            while (attemptsUsed < attemptsAllowed) {

                System.out.print("Enter your guess (1-100): ");
                int guess = sc.nextInt();
                attemptsUsed++;

                if (guess == numberToGuess) {
                    System.out.println("Correct! You guessed it in " + attemptsUsed + " attempts.");
                    int roundScore = (attemptsAllowed - attemptsUsed + 1) * 10;
                    totalScore += roundScore;
                    System.out.println("Round Score: " + roundScore);
                    guessedCorrectly = true;
                    break;
                } 
                else if (guess > numberToGuess) {
                    System.out.println("Too high!");
                } 
                else {
                    System.out.println("Too low!");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("You lost! The correct number was: " + numberToGuess);
            }

            System.out.println("Total Score: " + totalScore);

            System.out.print("Play again? (yes/no): ");
            String choice = sc.next();

            if (!choice.equalsIgnoreCase("yes")) {
                break;
            }

            round++;
        }

        System.out.println("\n===== GAME OVER =====");
        System.out.println("Final Score: " + totalScore);
        System.out.println("Rounds Played: " + round);

        sc.close();
    }
}

import java.util.Scanner;
import java.util.Random;
  public class NUMBER_GAME{
  
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int attemptsLimit = 5;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        boolean playAgain = true;
        while (playAgain) {
            int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = attemptsLimit;

            System.out.println("\nI have selected a number between " + minRange + " and " + maxRange + ". Guess it!");

            while (attempts > 0) {
                System.out.print("Enter your guess (" + attempts + " attempts remaining): ");
                int guess = scanner.nextInt();

                if (guess == randomNumber) {
                    score++;
                    System.out.println("Congratulations! You guessed the correct number.");
                    break;
                } else if (guess < randomNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }

                attempts--;
            }

            if (attempts == 0) {
                System.out.println("Sorry, you have run out of attempts. The correct number was " + randomNumber + ".");
            }

            System.out.println("\nYour score: " + score);
            System.out.print("Do you want to play again? (yes/no): ");
            String playChoice = scanner.next().toLowerCase();
            playAgain = playChoice.equals("yes") || playChoice.equals("y");
        }

        System.out.println("\nThanks for playing! Your final score is: " + score);
        scanner.close();
    }
}


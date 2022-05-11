
import java.util.Scanner;

public class numberGuess {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int trails = 6;
        int guess =0;
        int count = 0;
        String name;
        char again = 'y';

        System.out.println("Hello! What is your name? \n ");
        System.out.print("> ");
        try {
        name = sc.next(); }
        catch (Exception e){
            return;
        }

        while (again != 'n') {

            int randomNumber = 1 + (int) (20 * Math.random());

            System.out.println("\nWell, " + name + ", I am thinking of a number between 1 and 20.");

            if (randomNumber == 0) {

                randomNumber++;
            }
            do {
                System.out.println("Take a guess.");
                try {
                    guess = sc.nextInt();
                    count++;
                } catch (Exception e){
                    System.out.println("Pick a number between 1 and 20.");
                    sc.nextLine();
                    continue;
                }

                if (randomNumber > guess) {
                    System.out.println("The number is greater than " + guess);
                } else if (randomNumber < guess) {
                    System.out.println("The number is less than " + guess);
                }
            }
            while (guess != randomNumber && count <= trails - 1);

            if (guess == randomNumber && count <= trails) {
                System.out.println("Good job, " + name + "! You guessed my number in " + count + " guesses!");
                System.out.println("Would you like to play again? (y or n)");
                try {
                again = sc.next().charAt(0);
                    count = 0;
                } catch (Exception e) {
                    break;
                }

            } else {
                System.out.println("You are out of attempts. \nThe number was " + randomNumber);
                System.out.println("Would you like to play again? (y or n)");
                try {
                    again = sc.next().charAt(0);
                    count = 0;
                } catch (Exception e) {
                    break;
                }

            }
        }
    }
}
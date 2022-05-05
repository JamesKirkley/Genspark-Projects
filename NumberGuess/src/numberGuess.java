import java.util.Scanner;

public class numberGuess {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int randomNumber = 1 + (int) (20 * Math.random());
        int trails = 6;
        int i;
        int guess;
        int count = 0;
        String name;
        String again = null;

        while(true) {
            System.out.println("Hello! What is your name? \n ");
            System.out.print("> ");
            name = sc.next();

            System.out.println("\nWell, " + name + ", I am thinking of a number between 1 and 20.");


            for (i = 0; i < trails; i++) {
                System.out.println("Take a guess.");
                guess = sc.nextInt();
                count++;

                if (randomNumber == guess) {
                    System.out.println("Good job, " + name + "! You guessed my number in " + count + " guesses!");
                    System.out.println("Would you like to play again? (y or n)");
                    again = sc.next();
                    if (again.equalsIgnoreCase("y")) {
                        
                    } else if(again.equalsIgnoreCase("n")){
                        System.out.println("Goodbye!");
                        break;
                    }
                } else if (randomNumber > guess && i != trails - 1) {
                    System.out.println("The number is greater than " + guess);
                } else if (randomNumber < guess && i != trails - 1) {
                    System.out.println("The number is less than " + guess);
                }
            }
            if (i > trails) {
                System.out.println("You are out of attempts.");
                System.out.println("The number was " + randomNumber);
            }
        }
    }

}

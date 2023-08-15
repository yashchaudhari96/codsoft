import java.util.Scanner;
import java.util.Random;

	public class Task1
	{
	    public static void main(String[] k)
	    {
	        Scanner sc = new Scanner(System.in);
	        Random random = new Random();

	        System.out.println("Number Guessing Game!");

	      
	        int maxAttempts = 5;
	        int round = 1;
	        int attempts = 0;
	        while (true) {
		        System.out.println("Round no: "+round);


	            int randno = random.nextInt(100) + 1;

	            while (attempts < maxAttempts)
	            {
	                System.out.print("Enter your guess 1 to 100 :  ");
	                int guess = sc.nextInt();
	                attempts++;

	                if (guess == randno) {
	                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts!");
	                    break;
	                    } 
	                else if (guess < randno) {
	                    System.out.println("low! Try again.");
	                } else {
	                    System.out.println("high! Try again.");
	                }
	            }

	            if (attempts == maxAttempts) {
	                System.out.println("Oops! The correct number was: " + randno);
	            }

	            System.out.print("Do you want to play again? (yes/no): ");
	            String playAgain = sc.next();
	            if (!playAgain.equalsIgnoreCase("yes")) {
	                break;
	            }

	            round++;
	            maxAttempts= maxAttempts + 5;
	            
	        }

	        System.out.println("\nGame over !!");
	        sc.close();
	    }
	}



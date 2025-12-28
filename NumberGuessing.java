package Projects;
import java.util.Scanner;
import java.util.Random;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        int secretNumber = rand.nextInt(100) + 1;
        int userGuess;

        System.out.println("----------------------");
        System.out.println(" NUMBER GUESSING GAME ");
        System.out.println("----------------------");
		        System.out.println("\nInstructions");
        System.out.println("⚫If your guess is greater than the number by 10 or lower than the number by 10 - the system will output 'Cold'\r\n"
        		+ "⚫If your guess is within a + / - 10 range from the number, the system will output 'Hot'\r\n"
        		+ "⚫You have unlimited attempts.\n");

        while (true) {
            System.out.print("Enter a number between 1 and 100: ");
            
            try {
                userGuess = sc.nextInt();
                if (userGuess < 1 || userGuess > 100) {
                    throw new Exception(); 
                }

                if (userGuess == secretNumber) {
                    System.out.println("🎉🎊You guessed it Right!🎊🎉");
                    break;
                } else if (userGuess > (secretNumber + 10) || userGuess < (secretNumber - 10)) {
                    System.out.println("Cold❄️\n");
                } else {
                    System.out.println("Hot🔥\n");
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a number between 1 and 100.");
                break;
            }
        }
        sc.close();
    }
}
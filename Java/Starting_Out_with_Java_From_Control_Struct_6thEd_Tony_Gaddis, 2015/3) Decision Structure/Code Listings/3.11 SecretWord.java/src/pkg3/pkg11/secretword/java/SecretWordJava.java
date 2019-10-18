import java.util.Scanner; // Needed for the Scanner class


 public class SecretWord
 {
 public static void main(String[] args)
 {
 String input; // To hold the user's input

 // Create a Scanner object for keyboard input.
 Scanner keyboard = new Scanner(System.in);

 // Prompt the user to enter the secret word.
 System.out.print("Enter the secret word: ");
 input = keyboard.nextLine();

 // Determine whether the user entered the secret word.
 if (input.equalsIgnoreCase("PROSPERO"))
 {
 System.out.println("Congratulations! You know the " +
 "secret word!");
 }
 else
     System.out.println("Sorry ! You don't  know the " +
 "secret word!");
     
 }
 }

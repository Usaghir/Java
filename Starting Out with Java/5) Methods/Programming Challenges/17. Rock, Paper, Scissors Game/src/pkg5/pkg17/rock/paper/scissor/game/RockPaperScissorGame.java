/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.pkg17.rock.paper.scissor.game;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author umerraja
 */
public class RockPaperScissorGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        int CompChoiseInt;
        String ComputerChoice,UserChoice, winner;

        Scanner keyboard = new Scanner(System.in);
        Random randomNumbers = new Random();
        do
        {
        
        CompChoiseInt = randomNumbers.nextInt(2);
        ComputerChoice=ComputerChoice(CompChoiseInt);
         
        System.out.println("Please enter your valid choice");
        UserChoice= keyboard.nextLine();
         
        System.out.println("Computer choise is: "+ComputerChoice);
        winner=WinerFind(ComputerChoice,UserChoice);
        
        }while(winner.equals("Playagain"));
        
        System.out.println("The Winner is" +winner);
    }
    public static String WinerFind(String ComputerChoice, String UserChoice)
    {          
        if (ComputerChoice.equalsIgnoreCase("rock") && UserChoice.equalsIgnoreCase("scissor") )
                 return "Computer";  
        else if (ComputerChoice.equalsIgnoreCase("rock") && UserChoice.equalsIgnoreCase("paper") )
                 return "user"; 
        else if (ComputerChoice.equalsIgnoreCase("scissor") && UserChoice.equalsIgnoreCase("rock") )
                 return "user"; 
        else if (ComputerChoice.equalsIgnoreCase("scissor") && UserChoice.equalsIgnoreCase("paper") )
                 return "Computer";
        else if (ComputerChoice.equalsIgnoreCase("paper") && UserChoice.equalsIgnoreCase("scissor") )
                return "user"; 
        else if (ComputerChoice.equalsIgnoreCase("paper") && UserChoice.equalsIgnoreCase("rock") )
                 return "Computer";
        else
                return "Playagain";
    }

   
    
    public static String ComputerChoice(int CompChoiseInt)
    { 
        switch (CompChoiseInt)
        {
        case 1:
        return "rock";
        case 2:
        return "paper";
        default:
        return "scissor";  
        }
        
    }
}

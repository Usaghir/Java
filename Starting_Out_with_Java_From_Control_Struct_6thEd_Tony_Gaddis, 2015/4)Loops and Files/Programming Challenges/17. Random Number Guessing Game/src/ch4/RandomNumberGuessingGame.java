/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author umerraja
 */
public class RandomNumberGuessingGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int number, guess=0;
        String input;
        Random randomNumbers = new Random();
        
        number = randomNumbers.nextInt(10)+1;
        
          //JOptionPane.showMessageDialog(null, " the number is "+ number);
        
        while (guess != number) 
        { 
        input = JOptionPane.showInputDialog("Enter the number you think is genrated");
        guess= Integer.parseInt(input);
        
        if (guess > number)
            JOptionPane.showMessageDialog(null, "Too high, try again.");
        else if (guess < number)
            JOptionPane.showMessageDialog(null, "Too low, try again");
        else 
            JOptionPane.showMessageDialog(null, " Yes you are right ");
        }   
        System.exit(0);
    }
    
}

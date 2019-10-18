/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg18.esp.game;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author umerraja
 */
public class ESPGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
          int number, guess=0, count=0;
        String input,colour, Colouruser ;
        
        
        Random randomNumbers = new Random();
        for (int i=1; i<=10;i++)
        {
        number = randomNumbers.nextInt(4);
        
        colour=CompGuss(number);
        input=JOptionPane.showInputDialog("Plese enter you guess");
        if (colour.equalsIgnoreCase(input))
        {
            count++;
        }
        displayComColour(colour);
        }
        JOptionPane.showMessageDialog(null, " User guessed "+count+" times");
        System.exit(0);
    }
        public static void displayComColour(String colour)
        {
            JOptionPane.showMessageDialog(null, " The number computer selected is"+colour);
        }
    
        public static String CompGuss(int number)
        
        {
        String colour;
        switch (number)
        {
                case 1:
                colour="Red";
                break;
                case 2:
                colour="Green";
                break;
                case 3:
                colour="Blue";
                break;
                case 4:
                colour="Orange";
                break;
                default:
                colour="Yellow";
                
                
        }
        return colour;
        
        }
    
}

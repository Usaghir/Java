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
public class ESPGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         int number, guess=0, count=0;
        String input, colour="";
        Random randomNumbers = new Random();
        
        
        
        number = randomNumbers.nextInt(4);
        
        switch (number)
        {
                case 0:
                colour="Red";
                break;
                case 1:
                colour="Green";
                break;
                case 2:
                colour="Blue";
                break;
                case 3:
                colour="Orange";
                break;
                case 4:
                colour="Yellow";
                break;            
        }
          JOptionPane.showMessageDialog(null, " the number is  "+ number);
        
        for (int i=1; i <= 10; i++) 
        { 
        input = JOptionPane.showInputDialog("Enter the coulour you think is genrated ");
        
            if(input.compareToIgnoreCase(colour) == 0)
            {
            count++;
            }  
        }
        JOptionPane.showMessageDialog(null, " total number of coreect guess are "+count);
        System.exit(0);
        // TODO code application logic here
        // TODO code application logic here
    }
    
}

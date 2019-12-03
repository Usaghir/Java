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
public class SlotMachineSimulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number;
        char Senital;
        double Amount,totalAmount=0, WinAmount, WinAmountTot=0;
        String input, colour="", colour1="", colour2="", colour3="";
        // TODO code application logic here
        
        do {
            input = JOptionPane.showInputDialog("Enter the the amount you want to gamble");
            Amount= Double.parseDouble(input);
        
            Random randomNumbers = new Random();
            
                for (int i=1; i <= 3; i++)
                {
                number = randomNumbers.nextInt(5);
        
                    switch (number)
                    {   
                    case 0:
                    colour="Cherries";
                    break;
                    case 1:
                    colour="Oranges";
                    break;
                    case 2:
                    colour="Plums";
                    break;
                    case 3:
                    colour="Bells";
                    break;
                    case 4:
                    colour="Melons";
                    break;
                    case 5:
                    colour="Bars";
                    break;            
                    }
                    switch (i)
                    {
                        case 1:
                        colour1=colour;
                        break;
                        case 2:
                        colour2=colour;
                        break;
                        case 3:
                        colour3=colour;
                        break;
                        
                    }
                   
                }
                 
                JOptionPane.showMessageDialog(null, " The word1 is "+colour1+" word2 is "+colour2+ " word3"+colour3 );
                if((colour1.compareToIgnoreCase(colour2) == 0) && (colour2.compareToIgnoreCase(colour3) == 0))
                {
                    WinAmount=Amount+Amount+Amount;
                JOptionPane.showMessageDialog(null, "You won $" +WinAmount );
                }
                else if ((colour1.compareToIgnoreCase(colour2) != 0) && (colour2.compareToIgnoreCase(colour3) != 0)&&(colour1.compareToIgnoreCase(colour3) != 0))
                {
                    WinAmount=0;
                JOptionPane.showMessageDialog(null, "You won $" + WinAmount);
                }
                else 
                {
                    WinAmount=Amount+Amount;
                JOptionPane.showMessageDialog(null, "You won $" +WinAmount);
                }
                WinAmountTot+=WinAmount;
                totalAmount+=Amount;
                input = JOptionPane.showInputDialog("Please enter the y or Y for pleay again and n or N to stop or any other key ot continue ");
                Senital= input.charAt(0);
        
            }while (Senital == 'y' || Senital == 'Y' );
        
        JOptionPane.showMessageDialog(null, "You Spent $" +totalAmount );
        JOptionPane.showMessageDialog(null, "You won $" +WinAmountTot);
        
        System.exit(0);
        
    }
    
}

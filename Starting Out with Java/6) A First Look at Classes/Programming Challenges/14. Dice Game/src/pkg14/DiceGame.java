/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg14;

import javax.swing.JOptionPane;

/**
 *
 * @author umerraja
 */
public class DiceGame 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int userWin=0, ComWin=0, tie=0;
        String GrandWinner;
        
    Dice userDice = new Dice(6);
    Dice comDice = new Dice(6);
  
    for (int i=1; i<=10; i++)
    {
    userDice.rollDice();
       
    comDice.rollDice();
 
        if (userDice.getValue() > comDice.getValue())
            userWin++;
        else if (userDice.getValue()< comDice.getValue())
            ComWin++;
        else 
            tie++;
    }
    if (userWin>ComWin)
        GrandWinner="user";
    else if (userWin<ComWin)
         GrandWinner="Computer";
    else
         GrandWinner="There is a tie";
        
    
    JOptionPane.showMessageDialog(null, "The user wineer is "+userWin+ "the Com winner is "+ComWin+"and the grand Winner is "+GrandWinner+" wiht ties"+tie);
    System.exit(0);
    }
 
    
   
}

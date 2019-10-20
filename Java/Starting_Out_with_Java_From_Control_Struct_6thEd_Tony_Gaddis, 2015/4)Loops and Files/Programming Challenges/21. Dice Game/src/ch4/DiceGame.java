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
public class DiceGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int number, userNum, userCount=0, ComNum, ComCount=0;
        
        
        Random userNumber = new Random();
        
        Random ComNumber = new Random();
        
        for (int i=1; i<=10; i++)
        {
        userNum = userNumber.nextInt(6)+1;
        System.out.println(userNum);
        ComNum = ComNumber.nextInt(6)+1;
        System.out.println(ComNum);
        
            if (userNum > ComNum)
            {
            JOptionPane.showMessageDialog(null, " The User is winner fot "+i+" game");
            userCount++;
            }
            else if (ComNum > userNum)
            {
            JOptionPane.showMessageDialog(null, " The Comuter is winner fot "+i+" game");
            ComCount++;
            }
            else
            {  
            JOptionPane.showMessageDialog(null, " There is no winner this time ");
            }
        }
        if (userCount++ > ComCount++)
        JOptionPane.showMessageDialog(null, " The Grand Winner is  User");
        else if (ComCount++ > userCount++)
        JOptionPane.showMessageDialog(null, " The Grand Winner is  User");
        else 
            JOptionPane.showMessageDialog(null, " There is tie");
        // TODO code application logic here
        System.exit(0);
    }
    
}

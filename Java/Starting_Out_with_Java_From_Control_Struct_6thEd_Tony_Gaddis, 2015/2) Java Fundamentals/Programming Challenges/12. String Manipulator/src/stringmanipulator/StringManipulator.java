/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringmanipulator;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author umerraja
 */
public class StringManipulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         
         int NumOfChar;
              String   cityName,
              NamUpCase,
              NamLoCase;
         char FirChar;
             
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("What is Your Favourite City Name : ");
        cityName = keyboard.nextLine();
        
        NumOfChar = cityName.length();
        NamUpCase = cityName.toLowerCase();
        NamLoCase = cityName.toUpperCase();
        FirChar   = cityName.charAt(0);

 
        
        JOptionPane.showMessageDialog(null, NumOfChar + "\n" + NamUpCase + "\n"+ NamLoCase+ "\n" + FirChar );
        
        System.exit(0);
      
        // TODO code application logic here
    }
    
}

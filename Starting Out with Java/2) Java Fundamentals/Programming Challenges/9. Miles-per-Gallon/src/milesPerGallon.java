/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author umerraja
 */
import java.util.Scanner;
import javax.swing.JOptionPane;

public class milesPerGallon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double milesDriven, gasUsed, MPG;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("How many miles you drove: ");
        milesDriven = keyboard.nextDouble();
        
        
        System.out.print("How much gas used: " );
        gasUsed = keyboard.nextDouble();
        
        MPG = gasUsed/milesDriven;
        
        JOptionPane.showMessageDialog(null, MPG );
      
        
        
        
        // TODO code application logic here
    }
    
}

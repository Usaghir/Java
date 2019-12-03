/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.pkg4.checktemperature;
import java.util.Scanner;
/**
 *
 * @author umerraja
 */
public class CheckTemperature {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        final double temp =102.5;
        double temper;
        
        
        Scanner keyboard =new Scanner(System.in);
        System.out.println("The temperature of the Vat");
        temper = keyboard.nextDouble();
        
        
        while (temper>temp)
        {
            System.out.println("Turn down the thermostate and wait 5 minutes. and measure again and enter here:");
            temper = keyboard.nextDouble();
          
        }
        System.out.println("Temperature is ok check after 15 minutes.");
        // TODO code application logic here
    }
    
}

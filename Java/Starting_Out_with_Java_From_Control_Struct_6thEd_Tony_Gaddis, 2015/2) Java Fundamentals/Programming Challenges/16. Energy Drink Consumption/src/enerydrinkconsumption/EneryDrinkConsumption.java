/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enerydrinkconsumption;
import javax.swing.JOptionPane;

/**
 *
 * @author umerraja
 */
public class EneryDrinkConsumption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int TotnumOfCus = 12467, NumOfCusPurDrink, NumofCusCitrus;
        
        double drinkper = 0.14, NoOFWeek= 1, SitrusPer = 0.64;
        
        
        NumOfCusPurDrink = (int)(TotnumOfCus*drinkper);
        
        NumofCusCitrus = (int)(TotnumOfCus*drinkper*SitrusPer);
        
        
        JOptionPane.showMessageDialog(null, "Number of ustomer purcahsed one or more drinks : " + NumOfCusPurDrink + "\n"
                                           + "Number of ustomer prefered citrus flavour : " + NumofCusCitrus);
        // TODO code application logic here
        // TODO code application logic here
    }
    
}

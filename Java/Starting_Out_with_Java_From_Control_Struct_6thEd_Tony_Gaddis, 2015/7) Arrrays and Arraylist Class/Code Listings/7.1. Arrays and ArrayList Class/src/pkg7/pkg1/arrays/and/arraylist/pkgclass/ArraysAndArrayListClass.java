/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7.pkg1.arrays.and.arraylist.pkgclass;
import javax.swing.JOptionPane;
/**
 *
 * @author umerraja
 */
public class ArraysAndArrayListClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        double[] rainFallArray = new double[12];
        String input;
        
        for (int index = 0; index < rainFallArray.length; index++) 
        {
        input=JOptionPane.showInputDialog("Please enter the rain fall for the month "+(index + 1));
        rainFallArray[index] =Double.parseDouble(input);
            while(rainFallArray[index]<0)
            {
            input=JOptionPane.showInputDialog("Please enter the valid rain fall for the month "+(index + 1));
            rainFallArray[index] =Double.parseDouble(input); 
            }
        }
        RainFall rainFall = new RainFall(rainFallArray);
        
        JOptionPane.showMessageDialog(null,"The total rain fall in year is"+rainFall.getTotRainFall());
         
        JOptionPane.showMessageDialog(null,"The average rain fall is"+rainFall.avgMonRainFall());
         
        JOptionPane.showMessageDialog(null,"The max rain fall is in Month"+rainFall.MonthMostRainFall());
         
        JOptionPane.showMessageDialog(null,"The min rain fall is in Month"+rainFall.monthLeastRainFall());
        
        System.exit(0);
         
         
         
         
         
         
    }
        
        
        // TODO code application logic here
    
    
}

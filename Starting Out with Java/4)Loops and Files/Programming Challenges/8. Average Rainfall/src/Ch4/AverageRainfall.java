/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch4;
import javax.swing.JOptionPane;

/**
 *
 * @author umerraja
 */
public class AverageRainfall {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numOfYears, totNumberofMonths; 
        double rainFallPerMonth,rainFallPerYear=0, totaRainfall=0, avgRainfall; 
        String input; 
        
        do
        {
        input = JOptionPane.showInputDialog("Enter total number of years: ");
        numOfYears = Integer.parseInt(input);
        }
        while (numOfYears<1);
        
         for (int i=1; i <= numOfYears; i++)
        {
           for (int j=1; j <= 4; j++)
           { 
                do
                {
                input = JOptionPane.showInputDialog("Enter number inch of rain fall for the Year "+i+" and month "+j+" but not less than 0");
                rainFallPerMonth = Integer.parseInt(input);
                }
                while (rainFallPerMonth < 0);
            rainFallPerYear += rainFallPerMonth; 
           }
          
           totaRainfall +=rainFallPerYear;
           rainFallPerYear=0;
        }
         totNumberofMonths = numOfYears*4;
         avgRainfall=totaRainfall/totNumberofMonths;
         
         JOptionPane.showMessageDialog(null, "Total number of months:  "+totNumberofMonths+ "Total Rain fall is  "+totaRainfall+"and average rain fall is "
                 +avgRainfall);
         
    }
}

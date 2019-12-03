
package ch5;

import javax.swing.JOptionPane;

/**
 *
 * @author umerraja
 */
public class PainJobEstimator 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
    
    int totalnumbofRooms, totNumOfGallon;
    final int oneGallonWallSpace = 115,  labourhours=8;
    final Double labourcostperhour = 18.00;
    Double painPricePerGallon, TotCostOfPaint,totalLabourHours,  sqfttPerRoom, totalSqft = 0.00, totalLabourCharges, totalCostOfJob;
    String input; 
       
        
        input = JOptionPane.showInputDialog("Please enter the number of Rooms: ");
        totalnumbofRooms = Integer.parseInt(input);
       
        input = JOptionPane.showInputDialog("Please enter the price of paint per gallons: ");
        painPricePerGallon = Double.parseDouble(input);
        
        for (int i=1; i <= totalnumbofRooms; i++)
        {
        input = JOptionPane.showInputDialog("Please enter the sqft for Room: "+i);
        sqfttPerRoom = Double.parseDouble(input);
        totalSqft+=sqfttPerRoom;
        }
        
        totNumOfGallon = NoOfGallonReq(totalSqft,oneGallonWallSpace);
        
        totalLabourHours= LabHoursReq(totNumOfGallon, labourhours);
        
        TotCostOfPaint=CostPaint(totNumOfGallon, painPricePerGallon);

        totalLabourCharges=LabourCharges(totalLabourHours, labourcostperhour);
        
        totalCostOfJob = totalCostPaint(totalLabourCharges,TotCostOfPaint);
        
        
        
        
        
        JOptionPane.showMessageDialog(null,
                    "Total Gallons of Pain Required: "+totNumOfGallon
                +"\nTotal Hours of Labour Required: "+totalLabourHours
                +"\nTotal Cost of Paint is: $"+TotCostOfPaint
                +"\n Total Labour Charges are: $"+ totalLabourCharges
                +"\n Total Cost of the job is: $"+ totalCostOfJob);
        System.exit(0);
       
    }    
        
        public static int NoOfGallonReq(double totalSqft, int oneGallonWallSpace )
        {
        return (int)(totalSqft/oneGallonWallSpace);         
        }
        
        
        public static double LabHoursReq(int totNumOfGallon,int labourhours)
        {
        return totNumOfGallon*labourhours;         
        }
        
        public static double CostPaint(int totNumOfGallon, double painPricePerGallon)
        {
        return totNumOfGallon*painPricePerGallon;         
        }
        
        public static double LabourCharges(double totalLabourHours, double labourcostperhour )           
        {
        return totalLabourHours*labourcostperhour;         
        }
        
        public static double totalCostPaint(double totalLabourCharges, double TotCostOfPaint)
        { 
        return totalLabourCharges+TotCostOfPaint;         
        }    
}

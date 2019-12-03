/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch5;
import java.util.Scanner;
/**
 *
 * @author umerraja
 */
public class DistanceTravelledModification {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
         int distance, speed, totNumOfHours;
  
        Scanner keyboard = new Scanner(System.in);
          
        System.out.print("Enter speed: "); 
        speed = keyboard.nextInt(); 
        
        while ( speed < 0)
        {
            System.out.print("Plese enter the valid speed: ");
            speed = keyboard.nextInt();
        }
         
        System.out.print("Enter numb of hours: "); 
        totNumOfHours = keyboard.nextInt();   
        
        while (totNumOfHours < 1)
        {
            System.out.print("Plese enter the valid time: ");
            totNumOfHours = keyboard.nextInt();
        } 
        
         
        
        System.out.println("Hours\t\tDistance Traveled ");
        System.out.println("------------------------------------");
        
            int hourNumber = 1; 
            while (hourNumber <= totNumOfHours)
            {
            distance = Distance(speed, hourNumber);
            System.out.println(hourNumber+"\t\t\t"+distance);
            hourNumber++;
            }
         
    }
 
     public static int Distance(int speed, int hourNumber)
     {
         
         return speed*hourNumber;
         
     }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2;
import java.util.Scanner;
/**
 *
 * @author umerraja
 */
public class DistanceTraveled 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        int distance, speed, time; 
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter speed: "); 
        speed = keyboard.nextInt(); 
        
        while ( speed < 0)
        {
            System.out.print("Plese enter the valid speed: ");
            speed = keyboard.nextInt();
        }
         
        System.out.print("Enter time: "); 
        time = keyboard.nextInt();   
        
        while (time < 1)
        {
            System.out.print("Plese enter the valid time: ");
            time = keyboard.nextInt();
        } 
        
        System.out.println("Hours\t\tDistance Traveled ");
        System.out.println("------------------------------------");
        
            int i = 1; 
            while (i <= time)
            {
            distance=speed*i;
        
            System.out.println(i+"\t\t\t"+distance);
            i++;
            }
    }
}
    


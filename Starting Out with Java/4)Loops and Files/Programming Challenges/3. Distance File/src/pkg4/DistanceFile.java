/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author umerraja
 */
public class DistanceFile {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        PrintWriter outputFile = new PrintWriter("StudentData.txt");
        
         int distance, speed, time; 
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter speed: "); 
        speed = keyboard.nextInt();
        
         while ( speed < 0){
            System.out.print("Plese enter the valid speed: ");
            speed = keyboard.nextInt();
        }
        
         
        System.out.print("Enter time: "); 
        time = keyboard.nextInt(); 
        
       
        while ( speed < 0 || time < 1){
            System.out.print("Plese enter the valid time: ");
            time = keyboard.nextInt();
        } 
            
        {
        outputFile.println("Hours\t\tDistance Traveled ");
        outputFile.println("------------------------------------");
        int i = 1; 
        while (i <= time){
        distance=speed*i;
        outputFile.println(i+"\t\t\t"+distance);
        i++;
        }
        outputFile.close();
        }
    }
    
}

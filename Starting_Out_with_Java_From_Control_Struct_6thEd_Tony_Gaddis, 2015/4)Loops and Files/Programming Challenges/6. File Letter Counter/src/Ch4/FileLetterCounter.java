/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch4;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author umerraja
 */
public class FileLetterCounter {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException
    {
         String entString1, entString2, entString3;
        
        char repeat;
        int count=0;
        
        Scanner keyboard = new Scanner(System.in); 
        
        System.out.println("Enter The name of the file : ");
        entString1 = keyboard.nextLine(); 
        
        PrintWriter outputFile = new PrintWriter(entString1);
        System.out.println("Enter enter data : ");
        entString3 = keyboard.nextLine(); 
        outputFile.println(entString3);
        outputFile.close();
        
        File myFile = new File(entString1);
        Scanner inputFile = new Scanner(myFile);
        inputFile.close();
        
        System.out.println("Enter Character: ");
        entString2 = keyboard.nextLine(); 
        repeat = entString2.charAt(0);
        
         int i=0;
         while (i < entString3.length())
         {
             
             if (entString3.charAt(i) == repeat)
             {
                 count+=1;
             }
             
          i++;       
         }
        System.out.println("Then number of time character "+repeat+ " is: "+count);
    }
    
}

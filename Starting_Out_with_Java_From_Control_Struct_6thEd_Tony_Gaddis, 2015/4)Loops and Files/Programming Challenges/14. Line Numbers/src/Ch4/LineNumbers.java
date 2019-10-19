/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch4;

import java.io.*;

import java.util.Scanner;

/**
 *
 * @author umerraja
 */
public class LineNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
    {
        
         String nameOfFile ,data, nameOfFileOpen; 
        
        char character ='y';
        
        Scanner keyboard = new Scanner(System.in);
        
         System.out.println("Enter The name of the file : ");
         nameOfFile = keyboard.nextLine();
         
         PrintWriter outputFile = new PrintWriter(nameOfFile);
         
        while (character == 'y')
         {
        System.out.println("Enter enter the Line: ");
        data = keyboard.nextLine();
        
        System.out.println("Do you want enter another line enter y for yes or press any other key ");
        character = keyboard.nextLine().charAt(0);
       
        outputFile.println(data);
         }
         
         outputFile.close();
        
         System.out.println("Please enter the name of the file : ");
         nameOfFileOpen = keyboard.nextLine();
         
         nameOfFileOpen =nameOfFile;
        
         
         File myFile = new File(nameOfFile); 
         Scanner anotherFile = new Scanner(myFile); 
        
        
        System.out.println("This is the text in the file ");
        int noOfLines=1;
        while ( anotherFile.hasNext())
        {
          System.out.printf("%d;\t%s\n",noOfLines,anotherFile.nextLine());  
          noOfLines++;
        }
        
        anotherFile.close();
        
        // TODO code application logic here
    }
    
}

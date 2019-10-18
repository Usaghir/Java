/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg15;
import java.io.*;

import java.util.Scanner;

/**
 *
 * @author umerraja
 */
public class UppercaseFileConverter {

    /**15. Uppercase File Converter
Write a program that asks the user for the names of two files. The first file should be opened
for reading and the second file should be opened for writing. The program should read
the contents of the first file, change all characters to uppercase, and store the results in the
second file. The second file will be a copy of the first file, except that all the characters will
be uppercase. Use Notepad or another text editor to create a simple file that can be used
to test the program.
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
    {
        
        String FirstFile, SecondFile,fileText,uppercase="";
        
        
         Scanner keyboard = new Scanner(System.in);
         
         System.out.println("Enter The name of the First file : ");
         FirstFile = keyboard.nextLine();
         
         
         File myFile = new File(FirstFile);
         Scanner inputFile = new Scanner(myFile); 
         fileText = inputFile.nextLine();
         
         while (inputFile.hasNext())
         {
         fileText = inputFile.nextLine();
         uppercase=fileText.toUpperCase();
         
         }
         inputFile.close();
         
         System.out.println("Enter The name of the 2nd file : ");
         SecondFile = keyboard.nextLine();
         
         PrintWriter outputFile = new PrintWriter(SecondFile);
         outputFile.println(uppercase);
        
         outputFile.close();
        // TODO code application logic here
    }
    
}

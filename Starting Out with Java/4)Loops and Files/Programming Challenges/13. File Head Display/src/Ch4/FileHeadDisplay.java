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
public class FileHeadDisplay 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException
    {
        
        // Create Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt user for file name
		System.out.println("Enter a file name: ");
		String fileName = input.nextLine();
		
		// Open file
		File file = new File(fileName + ".txt");
		
		// Ensure that file exist
		if(!file.exists()){
			System.out.println("The file " + fileName + ".txt does not exist.");
			System.exit(0);
		}
	
		// Instantiate scanner with file
		Scanner inputFile = new Scanner(file);
		
	

		// Line
		String line;
		
		// Initialize counter
		int counter = 0;
		
		// While loop
		while(inputFile.hasNext()){
			line = inputFile.nextLine();
			if(counter < 5)
				System.out.println(line);
			counter += 1;
		}
		// Close file
		inputFile.close();
        
        // TODO code application logic here
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.pkg13.testaverage2;

import java.util.Scanner;

/**
 *
 * @author umerraja
 */
public class TestAverage2 {
    
   
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int numbOfStud,numofTests,score,total;
         double average;
    
        Scanner Keyboard= new Scanner(System.in);
        
        System.out.println("Please provdie number of Students: ");
        numbOfStud = Keyboard.nextInt();
    
        System.out.println("Please provdie number of Tests ");
        numofTests = Keyboard.nextInt();
        
        for (int Stud=1; Stud<=numbOfStud;Stud++ )
        {
             total=0;
        System.out.println("Test for the studnet: "+Stud);
        
            for (int test=1; test<=numofTests;test++){
                
            System.out.println("Please enter the text scoore for no: "+test);
            score= Keyboard.nextInt();
            
            total+=score;
            
            } 
            average=total/numofTests;
            System.out.printf("Average for the student %dis%.1f.\n\n", Stud, average);
    }
    
}}

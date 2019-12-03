/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7;
import java.util.Scanner;

/**
 *
 * @author umerraja
 */
public class TestAverageAndGrade 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        int score, totalScore=0; 
        
        for (int i=1; i<=5; i++)
        {
            System.out.print("Please enter the score for test: "+i+"\n");
            score = keyboard.nextInt();
            totalScore += score;
            System.out.printf("And the Garde is %s\n",determineGrade(score));
        }
        
         System.out.printf("The Average Score is: %.2f",calcaverage(totalScore) );
         
    }    
    public static double calcaverage(int totalScore)
    {
        
        return totalScore/5;
    }
    
     public static char determineGrade(int score)
    {
        char grade;
        
        if (score >= 90 && score <= 100)
        grade = 'A';
        else if(score >= 80)
        grade = 'B';
        else if (score >= 70)
        grade = 'C';
        else if (score >= 60)
        grade = 'D';
        else
        grade = 'F'; 
        
        return grade;
    }
   
}

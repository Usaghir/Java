/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.test.scores.and.grade;
import java.util.Scanner;
/**
 *
 * @author umerraja
 */
public class TestScoresAndGrade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int score1, score2, score3;
        double average;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("what is your test score 1: ");
        score1 = keyboard.nextInt();
        
        System.out.println("what is your test score 2: ");
        score2 = keyboard.nextInt();
        
        System.out.println("what is your test score 3: ");
        score3 = keyboard.nextInt();
        
        
        average = (score1+score2+score3)/3;
        
        if (average >= 90 && average <= 100)
           System.out.println("Your Grade is A ");
        
        else if (average >= 80 && average <= 89)
           System.out.println("Your Grade is B ");
        
        else if (average >= 70 && average <= 79)
           System.out.println("Your Grade is C ");
        
        else if (average >= 60 && average <= 69)
           System.out.println("Your Grade is D ");
        
        else if (average < 60 && average >= 0)
           System.out.println("Your Grade is F ");
        
        else
           System.out.println("invalid grade ");
            
        
        // TODO code application logic here
    }
    
}

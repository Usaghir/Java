/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.pkg6.testaverage1;

import java.util.Scanner;

/**
 *
 * @author umerraja
 */
public class TestAverage1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int score1,
            score2,
            score3;
        double average;
        char repeat;
        String input;
        do 
        {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Write Score of first test:");
        score1 = keyboard.nextInt();
        
        System.out.println("Write Score of 2nd test:");
        score2 = keyboard.nextInt();
        
        System.out.println("Write Score of 3rd test:");
        score3= keyboard.nextInt();
        // TODO code application logic here
        keyboard.nextLine();
        
        
        
        average=(score1+score2+score3)/3;
        System.out.println("Average Score: "+average);
        
        System.out.println("Do you want to to enter again for another average for test scores?");
        System.out.println("Please enter the y for yes and n for no");
        input = keyboard.nextLine();
        repeat= input.charAt(0);
        
        } while (repeat=='y'|| repeat=='Y');
        
    

}
}
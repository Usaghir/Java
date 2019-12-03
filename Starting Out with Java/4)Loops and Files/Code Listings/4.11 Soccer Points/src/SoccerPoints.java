/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author umerraja
 */
public class SoccerPoints {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int points;
        int totalPoints=0;
        
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Enter how many pints team earn and enter -1 for finishing");
        
        
        System.out.println("Enter the points your team earn or -1 to end ");
        points=Keyboard.nextInt();
        
        while(points!=-1)
        {
            totalPoints+=points;
            System.out.println("Enter the points your team earn or -1 to end ");
            points=Keyboard.nextInt();
        }
        
        System.out.println("toal pints are  "+totalPoints);
        // TODO code application logic here
    }
    
}

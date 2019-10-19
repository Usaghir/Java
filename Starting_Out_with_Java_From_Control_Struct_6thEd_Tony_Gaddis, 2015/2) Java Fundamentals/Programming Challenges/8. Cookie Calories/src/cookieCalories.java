/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author umerraja
 */
import java.util.Scanner;
public class cookieCalories {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int cookiesInBag = 40,
           noOfServings = 10,
           caloriesEachServing = 300,
           sizeOfServingInCookies = 4,
           caloriesInEachCookie = caloriesEachServing/sizeOfServingInCookies,
           NumberOfCookiesAte; 
       Scanner keyboard = new Scanner(System.in);
       
       System.out.print("How many cookies you Ate :");
       NumberOfCookiesAte = keyboard.nextInt();
       
       int numberOfCaloriesConsumed = NumberOfCookiesAte*caloriesInEachCookie;
       
       System.out.print("How many calories you consumed :" + numberOfCaloriesConsumed);
       
        // TODO code application logic here
    }
    
}

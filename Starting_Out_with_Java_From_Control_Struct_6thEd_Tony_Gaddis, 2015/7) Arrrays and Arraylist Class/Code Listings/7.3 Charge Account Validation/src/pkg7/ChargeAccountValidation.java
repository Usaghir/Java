/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7;
import java.util.Scanner;
/**
 *
 * @author umerraja
 */
public class ChargeAccountValidation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int numberEnter;
        
        Scanner keyboard = new Scanner(System.in);
        ChargeAccount acc = new ChargeAccount();
        
        System.out.print("Plase enter the number\t");
        numberEnter=keyboard.nextInt();
        
        if(acc.accountFind(numberEnter))
        System.out.println("Number is Valid");
        else
        System.out.println("Number is not Valid");
            
                
        // TODO code application logic here
    }
    
}

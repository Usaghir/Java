/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.mass.and.weight;
import java.util.Scanner;

/**
 *
 * @author umerraja
 */
public class MassAndWeight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        double mass, weight;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Plese enter the mass : ");
        mass = keyboard.nextDouble();
        
        weight = mass*9.8;
        
        if (weight > 1000)
            System.out.println("Too heavey: ");
        
        else if (weight < 10)
            System.out.println("Too light: ");
        else 
            System.out.println("weight is not too heavy and too light ");
       
            
        
        
        // TODO code application logic here
    }
    
}

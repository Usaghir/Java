/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.pkg12.kinetic.energy;
import java.util.Scanner;
/**
 *
 * @author umerraja
 */
public class KineticEnergy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
    double mass, velocity, KE;
        
    Scanner keyboard = new Scanner(System.in);
        
    System.out.println("Please enter the mass of the object: ");
    mass = keyboard.nextDouble();
        
    System.out.println("Please enter the velocity of the object: ");
    velocity = keyboard.nextDouble();
     
    KE = kineticEnergy(mass, velocity);
    System.out.printf("The KE for this object is %010.2f",KE);
    }
    
    public static double kineticEnergy(double mass, double velocity)
    {
    
    return (mass*velocity*velocity)/2;
    }
}
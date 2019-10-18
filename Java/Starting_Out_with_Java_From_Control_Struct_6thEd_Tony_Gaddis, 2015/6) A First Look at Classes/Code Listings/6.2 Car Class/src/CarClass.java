/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author umerraja
 */
public class CarClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
         Car AnewCar = new Car(2018, "Volvo");
         
         for (int i=1; i<=5; i++)
         {
             AnewCar.accelrate();
             System.out.printf("The current speed is\t\t %d\n",AnewCar.speed());
         }
         for (int i=1; i<=5; i++)
         {
             AnewCar.brake();
             System.out.printf("The current speed is\t\t %d\n",AnewCar.speed());
         }
    }
    
}

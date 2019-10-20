/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author umerraja
 */
public class Car {
    
    private int carModel;
    private String make;
    private int speed; 
    
    public Car(int CarmodelC, String makeC)
    {
        carModel=CarmodelC;
        make= makeC;
        speed=0;
        
    }
    public int getcarModel()
    {
        return carModel;
    }
    
     public String getMake()
    {
        return make;
    }
     
    public int speed()
    {
        return speed;
    }
    
    public void accelrate()
    {
        speed+=5;
    }
    public void brake()
    {
        speed-=5;
    }
}

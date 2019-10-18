/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg14;
import java.util.Random;
/**
 *
 * @author umerraja
 */
public final class Dice {
    
    
   
    private int Value;
    private int side;

    public Dice(int sides1)
    {
        side=sides1;
        rollDice();
    }
    
    public void rollDice()
    {
    Random rand = new Random();
    Value = rand.nextInt(side) + 1;
    }
    
    public int getSide()
    {
        return side;
    }
    
    public int getValue()
    { 
        return Value;
    }
    
    
   
    
}

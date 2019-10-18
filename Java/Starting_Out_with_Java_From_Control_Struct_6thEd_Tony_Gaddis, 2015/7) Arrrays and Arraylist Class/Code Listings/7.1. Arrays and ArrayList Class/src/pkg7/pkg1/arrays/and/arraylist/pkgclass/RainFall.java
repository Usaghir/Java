/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7.pkg1.arrays.and.arraylist.pkgclass;

/**
 *
 * @author umerraja
 */
public class RainFall {
    
    private double [] all12MonthlRainfall;
    
    public RainFall(double[] PMRainFall)
    {
    all12MonthlRainfall=PMRainFall;
    }
    
    public double getTotRainFall()
    {
    double total = 0.0;      // Initialize accumulator
    for (int index = 0; index < all12MonthlRainfall.length; index++)
    total += all12MonthlRainfall[index];
    return total;
    }
    
    public double avgMonRainFall()
    {
    return getTotRainFall()/all12MonthlRainfall.length;
    }
    
    public int MonthMostRainFall()
    {
    double highest = all12MonthlRainfall[0];
    int highestMonth=0;
    for (int index = 1; index < all12MonthlRainfall.length; index++)
    if (all12MonthlRainfall[index] > highest)
    highestMonth=index;
    return highestMonth+1;
    }
    
    public int monthLeastRainFall()
    {
    double loweset = all12MonthlRainfall[0];
    int lowestMonth=0;
    for (int index = 1; index < all12MonthlRainfall.length; index++)
    if (all12MonthlRainfall[index] < loweset)
    lowestMonth=index;
    return lowestMonth+1;
    }
}
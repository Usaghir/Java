/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.pkg12.clock;

/**
 *
 * @author umerraja
 */
public class Clock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Simulate the clock.
    for (int hours = 1; hours <= 12; hours++)
    {
        for (int minutes = 0; minutes <= 59; minutes++)
        {      
            for (int seconds = 0; seconds <= 59; seconds++)
            {
 System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
            }
        }
    }
 }
 }
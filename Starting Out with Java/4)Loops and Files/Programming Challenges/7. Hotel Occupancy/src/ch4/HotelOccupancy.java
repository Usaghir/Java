/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4;
import javax.swing.JOptionPane;
/**
 *
 * @author umerraja
 */
public class HotelOccupancy 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int numrOfFloor, numOfRoomFloor, numOfAccRoomFloor, numOfVac, totRooms=0, totAcu=0, totVac=0;
        double totAcuRate, acuRate;
        String input;
        
        do
        {
        input = JOptionPane.showInputDialog("Enter number of floors not less than 1");
        numrOfFloor= Integer.parseInt(input);
        }
        while (numrOfFloor<1);
        
        for (int i=1; i <= numrOfFloor; i++)
        {
            do
            {
            input = JOptionPane.showInputDialog("Enter number of rooms in floor "+i+" not less than 10");
            numOfRoomFloor = Integer.parseInt(input);
            }
            while (numOfRoomFloor<10);
            
            
        totRooms+=numOfRoomFloor;
        input = JOptionPane.showInputDialog("Please enter number of accupied rooms in floor "+i);
        numOfAccRoomFloor = Integer.parseInt(input);
        acuRate = numOfAccRoomFloor/(double)numOfRoomFloor;
        
        JOptionPane.showMessageDialog(null, "Accupacy rate of the floor "+i+ "is "+acuRate);
        totAcu+=numOfAccRoomFloor;
        }
        totAcuRate = totAcu/(double)totRooms;   
        JOptionPane.showMessageDialog(null, "Accupacy rate of the hotel is "+totAcuRate);
        
        System.exit(0);
    }  
}

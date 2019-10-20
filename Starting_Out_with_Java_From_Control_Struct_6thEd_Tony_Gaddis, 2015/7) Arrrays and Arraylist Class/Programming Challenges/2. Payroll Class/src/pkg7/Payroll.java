/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7;

import javax.swing.JOptionPane;

/**
 *
 * @author umerraja
 */
public class Payroll 
{
    private final int[] employeeID={5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
    private int[] hours;
    private double[] payRate;
    private double[] wages;
    private final int noOfEmp;
    
    // int[] ID,int[] hrs ,double[] payperhour, double[] grossWage
    public Payroll ()
    {
        hours = new int[employeeID.length];
        payRate = new double[employeeID.length];
        wages = new double[employeeID.length];
        noOfEmp=employeeID.length;
    } 
    
    public void dispayID()
    {
        for (int index=0; index<employeeID.length; index++)
        {
            System.out.printf("Employe\t %d\tID \t%d\n",(index+1), employeeID[index] );
        }
    }
    
    public void setHrs(int hourofemployee, int index)
            
    {
        hours[index]=hourofemployee;
        
        } 
    
    public void setPayRate(double payRatemployee, int index)
            
    {
        payRate[index]=payRatemployee;
        } 
    
    public int getNOEmp()
    {
        return noOfEmp;
    }

    public int getID(int index)
    {
        return employeeID[index];
    }
    
    public int getHrs(int index)
    {
        return hours[index];
    }
    
    public double getPayRate(int index)
    {
        return payRate[index];
    }
    
    public double getWages(int ID)
    {
        return hours[ID]*payRate[ID];
    }
    
    public void displaywagesByEmp(int IDnum)
    {
    }
    
}

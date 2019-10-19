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
public class PayrollClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
            
    {
    int hoursOfEmp;
    double wageOfEmp;
    Payroll employee = new Payroll();
        
    employee.dispayID();
        
    Scanner keyboard = new Scanner(System.in);
        
    for (int i=0; i<employee.getNOEmp(); i++)
    {

    System.out.print("Plase enter the employee "+(i+1)+" hours\t");
    hoursOfEmp=keyboard.nextInt();
        
        while (hoursOfEmp<0)
        {
        System.out.print("Plase enter the valid employee "+(i+1)+" hours\t");
        hoursOfEmp=keyboard.nextInt();
        } 
            
    employee.setHrs(hoursOfEmp,i);
    System.out.print("Plase enter the employee "+(i+1)+" pay rate\t$");
    wageOfEmp=keyboard.nextDouble();
        
        while (wageOfEmp<6.00)
        {
        System.out.print("Plase enter the valid employee "+(i+1)+" pay rate\t$");
        wageOfEmp=keyboard.nextInt();
        }
    employee.setPayRate(wageOfEmp,i);
        
    
        }
    for (int i=0; i<employee.getNOEmp(); i++)
    {
    System.out.println("Gross wage for employee "+(i+1)+"with ID"+employee.getID(i)+"is\t$"+employee.getWages(i));
    }
        
        
       
    }
    
}

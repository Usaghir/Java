/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4;
import java.util.Scanner;
/**
 *
 * @author umerraja
 */
public class CelsiusToFaranheitTable 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        double temCel=0, temFahr;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Tem in Celsious\t\tTem in Farhenheit");
        System.out.println("--------------------------------------------");
        
        
        for (int i=0; i <= 20; i++)
        {
            temFahr = ((9.0/5.0)*(temCel))+32.0;
            System.out.printf("%.1f\t\t\t%.1f\n",temCel,temFahr);
            temCel++;
        }
        
        // TODO code application logic here
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7.pkg7.quarterly.sales.statistics;
import java.util.Scanner;

/**
 *
 * @author umerraja
 */
public class QuarterlySalesStatistics 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        final int div = 6;
        final int quart = 4;
        double[] salesbyDivision=new double[div];
        double [] a=new double[div];
        
        double[][] sales = new double[div][quart];;
        
        
        Scanner keyboard = new Scanner(System.in);
         
        for (int i = 0; i < div; i++) 
        {
            for (int j = 0; j < quart; j++) 
            {
            System.out.print("Plase enter the sales for Devision\t"+(i+1)+"and Quarter\t"+(j+1)+"\t");
            sales[i][j]= keyboard.nextDouble();  
            while(sales[i][j]<0)
            {
            System.out.print("Plase enter the valid sales for Devision\t"+(i+1)+"and Quarter\t"+(j+1)+"\t");
            sales[i][j]=keyboard.nextDouble();
            
            }
            salesbyDivision[i]=sales[i][j];
            a=salesbyDivision[i];
        
            
                
            }
            System.out.println(salesbyDivision[i]);
        }
        
        
        
        // TODO code application logic here
    }
    
}

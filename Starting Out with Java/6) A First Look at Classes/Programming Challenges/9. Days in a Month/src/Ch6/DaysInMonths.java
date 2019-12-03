/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch6;

/**
 *
 * @author umerraja
 */
public class DaysInMonths {
    
    private int numOfDays;
    
    
    
    public DaysInMonths()
    {
        numOfDays=0;
        
    }
    
    public void setNumberofDays(int theMonth, int theYears)
    {   
     switch (theMonth)
     {
         case 1:
             numOfDays=31;
             break;
         case 2:
         {
             if ((theYears%400==0)||(theYears%100!=0&&theYears%4==0))
                numOfDays=29;
             else
                numOfDays=28;   
         }
         break;
         case 3:
             numOfDays=31;
             break;
         case 4:
             numOfDays=30;
             break;
        case 5:
             numOfDays=31;
             break;
         case 6:
             numOfDays=30;
             break;
        case 7:
             numOfDays=31;
             break;
         case 8:
             numOfDays=31;
             break;
         case 9:
             numOfDays=30;
             break;
         case 10:
             numOfDays=31;
             break;
        case 11:
             numOfDays=30;
             break;
         case 12:
             numOfDays=31;
             
             
     }
    }
    
    public int getNumberofDays()
    {
      return numOfDays;
    }
}

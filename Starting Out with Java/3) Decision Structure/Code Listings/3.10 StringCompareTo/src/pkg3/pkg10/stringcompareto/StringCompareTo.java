/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.pkg10.stringcompareto;

/**
 *
 * @author umerraja
 */
public class StringCompareTo {

    public static void main (String [] args){
        
        String name1 = "Mary",
               name2 = "Mark";
               
        
        if (name1.compareTo(name2) < 0)
        {
            System.out.print(name1+" is less than "+name2);
        }
        else if (name1.compareTo(name2) == 0)
        {
            System.out.print(name1+" is equal to "+name2);
        }
        else if (name1.compareTo(name2) > 0)
        {
            System.out.print(name1+" is grater than "+name2);
        }
        
    }
}

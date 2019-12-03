/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.pkg9.stringcompare;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author umerraja
 */
public class StringCompare {
    
    public static void main (String [] args){
        
        String name1 = "Mark",
               name2 = "Mark",
               name3 = "Mary";
        
        if (name1.equals(name2))
        {
            System.out.print(name1+" and "+name2+" are same");
        }
        else
        {
            System.out.print(name1+" and "+name2+" are  not same");
        }
        if (name2.equals(name3))
        {
        System.out.print(name2+" and "+name3+" are same");
        }
        else
        {
            System.out.print(name1+" and "+name3+" are  not same");
        }
    }
}

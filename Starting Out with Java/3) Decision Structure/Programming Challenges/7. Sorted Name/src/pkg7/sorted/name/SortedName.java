/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7.sorted.name;
import java.util.Scanner; 

/**
 *
 * @author umerraja
 */
public class SortedName {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String name1, name2, name3; 
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("enter a name: ");
        name1 = keyboard.nextLine();
        
        System.out.print("enter another  name: ");
        name2 = keyboard.nextLine();
        
        
        System.out.print("enter another name: ");
        name3 = keyboard.nextLine();
        
        if (name1.compareToIgnoreCase(name2) > 0)
        {
            if (name1.compareToIgnoreCase(name3) > 0)
            {
                if (name2.compareToIgnoreCase(name3) > 0)
                
                    System.out.println(name3+"\n"+name2+"\n"+name1);
                else 
                    System.out.println(name2+"\n"+name3+"\n"+name1);
                
            }        
            else 
                System.out.println(name2+"\n"+name1+"\n"+name3);
        }
        else
        {
            if (name3.compareToIgnoreCase(name2) > 0)
            
            System.out.println(name1+"\n"+name2+"\n"+name3);
            else if (name1.compareToIgnoreCase(name3) > 0)
                    
            System.out.println(name3+"\n"+name1+"\n"+name2);
            else  
            System.out.println(name1+"\n"+name3+"\n"+name2);
       
            
        
        // TODO code application logic here
    }
    
    }
}
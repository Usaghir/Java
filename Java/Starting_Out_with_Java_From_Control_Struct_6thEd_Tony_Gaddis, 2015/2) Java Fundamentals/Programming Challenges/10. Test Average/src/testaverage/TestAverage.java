/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testaverage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author umerraja
 */
import java.util.Scanner;
import javax.swing.JOptionPane;

public class TestAverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double Test1, Test2, Test3, AVG, total = 3;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Test Score 1:");
        Test1 = keyboard.nextDouble();
        
        System.out.print("Test Score 2:");
        Test2 = keyboard.nextDouble();
        
        System.out.print("Test Score 1:");
        Test3 = keyboard.nextDouble();
        
        
        AVG = (Test1+Test2+Test3)/total;
        
        JOptionPane.showMessageDialog(null, Test1 +" "+ Test2 + " " + Test3 + " " + AVG );
        
        System.exit(0);
      
        
         
        
        // TODO code application logic here
    }
    
}


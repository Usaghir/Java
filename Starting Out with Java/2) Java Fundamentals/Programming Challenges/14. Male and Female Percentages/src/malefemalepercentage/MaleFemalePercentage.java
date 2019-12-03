/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package malefemalepercentage;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author umerraja
 */
public class MaleFemalePercentage {

    public static void main(String[] args) {
        
        int males,females, total; 
        double malesPer, femalePer;
               
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Numebr of male students :");
        males = keyboard.nextInt();
     
        System.out.print("Number of female students:");
        females = keyboard.nextInt();
        
        total = males + females;
        malesPer = ((double)males/total)*100;
        femalePer = ((double)females/total)*100;
        JOptionPane.showMessageDialog(null, "males percentage is :" + malesPer + "%\n" + "female percentage is:" + femalePer + "%");
        // TODO code application logic here
    }
    
}

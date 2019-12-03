/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg17.ingridiant.adjuster;
import javax.swing.JOptionPane;
/**
 *
 * @author umerraja
 */
public class IngridiantAdjuster {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Cookies;
        double suger = 1.5, butter = 1, flour = 2.75, allIng, sugPerCook, butPerCook, flourPerCook, reqSuger, reqButter, reqFlour;
        int cookiesProduced = 48, cookiesRequired;
           
            sugPerCook = (suger/cookiesProduced);
            butPerCook = (butter/cookiesProduced);
            flourPerCook = (flour/cookiesProduced);
            
        
        Cookies=JOptionPane.showInputDialog("How many cookies you want to make: ");
        cookiesRequired = Integer.parseInt(Cookies);
        
        reqSuger = sugPerCook*cookiesRequired;
        reqButter = butPerCook*cookiesRequired;
        reqFlour = flourPerCook*cookiesRequired;
        
        
        
        
        JOptionPane.showMessageDialog (null, "Suger Required :"+ reqSuger+ "\nButter Required : " + reqButter + "\nFlour Required : " + reqFlour );
        
        
        
        // TODO code application logic here
        System.exit(0);
    }
    
}

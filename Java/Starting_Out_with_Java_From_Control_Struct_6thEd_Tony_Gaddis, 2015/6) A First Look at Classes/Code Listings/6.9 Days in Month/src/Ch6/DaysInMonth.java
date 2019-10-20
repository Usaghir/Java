/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch6;

import javax.swing.JOptionPane;

/**
 *
 * @author umerraja
 */
public class DaysInMonth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int UserEnterYear;
        int UserEnterMonth;
        int days;
        String input;
        
        DaysInMonths dayss= new DaysInMonths();
        
        input=JOptionPane.showInputDialog("Plese enter the month: ");
        UserEnterMonth=Integer.parseInt(input);
        
        input=JOptionPane.showInputDialog("Plese enter the year: ");
        UserEnterYear=Integer.parseInt(input);
        
        dayss.setNumberofDays(UserEnterMonth, UserEnterYear);
        
        JOptionPane.showMessageDialog(null, dayss.getNumberofDays()+" days");
        
        System.exit(0);
        
        
    }
    
}

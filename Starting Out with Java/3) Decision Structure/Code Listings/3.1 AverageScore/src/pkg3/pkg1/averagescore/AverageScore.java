/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.pkg1.averagescore;
import javax.swing.JOptionPane;

/**
 *
 * @author umerraja
 */
public class AverageScore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double score1;
        double score2;
        double score3;
        double average;
        
        String input;
        
        input = JOptionPane.showInputDialog("Enter score # 1");
        score1 = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog("Enter score # 2");
        score2 = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog("Enter score # 3");
        score3 = Double.parseDouble(input);
        
        average = (score1+score2+score3)/3.0;
        
        JOptionPane.showMessageDialog(null, "Average is" + average );
        average = Double.parseDouble(input);
        
        if (average > 95)
            
            JOptionPane.showMessageDialog(null, "Average is great" );
            
        System.exit(0);
        }
           
    }
    

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5;

import javax.swing.JOptionPane;

/**
 *
 * @author umerraja
 */
public class RectangleArea {

    
    public static void main(String[] args) 
    {
    
        double len, wid, area;
          len = getLength();
          wid = getWidth();
          area = getArea(len,wid);
          displayArea(len, wid, area);
          System.exit(0);
          
      
    }   
    public static double getLength()
            
   {
       double length;
       String input; 
       input = JOptionPane.showInputDialog("Enter the length ");
       length = Double.parseDouble(input);
       return length;
   }
        // TODO code application logic here
    
    
        public static double getWidth()
        {
        double width;
        String input; 
        input = JOptionPane.showInputDialog("Enter the width ");
        width = Double.parseDouble(input);
        return width;
        }

    
        public static double getArea(double length, double width)
        {
        return length * width;
        }
        
        public static void displayArea(double le, double wi, double are)
        {
        JOptionPane.showMessageDialog(null, "The Length is: "+le+"\nThe width is: "+wi+"\nThe area is "+are );
        }
        
        
        
}


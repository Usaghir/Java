/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg18.wordgame;

import javax.swing.JOptionPane;

/**
 *
 * @author umerraja
 */
public class WordGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name, age, city, college, profession, animal, pet;
        
     
        
        name=JOptionPane.showInputDialog("What is your name: ");
        age=JOptionPane.showInputDialog("What is your age: ");
        city=JOptionPane.showInputDialog("What is name of your city: ");
        college=JOptionPane.showInputDialog("What is your college: ");
        profession=JOptionPane.showInputDialog("What is your profession: ");
        animal=JOptionPane.showInputDialog("Which animal you like: ");
        pet=JOptionPane.showInputDialog("What is your pet's name: ");
        

JOptionPane.showMessageDialog (null, "There once was a person named "+name+" who lived in "+city+". At the age of "+age+",\n" +
name+ " went to college at "+college+". "+name+" graduated and went to work as an\n" +
profession+". Then,"+name+" adopted a(n) "+animal+" named "+pet+". They both lived\n" +
"happily ever after!");
        
        
        
        // TODO code application logic here"
        System.exit(0);
        // TODO code application logic here
    }
    
}

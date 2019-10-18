/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.pkg5.soccerteams;

import javax.swing.JOptionPane;

/**
 *
 * @author umerraja
 */
public class SoccerTeams {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int noOfTeams,
            maxPlayers = 15,
            minPlayers = 9,
            players,
            teamSize,
            extraPlayers;
        String input;
        
        
        input=JOptionPane.showInputDialog("Enter the team size:\n");
        teamSize = Integer.parseInt(input);
        
        
        
        while (teamSize < minPlayers || teamSize > maxPlayers)
        {
            input=JOptionPane.showInputDialog("The number shoul be less 16 and over than 8 so \n enter new again:");
            teamSize = Integer.parseInt(input);
          
        }
        
        input=JOptionPane.showInputDialog("Enter the number of Players:\n");
        players = Integer.parseInt(input);
        
        
        while (players < 0)
        {
            input=JOptionPane.showInputDialog("The number shoul be at least one player so please write again:\n");
            players = Integer.parseInt(input);
          
        }
        noOfTeams=players/teamSize;
        
        extraPlayers=players%teamSize;
        
        
        JOptionPane.showMessageDialog(null,"There will " +noOfTeams+ "teams and there will be"+extraPlayers+" exta players");
        // TODO code application logic here
        System.exit(0);
    }
        // TODO code application logic here
    }
    


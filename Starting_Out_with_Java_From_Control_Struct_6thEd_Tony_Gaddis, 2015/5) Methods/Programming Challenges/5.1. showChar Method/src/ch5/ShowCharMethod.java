/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5;

/**
 *
 * @author umerraja
 */
public class ShowCharMethod 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
         
        
        
        showCharOf("Raja Umer Saghir ", 7);
    }
         
        public static void showCharOf(String str, int num)
        
        {
            char output;
            output = str.charAt(num);
            System.out.println(output);
        }
        
        
    }
    

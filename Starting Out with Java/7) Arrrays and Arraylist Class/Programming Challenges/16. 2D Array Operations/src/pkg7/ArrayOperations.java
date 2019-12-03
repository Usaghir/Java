

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7;
import java.util.Random;
/**
 *
 * @author umerraja
 */
public class ArrayOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int ROW=3,COL=4, num;
        String [][] arrayProg= new String [ROW][COL];
        String input="";
        
        
        for (int i = 0; i < ROW; i++) 
        {
            for (int j = 0; j < COL; j++) 
            {
                Random rand = new Random ();
                num=rand.nextInt(10)+1;
                
                switch (num)
                {
                    case 1:
                    input="ali";
                    break;
                    case 2:
                    input="Zaheer";
                    break;
                    case 3:
                    input="Yasir";
                    break;
                    case 4:
                    input="Sajid";
                    break;
                    case 5:
                    input="Sajjad";
                    break;
                    case 6:
                    input="Husnain";
                    break;
                    case 7:
                    input="Usman";
                    break;
                    case 8:
                    input="Saghir";
                    break;
                    case 9:
                    input="Bashir";
                    break;
                    case 10:
                    input="other";
                    break;
                }
                arrayProg[i][j]=input;
            }
            
        }
        
        
        ArrayOperation anArray = new ArrayOperation(arrayProg);
        String [][] therray= anArray.getArray();
        
        for (int i = 0; i < ROW; i++) 
        {
            for (int j = 0; j < COL; j++) 
            {
                System.out.println(therray[i][j]);
            }
   
        }
        
        
        // TODO code application logic here
    }
    
}

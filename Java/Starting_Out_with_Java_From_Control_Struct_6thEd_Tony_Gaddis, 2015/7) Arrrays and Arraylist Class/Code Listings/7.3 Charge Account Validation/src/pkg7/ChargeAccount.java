package pkg7;
import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author umerraja
 */
public class ChargeAccount {
    public final int[] chargeList={5658845, 4520125, 8080152, 4562555, 1005231, 6545231+
7895122, 8777541, 5552012, 5050552, 3852085, 7576651, 8451277, 7825877, 7881200,1302850, 1250255, 4581002};
    
    public boolean accountFind(int value)
    {
        int index=0;
        boolean found;
        found = false;
        while (!found && index < chargeList.length) 
        {
            if (chargeList[index] == value) 
            {
            found = true;
            }
            index++; 
        }
        return found; 
    }
    
}

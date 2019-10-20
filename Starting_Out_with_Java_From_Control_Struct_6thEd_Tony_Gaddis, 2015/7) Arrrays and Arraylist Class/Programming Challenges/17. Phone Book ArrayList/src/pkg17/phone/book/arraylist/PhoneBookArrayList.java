/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg17.phone.book.arraylist;
import java.util.ArrayList;

/**
 *
 * @author umerraja
 */
public class PhoneBookArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        ArrayList<String> nameList = new ArrayList<String>();
        
        final int noOfEnt;
        noOfEnt=5;
        PhoneBookEntery[] entry = new PhoneBookEntery[noOfEnt];
        entry[0]=new PhoneBookEntery("ali", "0301");
        entry[1]=new PhoneBookEntery("Sajjad", "0345");
        entry[2]=new PhoneBookEntery("Sajid", "0314");
        entry[3]=new PhoneBookEntery("Husian", "0300");
        entry[4]=new PhoneBookEntery("Zaheer", "0039");
        
        nameList.add(entry[0].getName());
        nameList.add(entry[0].getNo());
        nameList.add(entry[1].getName());
        nameList.add(entry[1].getNo());
        nameList.add(entry[2].getName());
        nameList.add(entry[2].getNo());
        nameList.add(entry[3].getName());
        nameList.add(entry[3].getNo());
        nameList.add(entry[4].getName());
        nameList.add(entry[4].getNo());
        
        System.out.println(nameList);
       
    }
        
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg17.phone.book.arraylist;

/**
 *
 * @author umerraja
 */
public class PhoneBookEntery {
    
    private String name;
    private String phoneNo;
    
    public PhoneBookEntery(String namn, String Phone)
    {
        name=namn;
        phoneNo=Phone;
    }
    
    public void setName(String namnTobeSet)
    {
        name=namnTobeSet;
    }
    
    public void setNo(String noTobeSet)
    {
        phoneNo=noTobeSet;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String  getNo()
    {
        return phoneNo;
    }
    
   
    
}

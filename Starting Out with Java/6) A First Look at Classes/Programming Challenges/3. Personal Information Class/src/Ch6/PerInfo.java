/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch6;

/**
 *
 * @author umerraja
 */
public class PerInfo {
    private String name;
    private String address;
    private int age;
    private int phone;
    
    public PerInfo(String theName, String theAddress, int theAge, int thephone)
    {
        name=theName;
        address=theAddress;
        age=theAge;
        phone=thephone;    
    }
    
    
    public void setName(String AName)
    {
        name=AName;
    }
    
     public void setAddress(String AnAddress)
    {
        address=AnAddress;    
    }
     
    public void setPhone( int empID)
    {
        phone=empID; 
    }
 
    public void setAge(int AnAge)
    {
        age=AnAge; 
    }
    
     public String getName()
    {
        return name;
    }
    
     public String getAddress()
    {
        return address;    
    }
     
    public int getPhone()
    {
        return phone; 
    }
    
    public int getAge()
    {
        return age; 
    }
    
    
    
}

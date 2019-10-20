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
public class Employee {
    
    
    private String name;
    private String department;
    private String position;
    private int IdNumber;
    
    public Employee(String enmlpyeeName, int employeeID, String departmentC, String PositionC)
    {
        name=enmlpyeeName;
        IdNumber=employeeID;
        department=departmentC;
        position=PositionC;    
    }
    
    public Employee(String enmlpyeeNamn, int IDofemployee)
    {
        name=enmlpyeeNamn;
        IdNumber=IDofemployee;
        department="";
        position="";    
    }
    
    public Employee()
    {
        name="";
        IdNumber=0;
        department="";
        position="";    
    }
    
    public void setName(String empName)
    {
        name=empName;
    }
    
    public void setID( int empID)
    {
        IdNumber=empID; 
    }
    
    public void setdepart(String depart)
    {
        department=depart;    
    }
    
    public void setPost(String post)
    {
        position=post; 
    }
    
     public String getName()
    {
        return name;
    }
    
    public int getID()
    {
        return IdNumber; 
    }
    
    public String getdepart()
    {
        return department;    
    }
    
    public String getPost()
    {
        return position; 
    }
    
    
    
}

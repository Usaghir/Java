
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch6;

import javax.swing.JOptionPane;


/**
 *
 * @author umerraja
 */
public class EmployeeClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        String Employeename1 = "Susan Meyers";
        String Employeename2 = "Mark Jones";
        String Employeename3 = "Joy Rogers";
        
        int employeeID1 = 47899;
        int employeeID2 = 39199; 
        int employeeID3 = 81774;
        
        String department1 = "Accounting" ;
        String department2 = "IT";
        String department3 = "Manufacturing";
        
        String position1 = "Vice Presedent";
        String position2 = "Programmer";
        String position3 = "Engineer";
         
        
        Employee emp1 = new Employee();
        
        emp1.setName(Employeename1);
        emp1.setID(employeeID1);
        emp1.setdepart(department1);
        emp1.setPost(position1);

        Employee emp2 = new Employee();
        
        emp2.setName(Employeename2);
        emp2.setID(employeeID2);
        emp2.setdepart(department2);
        emp2.setPost(position2);

        Employee emp3 = new Employee();
        
        emp3.setName(Employeename3);
        emp3.setID(employeeID3);
        emp3.setdepart(department3);
        emp3.setPost(position3);
        // TODO code application logic here
        
         JOptionPane.showMessageDialog(null, " Name\t\tID Number\t\t Department\t\tPosition"
                 + "\n ____________________________________________________________________________\n"
                 +emp1.getName()+"\t\t\t"+emp1.getID()+"\t\t\t"+emp1.getdepart()+"\t\t\t"+emp1.getPost()+
             "\n"+emp2.getName()+"\t\t\t"+emp2.getID()+"\t\t"+emp2.getdepart()+"\t\t\t"+emp2.getPost()+
            "\n"+emp3.getName()+"\t\t\t"+emp3.getID()+"\t\t\t"+emp3.getdepart()+"\t\t\t"+emp3.getPost());
         
         
        System.exit(0);
        
        
    }
    
}

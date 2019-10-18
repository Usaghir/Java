            /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chd6;


public class SavingsAccountClass {

    public static void main(String[] args) throws IOException
    {
        
        double annualIntRate, montintrate,startingbalance, amountdeposit, amountWithdraw, toDep=0,totWith=0, permonghttotal, totalinterest=0, totmonth=0; 
        double withdrawcount=0, depositcount=0, interetcount;
        
        int numOfMonths;
        String input;
        
        PrintWriter outputFile1 = new PrintWriter("Withdrawals");
        outputFile1.println(100.00); //+"\n"+124.00+"\n"+78.92+"\n"+37.55);
        outputFile1.println(124.00);
        outputFile1.println(78.92);
        outputFile1.println(37.55);
        
        PrintWriter outputFile2 = new PrintWriter("Deposit");
        outputFile2.println(29.88); //+"\n"+110.00+"\n"+27.52+"\n"+50.00+"\n"+12.90);
        outputFile2.println(110.00);
        outputFile2.println(27.52);
        outputFile2.println(50.00);
        outputFile2.println(12.90);
        
        outputFile1.close();
        outputFile2.close();
        
        Scanner keyboard = new Scanner(System.in); 
        
        
        SavingsAccount account = new SavingsAccount(500.00);
        
        input=JOptionPane.showInputDialog("Plese enter the Annual interest rate ");
        annualIntRate=Double.parseDouble(input);
        
        montintrate=annualIntRate/12;
       
        File myFile1 = new File("Deposit.txt"); 
        Scanner inputFile1 = new Scanner(myFile1);
        while (inputFile1.hasNext())
        {
        // Read the next name.
        amountdeposit = inputFile1.nextDouble();
        account.adddeposit(amountdeposit);
        toDep+=account.getdeposit();
        depositcount+=amountdeposit;
        // Display the last name read. 
        
        }
        inputFile1.close();

        File myFile2 = new File("Withdrawals.txt"); 
        Scanner inputFile2 = new Scanner(myFile1);
        
        while (inputFile2.hasNext())
        {
        amountWithdraw = inputFile2.nextDouble();
        account.subwithdrawel(amountWithdraw);
        totWith+=account.getwithdrawel();
        withdrawcount+=amountWithdraw;
        }
        inputFile2.close();
        
        account.setInteret(montintrate);
        totalinterest+=account.getinterest();
        
        
        JOptionPane.showMessageDialog(null, "The ending balance is"+(totWith+totalinterest)+"\nThe total amount deposit is"+depositcount+
        "\nThe toal amount amount withdrawals is"+withdrawcount+"\nThe total interest earned"+((totWith+totalinterest)-(500.00+depositcount-withdrawcount)));
        System.exit(0);

    }
    
}

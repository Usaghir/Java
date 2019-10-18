
package ch5;

/**
 * @author umerraja
 */
public class FallingDistance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        double d, fallingTime;
        
        for (int i = 1; i <=10; i++)
        {
          fallingTime = fallingDistance(i);
          System.out.printf("The falling time for %d second is %.2f \n",i,fallingTime);
        }  
    }
        
    
    public static double fallingDistance(double time)
            
    {
        final double g=9.8;
        return 0.5*g*time*time; 
    }
    
}

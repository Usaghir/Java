/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package speedconverter;

/**
 *
 * @author umerraja
 */
public class SpeedConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int SpeedKMH;
        double SpeedMPH;
        
        
        System.out.println("KPH \t\t number MPH");
        System.out.println("------------------------------");
        
        for (SpeedKMH=60; SpeedKMH<=130; SpeedKMH+=10){
            
       SpeedMPH=SpeedKMH*0.6214;
        System.out.println(SpeedKMH+"\t\t "+SpeedMPH);
        }
        // TODO code application logic here
    }
    
}

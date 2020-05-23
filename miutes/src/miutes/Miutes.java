/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miutes;
import java.util.*;

/**
 *
 * @author SAKTHI
 */
public class Miutes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double minutes=60*24*365;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number of minutes:");
        double min=input.nextDouble();
        long years=(long)(min/minutes);
        int days=(int)(min/60/24)%365;
        System.out.println((int)min+ "minutes is approximately\t" +years+ "years and" +days+ "days");
    }
    
}

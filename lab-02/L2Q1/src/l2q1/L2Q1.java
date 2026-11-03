/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q1;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class L2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Please enter a temperature in degree Fahrenheit: ");
        
        double fah=sc.nextDouble();
        
        double cel=(fah-32)/1.8;
        
        System.out.printf("Temperature in Celcius: %.2f \u00B0C%n",cel);
        
        
        
        
        
        sc.close();
        
        
    }
    
}

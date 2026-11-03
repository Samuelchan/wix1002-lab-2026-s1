/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q2;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class L2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner sc=new Scanner(System.in);
       
        System.out.println("Please enter the price of the car: ");
        double P=sc.nextDouble();
        
        System.out.println("Please enter the down payment for the car: ");
        double D=sc.nextDouble();
        
        System.out.println("Please enter the interest rate in %: ");
        double R=sc.nextDouble();
        
        System.out.println("Please enter the loan duration in year: ");
        double Y=sc.nextDouble();
        
        double M=(P-D)*(1+R*Y/100)/(Y*12);
        
        
        System.out.printf("The monthly payment is: RM %.2f%n",M);
       
       sc.close();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q5;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class L3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a value of a: ");
        double a=sc.nextDouble();
        
        System.out.println("Enter a value of b: ");
        double b=sc.nextDouble();
        
        System.out.println("Enter a value of c: ");
        double c=sc.nextDouble();
        
        System.out.println("Enter a value of d: ");
        double d=sc.nextDouble();
        
        System.out.println("Enter a value of e: ");
        double e=sc.nextDouble();
        
        System.out.println("Enter a value of f: ");
        double f=sc.nextDouble();
        
        
        if(a*d-b*c==0){
            System.out.println("The equation has no solution.");
            return;
        }
        
        double x=(e*d-b*f)/(a*d-b*c);
        double y=(a*f-e*c)/(a*d-b*c);
        
        System.out.println("x is "+x);
        System.out.println("y is "+y);
        
        
        
        sc.close();
        
    }
    
}

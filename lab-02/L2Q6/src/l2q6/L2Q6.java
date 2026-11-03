/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q6;
import java.util.Scanner;

/**
 *
 * @author samue
 */
public class L2Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the amount of water in gram: ");
        double gram=sc.nextInt();
        
        double M=gram/1000;
        
        System.out.println("Enter the initial temperature in Fahrenheit: ");
        double iniF=sc.nextDouble();
        
        System.out.println("Enter the final temperature in Fahrenheit: ");
        double finF=sc.nextDouble();
        
        double iniC=(iniF-32)/1.8;
        double finC=(finF-32)/1.8;
        
        double Q=M*(finC-iniC)*4184;
        
        System.out.printf("The energy needed is %e%n",Q);
        
        sc.close();
    }
    
}

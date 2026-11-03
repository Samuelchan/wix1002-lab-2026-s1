/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q3;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class L3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the sales volume: ");
        
        int sales=sc.nextInt();
        double com;
        
        if(sales<=100){
            com=0.05*sales;
        }
        
        else if(sales>100&&sales<=500){
            com=0.075*sales;
        }
        
        else if(sales>500&&sales<=1000){
            com=0.1*sales;
        }
        
        else{
            com=0.125*sales;
        }
        
        System.out.printf("Commission: %.2f%n",com);
        
        
        
        sc.close();
    }
    
}

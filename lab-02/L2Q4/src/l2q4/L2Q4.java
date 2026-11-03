/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q4;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class L2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number of seconds: ");
        
        int initialSeconds=sc.nextInt();
        int seconds=initialSeconds;
        
        int hours=0;
        int minutes=0;
        
        while(seconds>=3600){
            hours++;
            seconds-=3600;
        }
        
        while(seconds>=60){
            minutes++;
            seconds-=60;
        }
        
        
        
        System.out.println(initialSeconds+" seconds is "+hours+" hours, "+minutes+" minutes and "+seconds+" seconds");
        
        
        sc.close();
    }
    
}

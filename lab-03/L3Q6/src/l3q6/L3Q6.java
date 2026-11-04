/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q6;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class L3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter radius of a circle: ");
        double radius=sc.nextDouble();
        
        
        System.out.println("Enter a coordinate point (x,y) : ");
        System.out.println("Enter x: ");
        double x=sc.nextDouble();
        
        System.out.println("Enter y: ");
        double y=sc.nextDouble();
        
        double dist=Math.sqrt((x*x)+(y*y));
        
        if(dist<=radius){
            System.out.println("The point is inside the circle");
        }
        
        else{
            System.out.println("The point is outside the circle");
        }
        
        
        
        sc.close();
        
    }
    
}

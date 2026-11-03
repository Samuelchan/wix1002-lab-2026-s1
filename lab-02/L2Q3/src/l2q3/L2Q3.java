/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q3;

import java.util.Random;

/**
 *
 * @author samue
 */
public class L2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Random rd=new Random();
        
        double num1=10+(50-10)*rd.nextDouble();
        double num2=10+(50-10)*rd.nextDouble();
        double num3=10+(50-10)*rd.nextDouble();
        
        System.out.printf("First number: %.2f%n",num1);
        System.out.printf("Second number: %.2f%n",num2);
        System.out.printf("Third number: %.2f%n",num3);
        
        double sum=num1+num2+num3;
        System.out.printf("The sum of the numbers is %.2f%n",sum);
        
        double ave=sum/3;
        System.out.printf("The average of the numbers is %.2f%n",ave);
        
        
       
        
    }
    
}

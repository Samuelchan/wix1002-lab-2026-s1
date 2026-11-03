/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q1;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class L3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter two integer number: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        
        boolean running=true;
        
        while(running){
        System.out.println("Enter the operand: ");
        char operand=sc.next().charAt(0);
        
        if(operand=='+'){
            int sum=num1+num2;
            System.out.println(num1+" + "+num2+" ="+sum);
            running=false;
        }
        
        else if(operand=='-'){
            int dif=Math.abs(num1-num2);
            System.out.println(num1+" - "+num2+" ="+dif);
            running=false;
        }
        
        else if(operand=='*'){
            int mul=num1*num2;
            System.out.println(num1+" * "+num2+" ="+mul);
            running=false;
        }
        
        else if(operand=='/'){
            double quo=num1/num2;
            System.out.println(num1+" / "+num2+" ="+quo);
            running=false;
        }
        
        else if(operand=='%'){
        int rem=num1%num2;
        System.out.println(num1+" % "+num2+" ="+rem);
        running=false;
    }
        
        else{
            System.out.println("Enter a valid character!!!");
        }
    }
        
        
        
        sc.close();
        
        
    }
    
}

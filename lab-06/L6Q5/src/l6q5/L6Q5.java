/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l6q5;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author samue
 */
public class L6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        Random rd=new Random();
        
        int num1=rd.nextInt(13);
        int num2=rd.nextInt(13);
        
        System.out.println("What is "+num1+" * "+num2+" ?");
        int answer=sc.nextInt();
        
        if(checkAnswer(num1,num2,answer)){
            System.out.println("Correct!");
        }
        
        else{
            System.out.println("Wrong!");
        }
        
        
        
        sc.close();
    }
    
    public static boolean checkAnswer(int a, int b, int answer){
        
        return a * b == answer;
        
    }
    
}

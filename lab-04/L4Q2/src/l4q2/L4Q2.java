/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q2;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class L4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter an integer n: ");
        int n=sc.nextInt();
        int sum=0;
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                sum+=j;
            }
            
        }
        
        System.out.println("The sum is : "+sum);
        
        
        sc.close();
    }
    
}

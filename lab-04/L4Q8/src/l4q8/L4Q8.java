/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q8;

import java.util.Random;

/**
 *
 * @author samue
 */
public class L4Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Random rd = new Random();

        int n = rd.nextInt(101);   
        System.out.println("n is " + n);
        System.out.print("First " + n + " prime number: ");

        int count = 0;      
        int num = 2;        

        while (count < n) {

            boolean isPrime = true;

            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++;
                System.out.print(num);
                if (count < n) {
                    System.out.print(", ");
                }
            }

            num++;
        }
        System.out.println();
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q5;

import java.util.Random;

/**
 *
 * @author samue
 */
public class L2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Random rand = new Random();
        int num = rand.nextInt(10001);  

        int temp = num;
        int sum = 0;

        while (temp > 0) {
            sum += temp % 10;   
            temp /= 10;         
        }

        System.out.println("The random number is: " + num);
        System.out.println("The sum of all the digits is: " + sum);
    }
    
}

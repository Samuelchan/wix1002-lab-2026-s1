/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l5q2;

import java.util.Random;

/**
 *
 * @author samue
 */
public class L5Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Random rd = new Random();
        int[] numbers = new int[10];

        int count = 0;                       
        while (count < numbers.length) {
            int num = rd.nextInt(21);        

            boolean duplicate = false;
            for (int i = 0; i < count; i++) {
                if (numbers[i] == num) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                numbers[count] = num;
                count++;
            }
        }

        System.out.print("10 non-duplicate random integers: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        
        
        
        
    }
    
    }

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q3;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class L4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        double sum = 0;          // sum of X
        double sumSquare = 0;    // sum of X^2
        int count = 0;           // N

        System.out.print("Enter a score [negative score to quit]: ");
        int score = sc.nextInt();

        while (score >= 0) {
            min = Math.min(min, score);
            max = Math.max(max, score);
            sum += score;
            sumSquare += score * score;
            count++;

            System.out.print("Enter a score [negative score to quit]: ");
            score = sc.nextInt();
        }

        if (count == 0) {
            System.out.println("No scores were entered.");
        } else {
            double average = sum / count;
            System.out.println("Minimum Score: " + min);
            System.out.println("Maximum Score: " + max);
            System.out.printf("Average Score: %.2f%n", average);

            if (count > 1) {
                double variance = (sumSquare - (sum * sum) / count) / (count - 1);
                double sd = Math.sqrt(variance);
                System.out.printf("Standard Deviation: %.2f%n", sd);
            } else {
                System.out.println("Standard Deviation: N/A (need at least 2 scores)");
            }
        }

        sc.close();
    }
    
}

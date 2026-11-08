/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l5q1;


import java.util.Scanner;
import java.util.Random;


/**
 *
 * @author samue
 */
public class L5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int n;
        do {
            System.out.print("Enter the number of students: ");
            while (!sc.hasNextInt()) {          // reject non-numeric input
                System.out.println("Please enter a valid integer.");
                sc.next();
                System.out.print("Enter the number of students: ");
            }
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Please enter a value more than 0.");
            }
        } while (n <= 0);

        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = rd.nextInt(101);        // 0-100 inclusive
        }

        System.out.print("List of scores: ");
        for (int i = 0; i < n; i++) {
            System.out.print(scores[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        int highest = scores[0];
        int lowest = scores[0];
        int sum = 0;
        for (int score : scores) {
            if (score > highest) highest = score;
            if (score < lowest) lowest = score;
            sum += score;
        }

        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
        System.out.printf("Average score: %.2f%n", (double) sum / n);

        sc.close();
    }
    
}

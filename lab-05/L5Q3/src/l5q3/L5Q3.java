/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l5q3;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author samue
 */
public class L5Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        int[][] hours = new int[n][7];

        // Generate random work hours (1-8)
        for (int i = 0; i < hours.length; i++) {
            for (int j = 0; j < hours[i].length; j++) {
                hours[i][j] = rd.nextInt(8) + 1;
            }
        }

        // Header row (printed once)
        System.out.printf("%-12s", "");
        for (int j = 0; j < 7; j++) {
            System.out.printf("%-6s", "Day" + (j + 1));
        }
        System.out.println("Total");

        // One row per employee
        for (int i = 0; i < hours.length; i++) {
            int total = 0;
            System.out.printf("%-12s", "Employee " + (i + 1));

            for (int j = 0; j < hours[i].length; j++) {
                System.out.printf("%-6d", hours[i][j]);
                total += hours[i][j];
            }

            System.out.println(total);
        }

        sc.close();
    }
    
}

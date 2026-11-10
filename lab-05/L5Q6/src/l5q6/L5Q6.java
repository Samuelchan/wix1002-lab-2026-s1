/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l5q6;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class L5Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.print("Enter the number of row of Pascal Triangle to generate: ");
            n = sc.nextInt();
        } while (n <= 0);

        int[][] tri = new int[n][n];        

        for (int i = 0; i < n; i++) {
            tri[i][0] = 1;                 
            for (int j = 1; j <= i; j++) {
                tri[i][j] = tri[i - 1][j - 1] + tri[i - 1][j];
            }
        }

        System.out.println("The Pascal Triangle with " + n + " row(s)");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%-4d", tri[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
    
}

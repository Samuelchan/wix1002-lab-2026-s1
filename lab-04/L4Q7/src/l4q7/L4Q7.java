/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q7;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class L4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double P = sc.nextDouble();

        System.out.print("Enter interest in %: ");
        double i = sc.nextDouble();

        System.out.print("Enter total number of month(s): ");
        int N = sc.nextInt();

        double r = i / (12 * 100);   

       
        double M = (P * r) / (1 - Math.pow(1 + r, -N));

        System.out.printf("%-8s%-18s%-14s%-12s%-16s%s%n",
                "Month", "Monthly Payment", "Principal", "Interest", "Unpaid Balance", "Total Interest");

        double totalInterest = 0;

        for (int n = 1; n <= N; n++) {
            double C = M * Math.pow(1 + r, -(1 + N - n));   
            double L = M - C;                              
            double R = L / r - C;                           

            if (Math.abs(R) < 0.005) {
                R = 0;      
            }

            totalInterest += L;

            System.out.printf("%-8d%-18.2f%-14.2f%-12.2f%-16.2f%.2f%n",
                    n, M, C, L, R, totalInterest);
        }

        sc.close();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q4;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class L4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        System.out.print("Enter the first day of the year (0 for Sunday, ..., 6 for Saturday): ");
        int firstDay = sc.nextInt();

        boolean leap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        int feb = leap ? 29 : 28;

        int daysBeforeMay = 31 + feb + 31 + 30;
        int daysBeforeAug = daysBeforeMay + 31 + 30 + 31;

        int mayStart = (firstDay + daysBeforeMay) % 7;
        int augStart = (firstDay + daysBeforeAug) % 7;

        printMonth("May", year, mayStart, 31);
        printMonth("August", year, augStart, 31);

        sc.close();
    }

    public static void printMonth(String name, int year, int startDay, int daysInMonth) {

        System.out.println();
        System.out.println("       " + name + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);

       
            if ((startDay + day) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
    
}

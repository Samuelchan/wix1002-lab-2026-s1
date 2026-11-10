/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l5q5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author samue
 */
public class L5Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(101);            
        }

        System.out.println("A list of 20 random integer within 0 to 100");
        System.out.println(Arrays.toString(arr));

        
        Arrays.sort(arr);
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        System.out.println("Array in descending order");
        System.out.println(Arrays.toString(arr));

        System.out.print("Enter a number to search: ");
        int key = sc.nextInt();

       
        int loops = 0;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            loops++;
            if (arr[i] == key) {
                found = true;
                break;
            }
        }
        System.out.println(key + (found ? " found" : " not found"));
        System.out.println("Linear Search - " + loops + " loop(s)");

       
        loops = 0;
        found = false;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            loops++;
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                found = true;
                break;
            } else if (arr[mid] > key) {
                low = mid + 1;      
            } else {
                high = mid - 1;
            }
        }
        System.out.println(key + (found ? " found" : " not found"));
        System.out.println("Binary Search - " + loops + " loop(s)");

        sc.close();
    }
    
}

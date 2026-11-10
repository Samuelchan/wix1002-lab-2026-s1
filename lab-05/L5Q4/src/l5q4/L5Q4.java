/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l5q4;

/**
 *
 * @author samue
 */
public class L5Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[][] original = {
            {1, 5, 7},
            {3, 6, 9},
            {5, 3, 8}
        };

        int[][] rotated = new int[3][3];

        
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                rotated[c][2 - r] = original[r][c];
            }
        }

        System.out.println("3 by 3 Matrix");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(original[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("After rotates 90 degrees clockwise");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(rotated[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l6q1;

/**
 *
 * @author samue
 */
public class L6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for(int i=1;i<=20;i++){
            System.out.println(triangularNumber(i));
        }
        
    }
    
    public static int triangularNumber(int n){
        int sum = 0;
        
        for(int i=1;i<n;i++){
            sum+=i;
        }
        
        return sum;
        
    }
    
}

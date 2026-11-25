/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l6q4;

/**
 *
 * @author samue
 */
public class L6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("GCD of 24 and 8: "+gcd(24,8));
        
        System.out.println("GCD of 200 and 625: "+gcd(200,625));
        
    }
    
    public static int gcd(int a,int b){
        
        while(b!=0){
            
            int remainder=a%b;
            
            a=b;
            b=remainder;
            
        }
        
        return a;
        
    }
    
}

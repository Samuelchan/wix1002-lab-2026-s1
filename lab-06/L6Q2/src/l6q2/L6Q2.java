/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l6q2;

/**
 *
 * @author samue
 */
public class L6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n=4;
        
        for(int i=1;i<=n;i++){
            multiPrint(i,'*');
            System.out.println("");
        }
        
        System.out.println("");
        
        // Upper half of diamond
        for(int i=1;i<=n;i++){
            multiPrint(n-i,' ');
            multiPrint(2*i-1,'*');
            System.out.println("");
        }
        
        // Lower half of diamond
        for(int i=n-1;i>=1;i--){
            multiPrint(n-i,' ');
            multiPrint(2*i-1,'*');
            System.out.println("");
        }
        
    }
    
    public static void multiPrint(int n,char c){
        
        for(int i=1;i<=n;i++){
            
            System.out.print(c);
            
        }
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l6q6;

/**
 *
 * @author samue
 */
public class L6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int count=0;
        int number=2;
        
        System.out.println("First 20 Palindromic Primes:");
        
        while(count<20){
            
            if(isPalindromicPrime(number)){
                System.out.print(number+" ");
                count++;
            }
            number++;
        }
        
        System.out.println("\n\nFirst 20 Emirps:");
        
        count=0;
        number=2;
        
        while(count<20){
            
            if(isEmirp(number)){
                System.out.print(number+" ");
                count++;
            }
            number++;
        }
        
             
        
    }
    
    public static boolean isPrime(int n){
        
        if(n<2){
            return false;
        }
        
        for(int i=2;i<n;i++){
            
            if(n%i==0){
                
                return false;
                       
            }
           
        }
        return true;
    }
    
    public static int reverseInteger(int number){
        
        int reversed=0;
        
        while(number>0){
            
            int digit=number%10;
            reversed=reversed*10+digit;
            number=number/10;
            
            
        }
        
        return reversed;
        
    }
    
    public static boolean isPalindromicPrime(int n){
        return isPrime(n) && reverseInteger(n)==n;
    }
    
    public static boolean isEmirp(int n){
        
        int reversed=reverseInteger(n);
        
        return isPrime(n)&&isPrime(reversed)&&reversed!=n;
        
    }
    
    
    
}

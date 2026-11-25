/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l6q3;

/**
 *
 * @author samue
 */
public class L6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] numbers={1234,5678,2468,1357,1111,2222,3456,9981,6789,9876};
       
        reverseArray(numbers);
        
        for(int x:numbers){
            System.out.println(x);
        }
        
        
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
    
    public static void reverseArray(int[] numbers){
        
        for(int i=0;i<numbers.length;i++){
            numbers[i]=reverseInteger(numbers[i]);
        }
        
    }
    
}

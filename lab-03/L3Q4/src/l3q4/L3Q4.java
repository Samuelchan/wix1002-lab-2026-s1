/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q4;

import java.util.Random;

/**
 *
 * @author samue
 */
public class L3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Random rd=new Random();
        
        int player1a=rd.nextInt(6)+1;
       int player2a=rd.nextInt(6)+1;
       
       int player1b=rd.nextInt(6)+1;
       int player2b=rd.nextInt(6)+1;
       
       int sum1=player1a+player1b;
       int sum2=player2a+player2b;
       
        System.out.println("Player 1 rolled: "+player1a+" and "+player1b+" (total: "+sum1+")");
        System.out.println("Player 2 rolled: "+player2a+" and "+player2b+" (total: "+sum2+")");
       
       if(sum1>sum2){
           System.out.println("Player 1 wins!!!");
       }
       
       else if(sum2>sum1){
           System.out.println("Player 2 wins!!!");
       }
       
       else{
           System.out.println("It's a draw...");
       }
       
        
        
        
    }
    
}

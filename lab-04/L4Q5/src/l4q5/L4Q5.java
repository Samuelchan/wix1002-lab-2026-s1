/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q5;

import java.util.Random;

/**
 *
 * @author samue
 */
public class L4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Random rd=new Random();
        
        int player1=rd.nextInt(6)+1;  //rd.nextInt(6) (0-5)
        int sum1=player1;
        
        while(player1==6){
            player1=rd.nextInt(6)+1;
            sum1+=player1;
             System.out.println("Points of player 1: "+sum1);
            
        }
        
        
        int player2=rd.nextInt(6)+1;
        int sum2=player2;
        
      
        while(player2==6){
            player2=rd.nextInt(6)+1;
            sum2+=player2;
             System.out.println("Points of player 2: "+sum2);
            
        }
        
        
       
        System.out.println("Points of player 1: "+sum1);
        
        
        System.out.println("Points of player 2: "+sum2);
        
        while(sum1<=100&&sum2<=100){
            
           int p1=rd.nextInt(6)+1;  //rd.nextInt(6) (0-5)
        sum1+=p1;
        
        while(p1==6){
            p1=rd.nextInt(6)+1;
            sum1+=p1;
             System.out.println("Points of player 1: "+sum1);
            
        }
        
        int p2=rd.nextInt(6)+1;
        sum2+=p2;
        
        while(p2==6){
            p2=rd.nextInt(6)+1;
            sum2+=p2;
             System.out.println("Points of player 2: "+sum2);
            
        }
        
        System.out.println("Points of player 1: "+sum1);
        
        
        System.out.println("Points of player 2: "+sum2);
            
        }
        
        if(sum1>100){
            
            System.out.println("Player 1 wins!!!");
            return;
        }
        
        if(sum2>100){
            System.out.println("Player 2 wins!!!");
            
        }
        
    }
    
}

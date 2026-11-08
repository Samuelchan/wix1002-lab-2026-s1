/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q6;

import java.util.Random;

/**
 *
 * @author samue
 */
public class L4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Random rd=new Random();
        
        int num=rd.nextInt(Integer.MAX_VALUE);
        int rdnum=num;
        int count=0;
        
        if(rdnum==0){
            count+=1;
        }
        
        while(rdnum>0){
            rdnum/=10;
            count++;
        }
        
        System.out.println("The non-negative random integer is "+num);
        System.out.println("The number of digits in the integer is "+count);
        
        
    }
    
}

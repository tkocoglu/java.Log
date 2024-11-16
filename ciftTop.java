/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaproje;

/**
 *
 * @author Tayyip Koçoğlu
 */
import java.util.Scanner;

public class ciftTop {
    
    public static void main(String[] args) {
         int n;
        int total = 0 ,total2 =0;
        Scanner input = new Scanner(System.in);
        
       
         do {   
             System.out.println("Bir sayi giriniz: ");
             
             n = input.nextInt();
             
             if(n%2==0){
                 
                 total+=n;
                 
             }
          
        } while (n % 2 == 0);
        
         System.out.println("Cift olan sayilarin toplami: "+total);
    }
}

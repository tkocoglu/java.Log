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

public class prefectNumber {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Bir sayi giriniz: ");
        
       int x = input.nextInt();
       
       int total = 0;
       
       for(int i=1; i<x; i++){
           if(x%i == 0){
              total+=i;
              
           }
           
       }
       
       if(total == x){
           System.out.println(x+" Sayisi mükemmel sayidir.");
       }else{
             System.out.println(x+" Sayisi mükemmel sayi değildir.");
       }
    }
}

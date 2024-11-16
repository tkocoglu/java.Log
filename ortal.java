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

public class ortal {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Bir sayi giriniz: ");
        
        int sayi = input.nextInt();
        int sayaç = 0, top = 0;
        for(int i = 1; i<=sayi; i++){
            
            
            if(i%12 == 0){
               top+=i;
               
               sayaç++;
            }
         
        }
       if (sayaç > 0) { 
           double ortalama = (double) top / sayaç; 
       System.out.println("0'dan " + sayi + "'ya kadar olan 12'ye bölünen sayıların ortalaması: " + ortalama); 
       } 
       else {
           System.out.println("0'dan " + sayi + "'ya kadar 12'ye bölünen sayı yoktur.");
       }
        
    }
}

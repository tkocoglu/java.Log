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

public class mathSem {
    
    static void tersSeri(int orijinal, int temp){
     
      if(temp > orijinal){
          return;
      }  
        System.out.print(temp+" ");
        tersSeri(orijinal, temp+5);
        
    }
    static void seriyiYazdir(int orijinal, int temp){
        if(temp<= 0){
            System.out.print(temp+" ");
            tersSeri(orijinal, temp+ 5);
            return;
        }
        System.out.print(temp+" ");//negatif sayiyi yazdir
        
        
        seriyiYazdir(orijinal, temp-5);
        
    }
    
    
    public static void main(String[] args) {
         Scanner input =new Scanner(System.in); 
         
         System.out.print("N değerini giriniz : ");
          int n = input.nextInt();
          
          System.out.print("Cikti: ");
          seriyiYazdir(n, n);
      
    }
    
    
}

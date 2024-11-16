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
        
public class basHesap {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Sayi giriniz: ");
        
          int sayi = input.nextInt();
          
          int top=0, sonSayi, temp=sayi;
          
          while(temp!=0){
              sonSayi=temp%10;
              
              temp/=10;
              
              top+=sonSayi;
          }
          
          System.out.println(sayi+" Sayisinin basamak rakammlarinin toplami: "+top+"'dir");
    }
    
}

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

public class toCompare {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Kaç tane sayi gireceksiniz: ");
        
        int s = input.nextInt();
        int i = 1;
        int x;
        int max, min;
          System.out.print("1. sayiyi giriniz: ");
          x = input.nextInt();
          max = x;
          min = x;
        while(i<(s)){
            System.out.print((i+1)+". sayiyi giriniz: ");
          x = input.nextInt();
          
          if(x>max){
              max = x;
          }
          if(x<min){
              min = x;
          }
          i++;
        }
        System.out.println("En buyuk sayi = "+max+"\nEn kucuk sayi = "+min);
        
    }
}

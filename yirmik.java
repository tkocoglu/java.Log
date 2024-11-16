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

public class yirmik {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Bir sayi giriniz: ");
        
        int sayi = input.nextInt();
        
        System.out.print("4 un katlari: ");
        for(int i=1; i<=sayi; i*=4){
            System.out.print(i+" ");
            }
        
        System.out.print("5 in katlari: ");
        for(int j=1; j<=sayi; j*=5){
            System.out.print(j+" ");
        }
   }
}

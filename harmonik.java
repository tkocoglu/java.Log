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

public class harmonik {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Bir sayi giriniz: ");
        
        int say = input.nextInt();
        
        double total=0;
        double x=1 ;
        
        for(int i=1; i<=say; i++){
            
         x/=i;
         
         total+=x;
        }
        
        System.out.println(say+" Sayisinin harmonik serisi = "+total);
    }
}

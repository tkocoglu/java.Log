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
        
public class primeNumber {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Bir sayi giriniz: ");
        
        int num= input.nextInt();
        
        boolean isprime = true;
        
        if(num==1){
            isprime = false;
        }else{
            for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i==0){
                isprime = false;
            }
        }
        }
        if(isprime){
            System.out.println(num+" Sayisi asal bir sayidir...");
        }else{
            System.out.println(num+" Sayisi asal bir sayi değildir...");

        }
    }
    
}

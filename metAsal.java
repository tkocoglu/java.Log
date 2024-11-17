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

public class metAsal {
    
    static boolean isPrime( int num, int divisor){
        if(num<= 2){
            return num == 2;
        }
        if(num%divisor == 0){
            return false;
        }
        if(divisor*divisor > num){
            return true;
        }
        return isPrime(num, divisor+1);
        
    } 
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Bir sayi girin: ");
        int sayi = input.nextInt();
        
        if(isPrime(sayi, 2)){
            System.out.println(sayi+" bir asal sayidir.");
        }
        else{
            System.out.println(sayi+" bir asal sayi değildir.");
        }
    }
}

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

public class metPalon {
    static boolean ispalindrom(int say){
       
        int temp = say, yenisay=0, sonrakisay;
        
        while(temp !=0 ){
            
            sonrakisay = temp%10;
            
            yenisay= yenisay*10+sonrakisay;
            
            temp/=10;
        }
        
        if(say == yenisay){
            System.out.println(say+" Sayisi bir palindrom sayidir.");
            return true;
        }else{
             System.out.println(say+" Sayisi bir palindrom sayi degildir......");
             return false;
        }
       
    }
    
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        System.out.print("sayi gir : ");
        
        int x = input.nextInt();
        
        ispalindrom(x);
     
    }
    
}

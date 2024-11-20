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
import java.util.Random;
public class numRand {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        
        Scanner input = new Scanner(System.in);
        int sccor = 100;
        int hak = 0;
        int tahmin;
        
        while(hak < 10){
            System.out.print("Sayiyi tahmin ediniz: ");
            tahmin = input.nextInt();
            
             if(tahmin<0 || tahmin>99){
                 System.out.println(" Girdiğiniz değer geçersiz lütfen başka bir tahminde bulunun...");
                 continue;
             }
            
            if(number == tahmin){
                System.out.println("Tebrikler tahmininiz doğru. tahmin edilen değer "+number+" Puanınız : "+sccor);
                break;
            }else{
                if(number > tahmin){
                    System.out.println("Tahmininiz yanliş YUKARI");
                }
                if(number<tahmin){
                    System.out.println("Tahmininiz yanliş AŞAĞI");
                }
                hak++;
                sccor-=10;
                System.out.println("Kalan hakınız: "+(10-hak)+" Güncel puanınız "+sccor);
            }
            
        }
        
    }
    
}

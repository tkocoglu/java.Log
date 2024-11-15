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

public class burçHesap {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("----------BURÇ HESAPLAYAN PROGRAM-------------");
        System.out.print("Doğduğunuz ay: ");
        
        int  month = input.nextInt();
        
        System.out.print("Doğduğunuz gün: ");
        
        int day = input.nextInt();
        
        if( month == 1){
            if(day<=21){
                System.out.println("OĞLAK");
            }
            else{
                System.out.println("KOVA");
            }
        }
        else if(month == 2){
            if(day<=19){
                System.out.println("KOVA");
            }
            else{
                System.out.println("BALIK");
            }
        }
        else if(month == 3){
            if(day<=20){
                 System.out.println("BALIK");
            }
            else{
                System.out.println("KOÇ");
            }
        }
        else if(month == 4){
            if(day<=20){
                System.out.println("KOÇ");
            }
            else{
                System.out.println("BOĞA");
            }
        }
        else if(month == 5){
            if(day<=21){
                 System.out.println("BOĞA");
            }
            else{
                System.out.println("IKIZLER");
            }
        }
        else if(month == 6){
            if(day<=22){
                 System.out.println("IKIZLER");
            }
            else{
                System.out.println("YENGEÇ");
            }
        }
        else if(month == 7){
            if(day<=22){
                 System.out.println("YENGEÇ");
            }
            else{
                System.out.println("ASLAN");
            }
        }
        else if(month == 8){
            if(day<=22){
                 System.out.println("ASLAN");
            }
            else{
                System.out.println("BAŞAK");
            }
        }
        else if(month == 9){
            if(day<=22){
                 System.out.println("BAŞAK");
            }
            else{
                System.out.println("TERAZİ");
            }
        }
        else if(month == 10){
            if(day<=22){
                 System.out.println("TERAZİ");
            }
            else{
                System.out.println("AKREP");
            }
        }
        else if(month == 11){
            if(day<=21){
                 System.out.println("AKREP");
            }
            else{
                System.out.println("YAY");
            }
        }
        else if(month == 12){
            if(day<=21){
                 System.out.println("YAY");
            }
            else{
                System.out.println("OĞLAK");
            }
        }
        
    }
}

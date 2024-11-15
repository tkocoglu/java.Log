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

public class uçakBileti {
  
    public static void main(String[] args) {
        
          int yas,mesafe,yolculukTip;
          double indirimTut ,yaşIndir ,yeniTutar , total;
          
          
    Scanner input = new Scanner(System.in);
    
        System.out.print("Mesafe giriniz....:");
        
        mesafe = input.nextInt();
        
        System.out.print("Yolculuk tipi giriniz...(1=> Tek yön, 2=> Cift yön):");
        
        yolculukTip = input.nextInt();
        
        System.out.print("Yaşınızı giriniz.....:");
        
        yas = input.nextInt();
        
        double tutar = mesafe*0.1;
        
        if(yas<12){
            yaşIndir = tutar*0.5;
         indirimTut = tutar - yaşIndir;   
        }
        else if(yas>=12 && yas<=24){
            yaşIndir = tutar*0.1;
            indirimTut = tutar - yaşIndir;
        }
        else if(yas>=65){
            yaşIndir = tutar*0.3;
            indirimTut = tutar -yaşIndir;
        }
        else{
            indirimTut = tutar;
        }
        
        if(yolculukTip == 2){
           yeniTutar = indirimTut*0.8;
           total = yeniTutar*2;
        }else{
            total = indirimTut;
        }
        System.out.println("Uçak bilet tutarınız: "+total);
    }
}

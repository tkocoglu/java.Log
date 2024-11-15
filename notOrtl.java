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

public class notOrtl {
    
    public static void main(String[] args) {
        
        double mat, fizik, türk, kim, müz, topNot = 0;
        
        int topders = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Matematik notunuz: ");
        
       mat = input.nextInt();
       
        if(mat>0 && mat<=100){
            topNot+=mat;
            topders++;
        }else{
            System.out.println("Girilen not hatali.!!1");
        }
        
        
        
        System.out.print("Fizik notunuz: ");
        
       fizik = input.nextInt();
       
       if(fizik>0 && fizik<=100){
           topNot+=fizik;
           topders++;
       }else{
           System.out.println("Girilen not hatalı.!!!");
       }
        
        System.out.print("Türkçe notunuz: ");
        
       türk = input.nextInt();
        
       if(türk>0 && türk<=100){
           topNot+=türk;
           topders++;
       }else{
           System.out.println("Girilen not hatalı.!!!");
       }
       
        System.out.print("Kimya notunuz: ");
        
       kim = input.nextInt();
       
       if(kim>0 && kim<=100){
           topNot+=kim;
           topders++;
       }else{
           System.out.println("Girilen not hatalı.!!!");
       }
        
        System.out.print("Müzik notunuz: ");
        
       müz = input.nextInt();
       
       if(müz>0 && müz<=100){
           topNot+=müz;
           topders++;
       }else{
           System.out.println("Girilen not hatalı.!!!");
       }
        
       if(topders==5){
           double ort= topNot/topders;
           if(ort<55){
               System.out.println("Kaldiniz."+" Ortalamaniz: "+ort);
           }else{
               System.out.println("Geçtiniz "+"Ortalamaniz: "+ort);
           }
       }else{
           System.out.println("Yetersiz ders girişi...");
       }
        
    }
    
}

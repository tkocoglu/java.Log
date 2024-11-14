/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaproje;

import java.util.Scanner;
public class Javaproje {
    
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        System.out.println("Işlem seçiniz\n1-Toplama\n2-Cikarma\n3-Çarpma\n4-Bölme");
        
        int işlem = input.nextInt();
        
        System.out.println("Birinci sayiyi giriniz: ");
        
        int a = input.nextInt();
        
        System.out.println("Ikinci sayiyi giriniz: ");
        
        int b = input.nextInt();
        
        switch (işlem) {
            case 1:
                System.out.println(a+"+"+b+"="+(a+b));
                break;
            case 2:
                System.out.println(a+"-"+b+"="+(a-b));
                break;
            case 3:
                System.out.println(a+"x"+b+"="+(a*b));
            case 4:
                System.out.println(a+"/"+b+"="+(a/b));
            default:
                System.out.println("Hatalı giriş yaptınız...");
        }
        
        
    }
    
}

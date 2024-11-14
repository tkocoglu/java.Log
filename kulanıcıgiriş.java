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

public class kulanıcıgiriş {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int şifre = 12345;
        
        System.out.print("Sifrenizi giriniz: ");
        
        int sif = input.nextInt();
        
        if(şifre == sif){
            System.out.println("Sifre olumlu");
        }
        else{
            System.out.print("Sifrenizi sifirlayacak misiniz? : (1)evet (2)hayir ");
            }
        
          int cevap = input.nextInt();
            
            if(cevap == 1){
                
                System.out.print("Yeni şifre: ");
                int yeni_sifre = input.nextInt();
                
                if(yeni_sifre == şifre){
                    System.out.println("Yeni şifre eski şifre ile aynı olmamalıdır. ");
                }
                
                else{
                    System.out.println("Sifre oluşturuldu.");
                }
        }
    }
}

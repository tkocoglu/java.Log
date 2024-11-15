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

public class sayiSiralama {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Birinci sayiyi giriniz: ");
        
        int say1 = input.nextInt();
        
        System.out.print("ikinci sayiyi giriniz: ");
        
        int say2 = input.nextInt();
        
        System.out.print("üçüncü sayiyi giriniz: ");
        
        int say3 = input.nextInt();
        
        if(say1 >say2 && say1>say3){
            if(say2>say3){
                System.out.println(say1+">"+say2+">"+say3);
            }
            else{
                System.out.println(say1+">"+say3+">"+say2);
            }
        }else if(say2 >say1 && say2>say3){
            if(say1>say3){
                System.out.println(say2+">"+say1+">"+say3);
            }
            else{
               System.out.println(say2+">"+say3+">"+say1);  
            }
        }else if(say3 >say1 && say3>say2){
            if(say1>say2){
                System.out.println(say3+">"+say1+">"+say2);
            }
            else{
               System.out.println(say3+">"+say2+">"+say1);  
            }
        }
        else{
            System.out.println("hatali giriş yaptiniz... ");
        }
    }
}

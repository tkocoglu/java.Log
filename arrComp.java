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
public class arrComp {
    
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        
        int[] list = {56,34,1,8,101,-2,-33};
        
        System.out.print(" Girilen sayi: ");
        int x= input.nextInt();
        
        int enKucukFark = Integer.MAX_VALUE;
        int enBuyukFark = Integer.MAX_VALUE;
        int enKucukYakin = 0;
        int enBuyukYakin = 0;
        
        for (int i = 0; i< list.length; i++){
            int fark = Math.abs(list[i]-x);
            
            if(fark< enKucukFark){
                enKucukFark = fark;
                enKucukYakin = list[i];
            }
            if(fark <enBuyukFark && list[i]>x){
                enBuyukFark = fark;
                enBuyukYakin = list[i];
            }
        }
        System.out.println("Girilen sayıya en yakın küçük sayı: " + enKucukYakin);
        System.out.println("Girilen sayıya en yakın büyük sayı: " + enBuyukYakin);
    }
    
}

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

public class ebobEko {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("1. Sayiyi giriniz. ");
        
        int n1 = input.nextInt();
        
        System.out.print("2. sayiyi giriniz. ");
        
        int n2 = input.nextInt();
        
        int x = Math.max(n1, n2);
        
        int  i=x;
        int ebob = 1;
        while(i>=1){
            
              
            if(n1%i==0 && n2%i==0){
                ebob = i;
                break;
            }
              i--;
          
        }
        
        int ekok = (n1*n2)/ebob;
        
        System.out.println("Ebob = "+ebob+"\nEkok = "+ekok);
        
    }
    
}

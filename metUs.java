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

public class metUs {
    
    static void üs(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Tabani giriniz : ");
        int tab = input.nextInt();
        
        System.out.print("Ussu giriniz : ");
        int us = input.nextInt();
        
        int result = 1;
        
        for(int i= 1; i<=us; i++){
            result*=tab;
        }
        System.out.println("sonuç: "+result);
        
    }
    public static void main(String[] args) {
        üs();
    }
    
}

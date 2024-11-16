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

public class üssüHesap {
    
    public static void main(String[] args) {
        int üssü=1;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Tabani giriniz: ");
        
        int tab= input.nextInt();
        
        System.out.print("Usu giriniz: ");
        
        int us= input.nextInt();
        
        for(int i=1; i<=us; i++){
            üssü*=tab;
        }
        System.out.println(tab+"^"+us+"="+üssü);
    }
    
}

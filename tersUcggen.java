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

public class tersUcggen {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Basamak sayisini giriniz: ");
        
        int x = input.nextInt();
        
        for(int i= x; i> 0; i--){
            for(int j = 0; j< x-i; j++){
                System.out.print("*");
            }
            for(int k = 2*i-1; k>0; k--){
                System.out.println();
            }
            System.out.print("");
        }
    }
}

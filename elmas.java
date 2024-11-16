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

public class elmas {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Elmasın yüksekliğini giriniz  (tek sayi): ");
        
        int n= input.nextInt();
        
        int yaricap = n/2;
        
        //elmasın üst yarisi
        for(int i=0; i<= yaricap;i++){
           for(int j=0; j<yaricap-i; j++){
               System.out.print(" ");
           } 
           for(int k=0; k<(2*i+1); k++){
               System.out.print("*");
           }
            System.out.println();
        }
        
        //Elmasin alt yarisi
        for(int i = yaricap-1; i>=0; i--){
            for(int j = 0; j< yaricap-i;j++){
                System.out.print(" ");
            }
            for(int k = 0; k< (2*i+1); k++){
                System.out.print("*");
            }
             System.out.println();   
        }
        
       
    }
    
}

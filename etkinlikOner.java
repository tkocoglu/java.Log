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
        
public class etkinlikOner {
  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Hava sicakliği:  ");
        
       double sic = input.nextDouble();
       
       if(sic<5){
           System.out.println("Kayak yapabilirsiniz");
       }
       else if(sic>5 && sic<=25){
           if(sic<=15){
               System.out.println("Piknik yapabilirsiniz...");
           }
           if(sic>10){
               System.out.println("Sinemaya gidebilirssiniz");
           }
       }
       else{
           System.out.println("yüzmeye gidebilirsiniz...");
       }
       
    }
}

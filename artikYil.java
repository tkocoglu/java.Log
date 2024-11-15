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

public class artikYil {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Yil giriniz: ");
        
        int yil = input.nextInt();
        
        if((yil%100 != 0 && yil%4 == 0) || (yil%400 == 0)){
             System.out.println(yil+" bir artik yildir!");
        }
        else{
             System.out.println(yil+" bir artik yil değildir!");
        }
    }
}

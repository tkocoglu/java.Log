/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package computer.c;

/**
 *
 * @author Tayyip Koçoğlu
 */
import java.util.Scanner;

public class taximeter {
    
    public static void main(String[] args) {
        
        double km = 2.2, aç_ucret = 10, tutar, mesafe ,a;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Kac km yol aldiniz: ");
        
        mesafe = input.nextInt();
        
        tutar = km*mesafe + aç_ucret;
       
        a = (tutar < 20 )? 20 : tutar;
        
        System.out.print("Odenecek tutar: " +a);
        
    }
    
}

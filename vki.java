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

public class vki {
    
    public static void main(String[] args) {
        
        double boy ,kilo , vki;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Lütfen boyunuzu metre cinsinden giriniz: ");
        
        boy = input.nextDouble();
        
        System.out.print("Lütfen kilonuzu kg cinsinden giriniz: ");
        
        kilo = input.nextInt();
        
        vki = kilo/(boy*boy);
        
        System.out.print("Vucut kitle indexiniz: "+vki);
    }
}

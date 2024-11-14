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

public class uckenhesama {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("ücgenin birinci kenarını giriniz.: ");
        
        int bir_kenar = input.nextInt();
        
        System.out.println("ücgenin ikinci kenarını giriniz.: ");
        
        int iki_kenar = input.nextInt();
        
        System.out.println("ücgenin üçüncü kenarını giriniz.: ");
        
        int üç_kenar = input.nextInt();
        
        double u = (bir_kenar + iki_kenar + üç_kenar)/2;
        
        double üçgen_çevre = u*2 ;
        
        double alan = Math.sqrt(u*(u-bir_kenar)*(u-iki_kenar)*(u-üç_kenar));
        
        System.out.println("ucgenin çevresi : "+üçgen_çevre+"\nucgein alani : "+alan);
    }
}

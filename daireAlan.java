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

public class daireAlan {
    
    public static void main(String[] args) {
       
        int r, açi;
        
        double pi = 3.14;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Daire diliminin yarıçapı: ");
        
        r = input.nextInt();
        
        System.out.print("Daire diliminin merkez açisi: ");
        
        açi = input.nextInt();
        
       double alan = (pi*(r*r)*açi)/360;
       
        System.out.print("Daire diliminin alai: "+alan);
        
    }
    
}

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

public class kdvTutar {
    
    public static void main(String[] args) {
        
        double tutar, kdvTutar, kdvliTutar;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Tutar giriniz: ");
        
        tutar = input.nextDouble(); 
        
        double kdvOranı = (tutar>0 && tutar<=1000) ? (0.18) : (0.08);
        
        kdvTutar = tutar*kdvOranı;
        
        kdvliTutar = tutar + kdvTutar;
        
        System.out.println("TUTAR: "+tutar+"\nKDV tutari: "+kdvTutar+"\nKDV'li tutar: "+kdvliTutar);
        
    }
}

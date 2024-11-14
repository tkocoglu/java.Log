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

public class manavKasa {
    
    public static void main(String[] args) {
        
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlıcan = 5;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Kaç kg armut: ");
        
        double   ar = input.nextDouble();
        
        double  armut_hesap = ar*armut;
        
        System.out.print("Kaç kg elma: ");
        
        double   el = input.nextDouble();
        
        double elma_hesap = el*elma;
        
        System.out.print("Kaç kg domates: ");
        
        double   dom = input.nextDouble();
        
        double domates_hesap = dom*domates;
        
        System.out.print("Kaç kg muz: ");
        
        double   mu = input.nextDouble();
        
        double muz_hesap = muz*mu;
        
        System.out.print("Kaç kg patlıcan: ");
        
        double   pat = input.nextDouble();
        
        double patlican_hesap = pat*patlıcan;
        
        double total = armut_hesap+elma_hesap+domates_hesap+muz_hesap+patlican_hesap;
        
        System.out.print("Tomlam tutar : "+total);
    }
}

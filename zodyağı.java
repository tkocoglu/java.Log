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

public class zodyağı {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Doğum tarihiniz: ");
        
        int dtarihi = input.nextInt();
        
        int hesap = dtarihi%12;
        
        switch (hesap) {
            case 0:
                System.out.println("----Maymun---");
                break;
            case 1:
                System.out.println("----Horoz---");
                break;
            
            case 2:
                System.out.println("----Köpek---");
                break;
            case 3:
                System.out.println("----Domuz---");
                break;
            case 4:
                System.out.println("----Fare---");
                break;
            case 5:
                System.out.println("----Okuz---");
                break;
            case 6:
                System.out.println("----Kaplan---");
                break;
            case 7:
                System.out.println("----Tavşan---");
                break;
            case 8:
                System.out.println("----Ejderha---");
                break;
            case 9:
                System.out.println("----Yilan---");
                break;
            case 10:
                System.out.println("----At---");
                break;
            case 11:
                System.out.println("----Koyun---");
                break;
            default:
                System.out.println("Hatali giriş yaptiniz...");
        }
    }
}

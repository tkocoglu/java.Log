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

public class komb {
    
    public static void main(String[] args) {
        int çar=1, çar2=1, çar3=1;
        Scanner input = new Scanner(System.in);
        
        System.out.print("n sayisini giriniz: ");
        int n = input.nextInt();
        
        System.out.print("r sayisini giriniz: ");
        int r = input.nextInt();
        
        for(int i=1; i<=n; i++){
            çar*=i;
        }
        for(int j=1; j<=r; j++){
            çar2*=j;
        }
        for(int k=1; k<=(n-r); k++){
            çar3*=k;
        }
        int kom = çar/(çar2*çar3);
        System.out.println("C(n,r)! = "+kom);
    }
}

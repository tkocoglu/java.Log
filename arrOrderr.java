/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaproje;

/**
 *
 * @author Tayyip Koçoğlu
 */
import java.util.Arrays;
import java.util.Scanner;
import java.util.Scanner;
public class arrOrderr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Dizinin boyutu : ");
        
        int n = input.nextInt();
        
        int[] list =  new int[n];
        System.out.println("Dizinin elemanlarını giriniz : ");
        for(int i = 0; i<n ;i++){
            
            System.out.println(i+1+". Elemani : ");
            list[i]= input.nextInt();
            
        }
        
        Arrays.sort(list);
        
        System.out.print("Sıralama: ");
        for(int sayi : list){
            System.out.println(sayi+" ");
        }
    }
    
}

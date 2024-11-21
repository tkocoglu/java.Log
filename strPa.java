/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaproje;

/**
 *
 * @author Tayyip Koçoğlu
 */import java.util.Scanner;

public class strPa {
    public static boolean isPalindrom(String str){
     
        int i = 0;
        int j = str.length()-1;
        
        while(i<j){
            
            
            if(str.charAt(i)!=str.charAt(j))
                return false;
            i++;
            j--;
          
        }
          return true;
        
       
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Bir ifade giriniz: ");
        String a = input.nextLine();
        
        System.out.println( isPalindrom(a));
    }
}

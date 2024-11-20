/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaproje;

/**
 *
 * @author Tayyip Koçoğlu
 */

public class arrAgain {
   
    public static void main(String[] args) {
      int[] dizi = {2, 4, 6, 8, 2, 4, 10, 12, 14, 16, 8, 20, 22, 24, 26, 28, 30, 4, 32, 34}; 
      int n = dizi.length;
      boolean[] kontrol = new boolean[n];
     
        System.out.print("Tekrar edeb çift sayilar : ");
        for(int i=0; i<n; i++){
            if(dizi[i]%2 == 0 && !kontrol[i]){
                boolean tekraretimi=false;
                for(int j=i+1; j<n; j++){
                    if(dizi[i] == dizi[j]){
                        kontrol[j]=true;
                        tekraretimi = true;
                        
                    }
                    
                }
                if(tekraretimi){
                    System.out.print(dizi[i]+" ");
                }
            }
        }
    }
}

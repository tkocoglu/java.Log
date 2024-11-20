/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaproje;

/**
 *
 * @author Tayyip Koçoğlu
 */
public class arrCont {
    public static void main(String[] args) {
        int[] dizi = {10,20,20,10,10,20,5,20};
        boolean[] kontrol = new boolean[dizi.length];
        
        
        for(int i=0; i<dizi.length; i++){
            if(kontrol[i]){
                continue; // eğer bu eleman daha önce kontrol edilmişse onu geç
            }
            int count = 1;
            
            for(int j= i+1; j<dizi.length; j++){
                if(dizi[i] == dizi[j]){
                 count++;    
                 kontrol[j]= true;
                }
             
            }
               
                System.out.println(dizi[i]+" sayisi "+ count+" kere tekrar etti");
                
        }
    }
}

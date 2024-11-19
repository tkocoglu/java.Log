/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaproje;

/**
 *
 * @author Tayyip Koçoğlu
 */
public class arrHar {
    public static void main(String[] args) {
        int[] number = {1,2,3,4,5};
        double sum=0.0;
        
        for(int i = 0; i< number.length; i++){
            sum += 1.0/number[i];
        }
        System.out.println("Harmonik Ortalama: "+number.length/sum);
    }
}

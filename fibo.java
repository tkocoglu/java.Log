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

public class fibo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Fibonacci sayisinin eleman sayisini girin.");
        
        int elsay= input.nextInt();
        
        int num1=0, num2=1, nextnum;
        
        System.out.print(elsay+" Elemanli Fibonacci serisi "+num1+" "+num2+" ");
        
        for(int i=2; i< elsay; i++){
            nextnum = num1+num2;
            System.out.print(nextnum+" ");
            num1 = num2;
            num2 = nextnum;
        }
    }
}

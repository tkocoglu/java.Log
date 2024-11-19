/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaproje;

/**
 *
 * @author Tayyip Koçoğlu
 */
public class tMain {
    public static void main(String[] args) {
        tEmployee emp1 = new tEmployee("Tayyip", 21000, 50, 2010);
        
        emp1.toStringg();
        
        System.out.println("===========================================================");
        
        tEmployee emp2 = new tEmployee("Kemal", 2000, 45, 1985);
        
        emp2.toStringg();
        
    }
}

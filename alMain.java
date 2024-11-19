/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaproje;

/**
 *
 * @author Tayyip Koçoğlu
 */
public class alMain {
    
    public static void main(String[] args) {
        alFighterr marc = new alFighterr("March", 15, 100, 90, 0);
        alFighterr alex = new alFighterr("Alex", 10, 95, 100, 0);
        alRing r = new alRing(marc, alex, 90, 100);
        r.run();
    }
    
}

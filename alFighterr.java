/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaproje;

/**
 *
 * @author Tayyip Koçoğlu
 */
public class alFighterr {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;
    
    public alFighterr(String name ,int damage ,int health, int weight , double dodge ){
        this.name= name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }
    
    public int hit(alFighterr foe){
        System.out.println("-------------------------------");
        System.out.println(this.name +" => " +foe.name+ " "+this.damage+" hasar vurdu");
        
        if(foe.dodge()){
            System.out.println(foe.name+" gelen hasarı bastırdı. ");
            return foe.health;
        }
        
        if(foe.health- this.damage < 0)
            return 0;
        
        return foe.health-this.damage;
    }
    
    
    public boolean dodge() {
        
        double randomValue = Math.random()*100;
        return randomValue<= this.dodge;
    }
    
}

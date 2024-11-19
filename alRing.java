/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaproje;

/**
 *
 * @author Tayyip Koçoğlu
 */
import java.util.Random;
public class alRing {
    
   alFighterr f1;
   alFighterr f2;
   int minWeight;
   int maxWeight;
   
   public alRing(alFighterr f1, alFighterr f2, int minWeight, int maxWeight){
       this.f1 = f1;
       this.f2 = f2;
       this.minWeight = minWeight;
       this.maxWeight = maxWeight;
   }
   
   
   public void run(){
       
       
       if(checkWeight()){
           while(f1.health > 0 && f2.health >0){
               System.out.println("============== Yeni Round =============");
               System.out.println("Raunta ilk başlayan : "+fiftyfif().name);
                fiftyfif().health = f1.hit(fiftyfif());
                   if (isWin()){
                    break;
                }
                System.out.println("Raunta ikinci başlayan : "+fiftyfif().name);   
                fiftyfif().health = f2.hit(fiftyfif());
                if (isWin()){
                    break;
                }
                printScore();
            
           }
       }
   }
   
   public boolean checkWeight() {
       return ( f1.weight >= minWeight && f1.weight <=maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
   }
   
   public boolean isWin() {
      if(f1.health == 0){
          System.out.println("Maçi Kazanan : "+f2.name);
          return true;
      } else if(f2.health == 0){
          System.out.println("Maçi Kazanan : "+f1.name);
          return true;
      }
       
       
       return false;
   }
   
   
   
   public void printScore(){
       System.out.println("------------------------");
       System.out.println(f1.name+" Kalan Can \t:"+f1.health);
       System.out.println(f2.name+" Kalan Can \t:"+f2.health);
   }
   
   public alFighterr fiftyfif(){
       Random random = new Random();
       int baslayan = random.nextInt(2);
       
       if(baslayan == 0){
           return this.f1;
       }else{
           return this.f2;
       }
       
   }
  
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaproje;

/**
 *
 * @author Tayyip Koçoğlu
 */
public class tEmployee {
    String name;
    int salary;
    int workHours;
    int hireYear;
   

    public tEmployee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    
    public double tax(){
      if(this.salary>=1000){
         return this.salary*0.03;
        }
        else{
         return 0;
        }
    }
    
    public int bonus(){
        if(this.workHours>40){
            return (this.workHours-40)*30;
        }else{
            return 0;
        }
    }
    
    public double raiseSalary(){
        
        if(2021-this.hireYear<10){
            return salary*0.05;
        }
        else if(2021-this.hireYear>9 && 2021-this.hireYear<20){
            return salary*0.1;
        }
        else if(2021-this.hireYear>19){
            return salary*0.15;
        }
        return 0;
    }
    
    public void toStringg(){
        System.out.println("Adi: "+this.name);
        System.out.println("Maaşi: "+this.salary);
        System.out.println("Calişma saati: "+this.workHours);
        System.out.println("Başlangiç yili: "+this.hireYear);
        System.out.println("Vergi tutari: "+tax());
        System.out.println("Mesai tutari: "+bonus());
        System.out.println("Zam tutari:"+raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş tutari: "+(this.salary-tax()+bonus()));
        System.out.println("Toplam maaş: "+(this.salary-tax()+bonus()+raiseSalary()));
    }
    
    
    
    
}

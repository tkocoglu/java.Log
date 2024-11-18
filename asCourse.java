/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaproje;

/**
 *
 * @author Tayyip Koçoğlu
 */
public class asCourse {
    asTeacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int quiz;
    
    public asCourse(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.quiz = 0;
    }
    
    public void addTeacher(asTeacher t){
        if(this.prefix.equals(t.branch)){
            this.courseTeacher = t;
            System.out.println("Işlem başarili..");
        }else{
            System.out.println(t.name+" Akademisyeni bu dersi veremez");
        }
    }
    
    public void printTeacher(){
        if(courseTeacher != null){
            System.out.println(this.name+" dersinin akademisyeni : "+courseTeacher.name);
        }else{
             System.out.println(this.name+" dersine akademisyen atanmamiştir... : ");
        }
    }
    
}

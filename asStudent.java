/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaproje;

/**
 *
 * @author Tayyip Koçoğlu
 */
public class asStudent {
    String name, stuNo;
    int classes;
    asCourse mat;
    asCourse fizik;
    asCourse kimya;
    double avarage;
    boolean isPass;
    
    
    asStudent(String name, int classes, String stuNo, asCourse mat,asCourse fizik, asCourse kimya){
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }
    
    public void addBulkExamNote(int mat, int fizik, int kimya){
        if(mat>= 0 && mat<= 100){
            this.mat.note = mat;
        }
        
        if(fizik>= 0 && fizik<= 100){
            this.fizik.note = fizik;
        }
        
        if(kimya>= 0 && kimya<= 100){
            this.kimya.note = kimya;
        }
    }
    
        public void addBulkExamQuiz(int mat, int fizik, int kimya){
        if(mat>= 0 && mat<= 100){
            this.mat.quiz = mat;
        }
        
        if(fizik>= 0 && fizik<= 100){
            this.fizik.quiz = fizik;
        }
        
        if(kimya>= 0 && kimya<= 100){
            this.kimya.quiz = kimya;
        }
    }
    
    public void isPass(){
        if(this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0){
            System.out.println("Notlar tam olarak girilmemiş...");
        }else{
            this.isPass = isCheckPass();
            
            printNote();
            System.out.println("Ortalama : "+this.avarage);
            
            if(this.isPass){
                System.out.println("Sinifi geçti");
            }
            else{
                System.out.println("Sinifta kaldi..");
            }
        }
       
    }
    public void calcAvarage(){
            this.avarage = ((this.fizik.note*0.8+this.fizik.quiz*0.2)+ (this.kimya.note*0.8+this.fizik.quiz*0.2)+ (this.mat.note*0.8+this.fizik.quiz*0.2))/3.0;
        }
    
    public boolean isCheckPass(){
        calcAvarage();
        return this.avarage > 55;
    }
    
    
    public void printNote(){
        System.out.println("=====================================");
        System.out.println("Ogrenci : "+this.name);
        System.out.println("Matematik notu : "+this.mat.note+" Matamatik quizi : "+this.mat.quiz);
        System.out.println("Fizik notu : "+this.fizik.note+" Fizik quizi : "+this.fizik.quiz);
        System.out.println("Kimya notu : "+this.kimya.note+" Kimya quizi : "+this.kimya.quiz);
    }
}



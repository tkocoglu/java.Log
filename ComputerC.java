/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package computer.c;

/**
 *
 * @author Tayyip Koçoğlu
 */
import java.util.Scanner;
public class ComputerC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);
          System.out.println("Birinci notu giriniz: ");
      int  ilkno = input.nextInt();
      
          System.out.println("İkinci notu giriniz: ");
      int  ikincino = input.nextInt();
      
          System.out.println("Üçüncü notu giriniz: ");
      int  üçüncüno = input.nextInt();
      
      
      int ort = (ilkno+ikincino+üçüncüno)/3;
      
      
     String isno = (ort>60)? "sinifi geçti " : "sinifta kaldi ";
     
        System.out.println("başari durumunuz: "+isno +" ortalamaniz: "+ort);
      
            }
    
}

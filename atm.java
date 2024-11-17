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

public class atm {
    public static void main(String[] args) {
        
        String userName = null, password = null;
        Scanner input = new Scanner(System.in);
        
        int right = 3;
        int balance = 1500;
        int select;
        int price;
        while(right> 0){
            System.out.print("Kulanıcı adınız : ");
            userName = input.nextLine();
            
            System.out.print("Parolanız : ");
            password = input.nextLine();
        
        
        if(userName.equals("tayyip") && password.equals("1905gs")){
            System.out.println("Merhaba TK bankasina hoşgeldiniz.");
            do{
                System.out.println("1-Parayatirma\n2-Para çekme\n3-Bakiye sorgulama\nCikiş yap");
                System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                select = input.nextInt();
                switch (select) {
                    case 1:
                        System.out.print("Para miktari : ");
                        price = input.nextInt();
                        balance+= price;
                        break;
                    case 2:
                        System.out.print("Para miktari : ");
                        price = input.nextInt();
                        if(price>balance){
                            System.out.println("Bakiye yetersiz.");
                        }else {
                            balance-=price;
                        }
                        break;
                    case 3:
                        System.out.println("Bakiyeniz : "+balance);
                        break;
                    case 4:
                        System.out.println("Tekrar görüşmek üzere ");
                        break;
                    default:
                        System.out.println("Geçersiz bir işlem seçtiniz. Lütfen tekrar deneyin. ");
                        break;
                     
                }
            }while(select !=4);
            
            break;
        }
        else{
            right--;
            System.out.println("Hatali kullanici adi veya şifre ");
            if(right == 0){
                System.out.println("Hesabiniz bloke olmuştur Lütfen bankaniza başvurunuz...");
            }else {
                System.out.println("Kalan Hakiniz : "+right);
            }
        }
        }
    }
    
}

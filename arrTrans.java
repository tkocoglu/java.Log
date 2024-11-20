/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaproje;

/**
 *
 * @author Tayyip Koçoğlu
 */
public class arrTrans {
    public static void main(String[] args) {
        int[][] matris = {{2,3,4},{5,6,4}};
        
        int satir = 2;
        int sutun = 3;
        
        int[][] transpoz = new int[sutun][satir];
        for(int i = 0; i< satir; i++){
            for(int j = 0; j< sutun; j++){
                transpoz[j][i] = matris[i][j];
            }
            
        }
        
        System.out.println("Transpoz matrisi: ");
        for(int i = 0; i<sutun; i++){
            for(int j =0; j<satir; j++){
                System.out.print(transpoz[i][j]+" ");
            }
            System.out.println();
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bfdc;
import java.util.Scanner;
/**
 *
 * @author ROG STRIX
 */
public class bfdc {
    public int nilaiArray;
    public static void main(String[] args) {
        bfdc[] ppArray = new bfdc[5];
        ppArray[0] = new bfdc();
        Scanner sc = new Scanner(System.in);
        
        for(int i=0;i<5;i++){
            ppArray[i] = new bfdc();
            System.out.println("Nilai Array Indeks ke-"+i);
            System.out.println("Masukkan nilai : ");
            ppArray[i].nilaiArray = sc.nextInt();
        }
        int min=ppArray[0].nilaiArray;
        int max=ppArray[0].nilaiArray;
        for(int i = 0; i<5;i++){
            if (ppArray[i].nilaiArray<min){
                min=ppArray[i].nilaiArray;
            }
            else if (ppArray[i].nilaiArray>max)
                max=ppArray[i].nilaiArray;
        }
        System.out.println("Brute Force");
        System.out.println("Nilai Minimal : " + min);
        System.out.println("Nilai Maksimal : " + max);
    }
}

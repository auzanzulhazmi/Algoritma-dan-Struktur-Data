/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bfdc;

import static bfdc.minMax.max_min;
import java.util.Scanner;

/**
 *
 * @author ROG STRIX
 */
public class MainminMax {
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
                int arr[] = new int[5];
        for (int i = 0; i<5; i++){
            arr[i] = ppArray[i].nilaiArray;
        }
        Maxmin hasil = new Maxmin();
        max_min(arr, 0, 4, hasil);
        System.out.println("Divide Conquer");
        System.out.println("Nilai Minimal : " + hasil.minimum + "\nNilai Maksimal : " + hasil.maximum);
        System.out.println("\n");
        
    }
}
/**
 * Notasi Big O
 * O(1 + 1 + 1 + n x 1 x 1 x 1 x 1 + 1 + 1 +
 * n x (1 + 1) x (1 + 1) + 1 + 1 + 1)
 * O(3 + n + 2 + 4n + 3)
 * O(8 + 5n)
 * O(5n)
 * O(n)
 */
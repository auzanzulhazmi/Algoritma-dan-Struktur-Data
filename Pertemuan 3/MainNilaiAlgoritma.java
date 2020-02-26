/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;
import java.util.Scanner;
/**
 *
 * @author ROG STRIX
 */
public class MainNilaiAlgoritma {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("====================================");
        System.out.println("Program Menghitung Nilai Mahasiswa");
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int jumlah = sc.nextInt();
        
        NilaiAlgoritma[] nm = new NilaiAlgoritma[jumlah];
        for(int i = 0; i<jumlah; i++){
            sc.nextLine();
            nm[i] = new NilaiAlgoritma();
            System.out.println("Mahasiswa Ke-" + (i+1) +" : ");
            nm[i].namaMhs = sc.nextLine();
            System.out.println("Masukkann Nilai Tugas\t: ");
            nm[i].nilaiTugas = sc.nextInt();
            System.out.println("Masukkann Nilai Kuis\t: ");
            nm[i].nilaiKuis = sc.nextInt();
            System.out.println("Masukkann Nilai UTS\t: ");
            nm[i].nilaiUTS = sc.nextInt();
            System.out.println("Masukkann Nilai UAS\t: ");
            nm[i].nilaiUAS = sc.nextInt();
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("========================================");
        System.out.println("Total Nilai Mahasiswa");
        System.out.println("========================================");
        
        for(int i=0; i<jumlah; i++){
            System.out.println("Mahasiswa Ke-" + (i+1) +" : " + nm[i].namaMhs);
            System.out.println("Nilai Tugas\t: " + nm[i].nilaiTugas + ", Nilai Kuis\t: " + nm[i].nilaiKuis);
            System.out.println("Nilai UTS\t: " + nm[i].nilaiUTS + ",Nilai UAS\t\t: " + nm[i].nilaiUAS);
            System.out.println("Total Nilai Mahasiswa : " + nm[i].hitungTotalNilai(nm[i].nilaiTugas, nm[i].nilaiKuis, nm[i].nilaiUAS, nm[i].nilaiUTS));
        }
        System.out.println("====================================================");
        System.out.println("");
        
        for(int i=0; i<jumlah; i++){
            System.out.println("Nilai total seluruh mahasiswa : " + nm[i].hitungTotalNilai(nm[i].nilaiTugas, nm[i].nilaiKuis, nm[i].nilaiUTS, nm[i].nilaiUAS)/4);
        }
        System.out.println();
        double rata=0;
        for(int j=0; j<jumlah;j++){
            rata+=nm[j].hitungTotalNilai(nm[j].nilaiTugas, nm[j].nilaiKuis, nm[j].nilaiUTS, nm[j].nilaiUAS)/jumlah;
        }    
        System.out.println("Rata-rata nilai mahasiswa adalah "+rata);
    }
}

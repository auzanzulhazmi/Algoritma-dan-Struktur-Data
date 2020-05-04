/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_3;
import java.util.Scanner;
/**
 *
 * @author ROG STRIX
 */
public class Main_DaftarMahasiswa {
    public static void main(String[] args) {
        Daftar_Mahasiswa data = new Daftar_Mahasiswa();
        Scanner sc = new Scanner(System.in);
        String nama;
        int nilai;
        for(int i = 0; i < 5; i++){
            System.out.print("Masukkan nama Mahasiswa\t\t: ");
            nama = sc.nextLine();
            System.out.print("Masukkan nilai Mahasiswa\t: ");
            nilai = sc.nextInt();
            sc.nextLine();
            data.addLast(nama, nilai);
            System.out.println("");
        }
        data.print();
        data.SelectionSort();
        data.print();
    }
}

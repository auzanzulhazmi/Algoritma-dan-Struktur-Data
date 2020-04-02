/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strukturdata_9_uts;

import java.util.Scanner;

/**
 *
 * @author ROG STRIX
 */
public class MainBuku {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Scanner sc1 = new Scanner (System.in);
        int jumBuku = 4;
        DaftarBuku data = new DaftarBuku();
        
        
        for(int i=0; i<jumBuku; i++){
            System.out.print("Judul : ");
            String judul = sc1.nextLine();
            System.out.print("Jumlah Halaman : ");
            int jum = sc.nextInt();
            System.out.print("Tinggi Buku : ");
            double tinggi = sc.nextDouble();
            System.out.println();
            
            Buku b = new Buku(judul, jum, tinggi);
            data.tambah(b);
        }
        System.out.println("Data Mahasiswa sebelum Sorting");
        data.tampil();
        System.out.println();
        
        System.out.println("Data Mahasiswa setelah sorting");
        data.selectionSort();
        data.tampil();
    }
}

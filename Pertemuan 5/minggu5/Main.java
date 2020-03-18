/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu5;
import java.util.Scanner;
/**
 *
 * @author ROG STRIX
 */
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        DaftarMahasiswaBerprestasi data = new DaftarMahasiswaBerprestasi();
        int jumMhs = 3;
        for(int i=0; i<jumMhs;i++){
            System.out.print("Nama = ");
            String nama = s1.nextLine();
            System.out.print("Thn Masuk = ");
            int thn = s.nextInt();
            System.out.print("Umur = ");
            int umur = s.nextInt();
            System.out.print("IPK = ");
            double ipk = s.nextDouble();
            
            Mahasiswa m = new Mahasiswa(nama,thn,umur,ipk);
            data.tambah(m);
        }
        System.out.println("Data mahasiswa sebelum sorting = ");
        data.tampil();
        System.out.println("Data mahasiswa setelah sorting desc berdasar ipk = ");
        data.bubbleSort();
        data.tampil();
        
        System.out.println("Data Mahasiswa setelah sorting asc berdasar ipk = ");
        data.selectionSort();
        data.tampil();
        
        System.out.println("Data Setelah di Insertion Sort = ");
        data.insertionSort();
        data.tampil();
    }
}

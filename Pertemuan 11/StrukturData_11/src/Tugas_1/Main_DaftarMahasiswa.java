/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_1;
import java.util.Scanner;
/**
 *
 * @author ROG STRIX
 */
public class Main_DaftarMahasiswa {
    public static void main(String[] args) {
        Daftar_Mahasiswa data = new Daftar_Mahasiswa();
        Scanner sc = new Scanner(System.in);
        try {
            data.addFirst(1941720055, "Maul", "Bogor");
            data.print();
            data.add(1941720057, "Riki", "Malang", 1);
            data.print();
            data.addFirst(1941720054, "Pramudya Wibowo", "Jl. Merapi No. 26");
            data.print();
            data.addByValue(1941720055, 1941720056, "ABCD123", "ABC123");
            data.print();
            data.removeByValue(1941720056);
            data.print();
            data.clear();
            int pilih = 0, pilih1, index, nim;
            String nama, alamat;
            do {
                try {
                    System.out.println("Menu");
                    System.out.println("1. Tambah");
                    System.out.println("2. Hapus");
                    System.out.println("3. Cari");
                    System.out.println("4. Keluar");
                    System.out.print("Masukkan pilihan : ");
                    pilih = sc.nextInt();
                    switch (pilih) {
                        case 1:
                            System.out.println("\nSubmenu Tambah");
                            System.out.println("1. Tambah (First)");
                            System.out.println("2. Tambah (Index)");
                            System.out.println("3. Tambah (Last)");
                            System.out.print("Masukkan pilihan : ");
                            pilih1 = sc.nextInt();
                            switch (pilih1) {
                                case 1:
                                    System.out.println("\nTambah (First)");
                                    System.out.print("Masukkan NIM\t: ");
                                    nim = sc.nextInt();
                                    sc.nextLine();
                                    System.out.print("Masukkan Nama\t: ");
                                    nama = sc.nextLine();
                                    System.out.print("Masukkan Alamat\t: ");
                                    alamat = sc.nextLine();
                                    data.addFirst(nim, nama, alamat);
                                    break;
                                case 2:
                                    System.out.println("\nTambah (Index)");
                                    System.out.print("Masukkan NIM\t: ");
                                    nim = sc.nextInt();
                                    sc.nextLine();
                                    System.out.print("Masukkan Nama\t: ");
                                    nama = sc.nextLine();
                                    System.out.print("Masukkan Alamat\t: ");
                                    alamat = sc.nextLine();
                                    data.addFirst(nim, nama, alamat);
                                    System.out.print("Masukkan index\t: ");
                                    index = sc.nextInt();
                                    data.add(nim, nama, alamat, index);
                                    break;
                                case 3:
                                    System.out.print("Masukkan NIM\t: ");
                                    nim = sc.nextInt();
                                    sc.nextLine();
                                    System.out.print("Masukkan Nama\t: ");
                                    nama = sc.nextLine();
                                    System.out.print("Masukkan Alamat\t: ");
                                    alamat = sc.nextLine();
                                    data.addLast(nim, nama, alamat);
                                    break;
                            }
                            data.print();
                            break;
                        case 2:
                            System.out.println("\nSubmenu Hapus");
                            System.out.println("1. Hapus (Index)");
                            System.out.println("2. Hapus (Key)");
                            System.out.println("3. Clear");
                            System.out.print("Masukkan pilihan : ");
                            pilih1 = sc.nextInt();
                            switch (pilih1) {
                                case 1:
                                    System.out.println("\nHapus (Index)");
                                    System.out.print("Masukkan Index : ");
                                    index = sc.nextInt();
                                    data.remove(index);
                                    break;
                                case 2:
                                    System.out.println("\nHapus (Key)");
                                    System.out.print("Masukkan NIM : ");
                                    nim = sc.nextInt();
                                    data.removeByValue(nim);
                                    break;
                                case 3:
                                    data.clear();
                                    break;
                            }
                            data.print();
                            break;
                        case 3:
                            System.out.println("\nSubmenu Cari");
                            System.out.println("1. Cari (Index)");
                            System.out.println("2. Cari (Key)");
                            System.out.print("Masukkan pilihan : ");
                            pilih1 = sc.nextInt();
                            switch (pilih1) {
                                case 1:
                                    System.out.println("\nCari (Index)");
                                    System.out.print("Masukkan Index : ");
                                    index = sc.nextInt();
                                    data.cari(index);
                                    break;
                                case 2:
                                    System.out.println("\nCari (Key)");
                                    System.out.print("Masukkan NIM : ");
                                    nim = sc.nextInt();
                                    data.cariKey(nim);
                                    break;
                            }
                            break;
                        case 4:
                            System.out.println("\nKeluar Program");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Pilihan Salah!");
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                System.out.println();
            } while (pilih != 4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

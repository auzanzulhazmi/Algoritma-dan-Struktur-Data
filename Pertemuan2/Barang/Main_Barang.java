/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Barang;

import java.util.Scanner;

/**
 *
 * @author ROG STRIX
 */
public class Main_Barang {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Barang item = new Barang();

		System.out.print("Masukkan Nama anda : ");
		item.nama = input.nextLine();
		System.out.print("Harga Barang : Rp. ");
		item.hargaSatuan = input.nextInt();
		System.out.print("jumlah barang : ");
		item.jumlah = input.nextInt();

		System.out.println("Nama\t\t\t = " + item.nama);
		System.out.println("Harga Satuan Barang\t = " + item.hargaSatuan);
		System.out.println("Harga Total \t\t = " + item.HargaBayar());


	}
}
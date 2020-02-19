/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JajarGenjang_2;

import java.util.Scanner;

/**
 *
 * @author ROG STRIX
 */
public class Main_JajarGenjang {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		JajarGenjang jg = new JajarGenjang();

		JajarGenjang[] jajar = new JajarGenjang[5];

		for (int i = 0 ; i < jajar.length ; i++) {
			jajar[i] = new JajarGenjang();

			System.out.println("JajarGenjang ke-" + (i+1));
			System.out.print("Masukkan panjang alas ke-" + (i+1) + " : ");
			jajar[i].panjang = input.nextInt();
			System.out.print("Masukkan tinggi ke-" + (i+1) + " : ");
			jajar[i].tinggi = input.nextInt();
			System.out.print("Masukkan panjang Sisi Miring ke-" + (i+1) + " : ");
			jajar[i].sisiMiring = input.nextInt();

			System.out.println("\n");

		}

		for (int i = 0; i < jajar.length ; i++) {
			System.out.println("\nJajarGenjang ke-" + (i+1));
			System.out.println("Luas = " + jg.hitungLuas(jajar[i].panjang , jajar[i].tinggi));
			System.out.println("Keliling = " + jg.hitungKeliling(jajar[i].panjang , jajar[i].sisiMiring));
		}


	}
}

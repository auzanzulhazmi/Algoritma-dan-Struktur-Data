/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diagram_2;

import java.util.Scanner;

/**
 *
 * @author ROG STRIX
 */
public class Main_Diagram {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("Persewaan Video Game ");
		Diagram dg = new Diagram();
		Diagram[] rental = new Diagram[2];
		rental[0] = new Diagram();
		rental[0].id =  1450;
		rental[0].game = "Grand Theft Auto V";
		rental[0].harga = 30000;

		rental[1] = new Diagram();
		rental[1].id = 1451;
		rental[1].game = "Battlefield";
		rental[1].harga = 25000;

		System.out.print("Masukkan nama anda : ");
		dg.nama = input.nextLine();
		System.out.println("Game");
		for (int i = 0; i < rental.length ; i++) {
			System.out.println((i+1) + ".) " + rental[i].game );
		}
		System.out.print("Masukkan pilihan : ");
		dg.select = input.nextInt();
		if (dg.select > 0 && dg.select <= (rental.length)) {
			
			System.out.print("Sewa berapa hari : ");
			dg.hari = input.nextInt();
			System.out.println("\nData : ");
			System.out.println("id\t\t = " + rental[(dg.select-1)].id);
			System.out.println("Nama\t\t = " + dg.nama);
			System.out.println("Game\t\t = " + rental[(dg.select-1)].game);
			System.out.println("Lama Pinjam\t = " + dg.hari + " Hari ");
			System.out.println("Harga\t\t = " + (rental[(dg.select-1)].harga * dg.hari));
		}else{
			System.exit(0);
		}



	}
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LuasTanah;

import java.util.Scanner;

/**
 *
 * @author ROG STRIX
 */
public class LuasTanah {
    public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		Luas ls = new Luas();

		System.out.print("Masukkan jumlah tanah : ");
		ls.jumlah = input.nextInt();
		
		Luas[] tanah = new Luas[ls.jumlah];

		for (int i = 0; i < tanah.length ; i++) {
			tanah[i] = new Luas();

			System.out.print("\nMasukkan panjang Tanah ke-" + (i+1) + " : ");
			tanah[i].panjang = input.nextInt();
			System.out.print("Masukkan lebar Tanah ke-" + (i+1) + " : ");
			tanah[i].lebar = input.nextInt();

		}

		System.out.println();

		for (int i = 0; i < tanah.length ; i++) {
			System.out.println("Luas Tanah ke-" + (i+1) + " : " + ls.luasTanah(tanah[i].panjang , tanah[i].lebar));
		}



	}
}

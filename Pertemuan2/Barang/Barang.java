package Barang;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ROG STRIX
 */
public class Barang {
    static String nama;
	static int hargaSatuan;
	static int jumlah;
	static int diskon;

	public static int HargaTotal(){
		return hargaSatuan * jumlah;
	}

	public static int hitungDiskon(){
		if (HargaTotal() > 100000) {
			return (HargaTotal() * 10)/100;	
		}else if (HargaTotal() < 50000) {
			return 0;
		}else{
			return (HargaTotal() * 5)/100;
		}
	}

	public static int HargaBayar(){
		return HargaTotal() - hitungDiskon();
	}

}

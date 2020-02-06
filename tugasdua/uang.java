/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasdua;
/**
 *
 * @author ROG STRIX
 */
public class uang {
    public static void main(String[] args){
        int bulan = 0;
        double uang = 1000000, bunga = 0.02;
        System.out.printf("Saldo tabungan Anda Sekarang : Rp %,.2f" ,uang);
        for(bulan = 0; uang<1500000; bulan++){
            uang += uang * bunga;
        }
        System.out.println("");
        System.out.printf("Dalam Waktu  \t: %d Bulan\nUang Anda \t: Rp %,.2f\n" ,bulan, uang);
    }
}

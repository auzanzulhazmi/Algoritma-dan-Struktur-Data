/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author ROG STRIX
 */
public class Cari2d {
    public int[][] data;
    public int jmlBaris, jmlKolom;

    public Cari2d(int[][] Data, int baris, int kolom) {
        this.jmlBaris = baris;
        this.jmlKolom = kolom;
        data = new int[baris][kolom];
        for (int i = 0; i < jmlBaris; i++) {
            for (int j = 0; j < jmlKolom; j++) {
                data[i][j] = Data[i][j];
            }
        }
    }

    public int[] FindSeqSearch(int cari) {
        int[] posisi = new int[2];
        posisi[0] = -1;
        posisi[1] = -1;
        for (int i = 0; i < jmlBaris; i++) {
            for (int j = 0; j < jmlKolom; j++) {
                if (data[i][j] == cari) {
                    posisi[0] = i;
                    posisi[1] = j;
                    break;
                }
            }
        }
        return posisi;
    }
    
    public void TampilData() {
        for (int i = 0; i < jmlBaris; i++) {
            for (int j = 0; j < jmlKolom; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    public void Tampilposisi(int x, int[] pos)
    {
        if (pos[0] != -1 && pos[1] != -1) {
            System.out.println("data : " + x + " ditemukan pada indeks (" + pos[0] + "," + pos[1] + ")");
        }
        else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strukturdata_9_uts;

/**
 *
 * @author ROG STRIX
 */
public class Buku {
    String judul;
    int jumHal;
    double tinggiBuku;
    
    Buku (String j, int jum, double tg){
        judul = j;
        jumHal = jum;
        tinggiBuku = tg;
    }
    void tampil(){
        System.out.println("judul : "+judul);
        System.out.println("Jumlah Halaman : "+jumHal);
        System.out.println("Tinggi Buku : "+tinggiBuku);
}
}

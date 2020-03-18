/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TiketPesawat;

/**
 *
 * @author ROG STRIX
 */
public class TiketPesawat {
    public String namaMaskapai;
    public float harga;
    public int transitCount;
    public int flightTime;
    
    public TiketPesawat(String nm, float hr, int tc, int ft){
        namaMaskapai = nm;
        harga = hr;
        transitCount = tc;
        flightTime = ft;
    }
    
    public void tampil(){
        System.out.println("Nama Maskapai\t\t= " + namaMaskapai);
        System.out.println("Harga Tiket\t\t= Rp. " + harga);
        System.out.println("Transit Penerbangan\t= " + transitCount);
        System.out.println("Jam Penerbangan\t\t= " + flightTime);
    }
}

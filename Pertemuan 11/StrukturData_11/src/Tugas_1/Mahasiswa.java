/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_1;

/**
 *
 * @author ROG STRIX
 */
public class Mahasiswa<T> {
    T nim, nama, alamat;
    Mahasiswa<T> next;

    public Mahasiswa(T nim, T nama, T alamat, Mahasiswa<T> next) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.next = next;
    }
}

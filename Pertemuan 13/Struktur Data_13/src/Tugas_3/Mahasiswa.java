/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_3;

/**
 *
 * @author ROG STRIX
 */
public class Mahasiswa<T> {
    T nama, nilai;
    Mahasiswa<T> next, prev;

    public Mahasiswa(Mahasiswa<T> prev, T nama, T nilai, Mahasiswa<T> next) {
        this.prev = prev;
        this.nama = nama;
        this.nilai = nilai;
        this.next = next;
    }
}

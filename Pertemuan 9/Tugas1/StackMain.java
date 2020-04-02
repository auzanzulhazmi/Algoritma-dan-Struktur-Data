/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author ROG STRIX
 */
public class StackMain {
    public static void main(String[] args) {
        Stack tumpukan = new Stack(4);
        
        System.out.println("Modifikasi Praktikum 1 mengubah data angka menjadi teks");
        System.out.println("=========================================================");
        tumpukan.push("Buku tulis");
        tumpukan.push("Novel");
        tumpukan.push("Majalah");
        tumpukan.push("Buku pelajaran");
        
        tumpukan.print();
        System.out.println("=========================================================");
        
        tumpukan.pop();
        tumpukan.peek();
        tumpukan.print();
        System.out.println("=========================================================");
    }
}

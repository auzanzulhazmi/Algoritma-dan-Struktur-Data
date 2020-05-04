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
public class Daftar_Mahasiswa {
    Mahasiswa head;
    int size;

    public DaftarMahasiswa() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(String nama, int nilai) {
        if (isEmpty()) {
            head = new Mahasiswa(null, nama, nilai, null);
        } else {
            Mahasiswa newNode = new Mahasiswa(null, nama, nilai, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(String nama, int nilai) {
        if (isEmpty()) {
            addFirst(nama, nilai);
        } else {
            Mahasiswa current = head;
            while (current.next != null) {
                current = current.next;
            }
            Mahasiswa newNode = new Mahasiswa(current, nama, nilai, null);
            current.next = newNode;
            size++;
        }
    }

    public void print() {
        if (!isEmpty()) {
            Mahasiswa tmp = head;
            System.out.println("Nama\tNilai");
            while (tmp != null) {
                System.out.println(tmp.nama + "\t" + tmp.nilai);
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked Lists Kosong!");
        }
    }

    public void SelectionSort() {
        Object temp;
        if (isEmpty()) {
            System.out.println("Linked List Kosong");
        } else {
            for (Mahasiswa current = head; current.next != null; current = current.next) {
                for (Mahasiswa afterCurrent = current.next; afterCurrent != null; afterCurrent = afterCurrent.next) {
                    if ((int) current.nilai > (int) afterCurrent.nilai) {
                        temp = current.nilai;
                        current.nilai = afterCurrent.nilai;
                        afterCurrent.nilai = temp;
                    }
                }
            }
        }
    }
}

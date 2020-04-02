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
public class Stack {
    int size;
    int top;
    String data[];
    
    public Stack(int size) {
        this.size = size;
        data = new String[size];
        top = -1;
    }
    
    public boolean IsEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean IsFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }
    
    public void push(String dt) {
        if (!IsFull()) {
            top++;
            data[top] = dt;
        } else {
            System.out.println("Isi stack penuh");
        }
    }
    
    public void pop() {
        if (!IsEmpty()) {
            String x = data[top];
            top--;
            System.out.println("Data yang keluar: " + x);
        }
    }
    
    public void peek() {
        System.out.println("Elemen teratas: " + data[top]);
    }
    
    public void print() {
        System.out.println("Isi stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i] + " ");
        }
    }
    
    public void clear() {
        if (!IsEmpty()) {
            for (int i = top; i >= 0; i--) {
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        } else {
            System.out.println("Gagal! Stack masih kosong");
        }
    }
}

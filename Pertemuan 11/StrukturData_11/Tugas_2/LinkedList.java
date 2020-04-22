/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_2;
/**
 *
 * @author ROG STRIX
 */
public class LinkedList<T> {
    int size;
    Node top;

    public LinkedList() {
        top = null;
        size = 0;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int getSize() {
        return size;
    }

    void push(int data) {
        Node list = new Node(data, null);
        if (top == null) {
            top = list;
        } else {
            list.setNext(top);
            top = list;
        }
        size++;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            System.out.println("Data Kosong!");
        }
        Node tg = top;
        top = tg.getNext();
        return tg.data;
    }

    public int head() throws Exception {
        if (isEmpty()) {
            System.out.println("Data Kosong!");
        }
        return top.data;
    }

    void print() {
        System.out.print("Stack : ");
        if (size == 0) {
            System.out.println("Data Kosong!");
            return;
        }
        Node tugas = top;
        while (tugas != null) {
            System.out.print(tugas.data + " ");
            tugas = tugas.getNext();
        }
        System.out.println();
    }
}
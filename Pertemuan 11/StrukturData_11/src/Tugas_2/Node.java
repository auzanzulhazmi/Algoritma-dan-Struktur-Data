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
public class Node {
    int data;
    Node lanjut;

    public Node(int data, Node lanjut) {
        this.data = data;
        this.lanjut = lanjut;
    }

    public Node() {
        lanjut = null;
        data = 0;
    }

    public void setNext(Node n) {
        lanjut = n;
    }

    public Node getNext() {
        return lanjut;
    }
}

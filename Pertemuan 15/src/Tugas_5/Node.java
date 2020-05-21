/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_5;

/**
 *
 * @author ROG STRIX
 */
public class Node {
    int data;
    int weight;
    Node prev;
    Node next;
    
    Node(Node prev, int data, int weight, Node next) {
        this.prev = prev;
        this.data = data;
        this.weight = weight;
        this.next = next;
    }
}

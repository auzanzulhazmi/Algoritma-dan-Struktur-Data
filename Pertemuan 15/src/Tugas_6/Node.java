/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_6;

/**
 *
 * @author ROG STRIX
 */
public class Node<T> {
    T data;
    Node<T> prev;
    Node<T> next;
    
    Node(Node<T> prev, T data, Node<T> next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1_2_3_4;

/**
 *
 * @author ROG STRIX
 */
public class Node {
    int data;
    Node left;
    Node right;
    
    public Node() {
    }
    public Node(int data) {
        this.left = null;
        this.data = data;
        this.right = null;
    }
}

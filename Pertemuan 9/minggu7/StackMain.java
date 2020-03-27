/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu7;

import minggu8.Stack;

/**
 *
 * @author ROG STRIX
 */
public class StackMain {
    public static void main(String[] args) {
        
    Stack tumpukan = new Stack(4);
    tumpukan.push(15);
    tumpukan.push(31);
    tumpukan.push(9);
    tumpukan.push(12);
    tumpukan.print();
    
    tumpukan.pop();
    tumpukan.peek();
    tumpukan.print();
    }
}

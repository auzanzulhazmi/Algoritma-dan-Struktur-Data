/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz;

/**
 *
 * @author ROG STRIX
 */
public class Years2020<T> {
    T data;
    Years2020<T> next;

    public Years2020(T data, Years2020<T> next) {
        this.data = data;
        this.next = next;
    }
}

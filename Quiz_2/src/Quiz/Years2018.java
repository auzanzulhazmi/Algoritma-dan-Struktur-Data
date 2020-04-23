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
public class Years2018<T> {
    T data;
    Years2018<T> next;

    public Years2018(T data, Years2018<T> next) {
        this.data = data;
        this.next = next;
    }
}

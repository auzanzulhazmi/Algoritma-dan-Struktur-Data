/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

/**
 *
 * @author ROG STRIX
 */
public class FaktorialBF {
   public int faktorialBF(int n){
        int faktor = 1; //0(1)
        int i = 1; //0(1)
        
        while(i<= n){ //0(n)
            faktor = faktor*i; //0(1)
            i++; //0(1)
        }
        return faktor; //0(1)
    }
}

// = 0(1+1+(n*1*1)+1)
// = 0(3 n)
// = 0(n)  

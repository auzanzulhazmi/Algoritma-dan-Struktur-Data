/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Faktorial;

import java.util.Scanner;

/**
 *
 * @author ROG STRIX
 */
public class Faktorial {
    public int nilai ;
   
    public int faktorialBF(int n){
        
        int faktor = 1;
        //int i = 1;
        //while (i <=n ){
            //faktor = faktor * i;
            //i++;
        for (int i = 1; i <=n; i++){
           faktor = faktor * i;
        }
        return faktor;
    }
    public int faktorialDC(int n){
        if (n==1){
            return 1;
        }
        else{
            int faktor = n * faktorialDC(n - 1);
            return faktor;
        }
    }
}
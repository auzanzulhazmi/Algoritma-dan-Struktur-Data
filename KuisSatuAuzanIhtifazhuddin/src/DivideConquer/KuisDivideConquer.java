/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DivideConquer;

/**
 * Nama     : Auzan Ihtifazhuddin
 * NIM      : 1941720110
 * Kelas    : TI-1F
 * @author ROG STRIX
 */
public class KuisDivideConquer {
    public static void main(String args[]) 
    { 
        int n = 4; //Jumlah dari Gelang
        towerOfHanoi(n, 'A', 'C', 'B'); // A, B dan C adalah nama Tower
    }
    static void towerOfHanoi(int n, char dari_Tower, char ke_Tower, char aux_Tower) 
    { 
        if (n == 1) 
        { 
            System.out.println("Pindah 1 Gelang dari Tower " +  dari_Tower + " ke Tower " + ke_Tower); 
            return; 
        } 
        towerOfHanoi(n-1, dari_Tower, aux_Tower, ke_Tower); 
        System.out.println("Pindah Gelang " + n + " dari Tower " +  dari_Tower + " ke Tower " + ke_Tower); 
        towerOfHanoi(n-1, aux_Tower, ke_Tower, dari_Tower); 
    }  
} 
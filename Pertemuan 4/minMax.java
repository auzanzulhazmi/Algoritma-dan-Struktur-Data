/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bfdc;
/**
 *
 * @author ROG STRIX
 */
public class minMax {
    public int nilaiArray;
    public static void main(String[] args) {
    }
    public static void max_min(int[] arr, int indeks_awal, int indeks_akhir, Maxmin hasil) {
    int indeks_tengah;
        Maxmin hasil1 = new Maxmin();
        Maxmin hasil2 = new Maxmin();
        
        if(indeks_awal == indeks_akhir){
            hasil.minimum = hasil.maximum = arr[indeks_awal];
        }else if(indeks_akhir - indeks_awal == 1){
        if(arr[indeks_awal] > arr[indeks_akhir]){
            hasil.minimum = arr[indeks_akhir];
            hasil.maximum = arr[indeks_awal];
        }else{
            hasil.minimum = arr[indeks_awal];
            hasil.maximum = arr[indeks_akhir];
        }
    }else{
            indeks_tengah = (indeks_awal + indeks_akhir)/2;
            max_min(arr, indeks_awal, indeks_tengah, hasil1);
            max_min(arr, indeks_tengah + 1, indeks_akhir, hasil2);
            
            hasil.minimum = (hasil1.minimum < hasil2.minimum) ? hasil.minimum : hasil2.minimum;
            hasil.maximum = (hasil1.maximum < hasil2.maximum) ? hasil.maximum : hasil2.maximum;
}

    }
}

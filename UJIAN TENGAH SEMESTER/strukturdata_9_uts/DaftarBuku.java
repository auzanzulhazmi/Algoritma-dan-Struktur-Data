/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strukturdata_9_uts;

/**
 *
 * @author ROG STRIX
 */
public class DaftarBuku {
    Buku listBuku[] = new Buku[4];
    int idx;

    void tambah(Buku b){
        if(idx<listBuku.length){
            listBuku[idx] = b;
            idx++;
        } else{
            System.out.println("Data sudah penuh!");
        }
    }
    
    void tampil(){
        for(Buku b : listBuku){
            b.tampil();
            System.out.println();
        }
    }
        
    void selectionSort(){
    for (int i=0; i<listBuku.length; i++){
    int idxMin = i;
    for (int j=i+1; j<listBuku.length; j++){
    if (listBuku[j].tinggiBuku < listBuku[idxMin].tinggiBuku){
    idxMin = j;
    }
    }
   Buku tmp = listBuku[idxMin];
    listBuku [idxMin] = listBuku [i];
    listBuku [i] = tmp;
    }
    }
}

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
public class BinaryTreeArray {
    int[] data;
    int idxLast;
    
    public BinaryTreeArray(int arr, int idxLast){
        data = new int[arr];
        this.idxLast = idxLast;
    }
    
    void traverseInOrder(int idxStart){
        if(idxStart<=idxLast){
            traverseInOrder(2*idxStart+1);
            System.out.print(data[idxStart]+" ");
            traverseInOrder(2*idxStart+2);
        }
    }
    void add(int databr) {
        if (data[0] == 0) {
            data[0] = databr;
        }
        int idx = 0;
        
        while(true) {
            if(databr < data[idx]){
                // insert left child
                if (data[2*idx+1]!=0){
                    idx = (2*idx)+1;
                }else{
                    data[2*idx+1] = databr;
                    break;
                }
            }else if (databr > data[idx]){
                // insert right child
                if (data[2*idx+2]==0){
                    data[2*idx+2] = databr;
                    break;
                }else{
                    idx=2*idx+2;
                }
            }else {
                break;
            }
        }
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2 * idxStart + 1);
            traverseInOrder(2 * idxStart + 2);
        }
    }

    void traversePostOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traverseInOrder(2 * idxStart + 1);
            traverseInOrder(2 * idxStart + 2);
            System.out.print(data[idxStart] + " ");
        }
    }
}
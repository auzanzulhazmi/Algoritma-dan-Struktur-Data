/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_2;
import java.util.Scanner;
/**
 *
 * @author ROG STRIX
 */
public class Main_LinkedList {
    public static void menu(){
        System.out.println(" ");
        System.out.println("|--------------Menu------------|");
        System.out.println("|------------------------------|");
        System.out.println("| 1. Push                     |");
        System.out.println("| 2. Pop                     ||");
        System.out.println("| 3. Cek Teratas             ||");
        System.out.println("| 4. Size                    ||");
        System.out.println("| 5. Print                   ||");
        System.out.println("================================");
    }
    
    public static void main(String[] args) {
        LinkedList tugas = new LinkedList();
        Scanner sc = new Scanner (System.in);
        int pilih;
        
        do{
            menu();
            System.out.print("Pilih : ");
            pilih = sc.nextInt();
            
            try{
                switch(pilih){
                    case 1:
                        System.out.print("Masukkan angka : ");
                        int angka = sc.nextInt();
                        tugas.push(angka);
                        break;
                    case 2:
                        try{
                            System.out.println("Pop Data : " + tugas.pop());
                        }
                        catch(Exception e){
                            System.out.println("Eror : " + e.getMessage());
                        }
                        break;
                    case 3:
                        try{
                            System.out.println("Data Teratas : " + tugas.head());
                        }
                        catch(Exception e){
                            System.out.println("Eror : " + e.getMessage());
                        }
                        break;
                    case 4:
                        System.out.println("Size : " + tugas.getSize());
                        tugas.print();
                        break;
                    case 5:
                        System.out.print("Stack : ");
                        tugas.print();
                        break;
                }
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        while(pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
    }
}

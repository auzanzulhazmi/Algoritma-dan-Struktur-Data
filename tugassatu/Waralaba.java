/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugassatu;
import java.util.Scanner;

/**
 *
 * @author ROG STRIX
 */
public class Waralaba {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int harga = 0, jumlah =0, hargaTotal = 0;
        int menu;
                
        String ulng = "y";
        while(ulng.equalsIgnoreCase("y")){
        System.out.println("Menu Pilihan    :");
        System.out.println("1. Paket Chicken");
        System.out.println("2. Paket Oke");
        System.out.println("++=====================================================================++");
        System.out.print("Pilih Menu yang akan dibeli \t: ");
        menu = sc.nextInt();
        sc.nextLine();
        
        switch (menu) {
            case 1:
                
                System.out.println("1. Paket Chicken A (Rp. 12.000)");
                 System.out.println("2. Paket Chicken B (Rp. 15.000)");
                  System.out.println("3. Paket Chicken C (Rp. 20.000)");
                  System.out.println("");
                  
                  int hca = 12000, hcb = 15000, hcc = 20000;
                  System.out.print("Pilih Menu Paket : ");
                  int pilih1 = sc.nextInt();
                  switch (pilih1) {
                      case 1:
                        System.out.println("Harga :Rp." + hca);
                        harga = 12000;
                        break;
                    case 2:
                        System.out.println("Harga :Rp." + hcb);
                        harga = 15000;
                        break;
                    case 3:
                        System.out.println("Harga :Rp." + hcc);
                        harga = 20000;
                        break;
                    default:
                        System.out.println("Maaf pilihan anda tidak tersedia");
                        break;
        }
                  break;
            case 2:
                System.out.println("1. Paket Oke A (Rp. 10.000)");
                 System.out.println("2. Paket Oke B (Rp. 12.000)");
                  System.out.println("3. Paket Oke C (Rp. 15.000)");
                  System.out.println("");
                  
                  int oka = 10000,okb = 12000,okc = 15000;
                  System.out.print("Pilih Menu Paket : ");
                  int pilih2 = sc.nextInt();
                    switch (pilih2) {
                        case 1:
                            System.out.println("Harga :Rp." + oka);
                            harga = 10000;
                            break;
                        case 2:
                            System.out.println("Harga :Rp." + okb);
                            harga = 12000;
                            break;
                        case 3:
                            System.out.println("Harga :Rp." + okc);
                            harga = 15000;
                            break;
                        default:
                            System.out.println("Maaf pilihan anda tidak tersedia");
                            break;
                    }
                              break;
                              }
        System.out.print("Masukkan jumlah : ");
        jumlah = sc.nextInt();
        sc.nextLine();
        hargaTotal += harga * jumlah;
        System.out.print("Apakah Anda ingin pesan lagi? (Ya/Tidak)");
            ulng = sc.nextLine();
        }
    System.out.println("---HARGA TOTAL YANG DIBELI---");
    System.out.println("Total Harga\t: Rp" + hargaTotal);
}
}
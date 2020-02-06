/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugastiga;
import java.util.Scanner;
/**
 *
 * @author ROG STRIX
 */
public class kata {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  char[] huruf = new char[100];
  int[] jumlahHuruf = new int[100];
  int jumlahHB = 0;
  String kata;

  System.out.print("Masukan kalimat : ");
  kata = input.nextLine();

  if(kata.isEmpty()){
   System.out.println("Masukan kosong");
  } else {

   huruf[0] = kata.charAt(0);
   jumlahHuruf[0] = 1;
   jumlahHB = 1;

   for(int i = 1; i < kata.length(); i++){
    boolean kataMuncul = false;
    for(int a = 0; a < jumlahHB; a++){
     if(kata.charAt(i) == huruf[a]){
      kataMuncul = true;
      jumlahHuruf[a] += 1;
     }
    }
    if(!kataMuncul){
     huruf[jumlahHB] = kata.charAt(i);
     jumlahHuruf[jumlahHB] = 1;
     jumlahHB++;
    }
   }
   System.out.println("Hasil :");
   for(int i = 0; i < jumlahHB; i++){
    System.out.println("Huruf " + huruf[i] + " : " + jumlahHuruf[i] + " buah");
   }
  }
 }
}

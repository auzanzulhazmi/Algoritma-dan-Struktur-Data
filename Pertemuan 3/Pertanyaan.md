# Auzan Ihtifazhuddin
Kelas	:TI-1F

# Jawaban 2.3.3
1. public int faktorialDC(int n){
        if (n==1){
            return 1;
        }
        else{
            int fakto = n*faktorialDC(n-1);
            return fakto;
        }

       Base ini mencari nilai faktorial,divide dan conquer lebih natural dengan skema rekursif yang dilakukan saat pencarian nilai faktorial dari program tersebut,Maksudnya jika nilai n=1 maka akan di return jika salah akan masuk ke pencarian nilai fakto = n dikalikan(*) dengan faktorialDc (n-1); Dan akan di return nilai fakto nya. 
2. 3 Bagian Yaitu : 
	a.	Divide	
		if (n==1){
            return 1;
   	b.	Conquer
   		else{
            int fakto = n*faktorialDC(n-1);
   	c.	Combine
   		return fakto;
3. Bisa,dapat di rubah dengan while seperti :
	public class Faktorial {
    public static void main(String[] args) {
    }
    public int nilai;
    public int faktorialBF(int n){
	      ` int fakto = 1;
	        while (i<fakto){
	        fakto = fakto * i;
	    }
	        //return fakto;
	        //int fakto = 1;
	        //for (int i = 1; 1<= n; i++){
	        //fakto = fakto * i;`
4. Source Code
Faktorial [] fk = new Faktorial[elemen];
        for (int i = 0; i < elemen; i++){
        fk[i] = new Faktorial();
        System.out.print("Masukkan nilai data ke-"+(i+1)+" : ");
        fk[i].nilai = sc.nextInt();
    }
        System.out.println("==============================");
        System.out.println("Hasil Faktorial dengan Brute Force");
        for (int i = 0; i < elemen; i++){
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah : "+fk[i].faktorialBF(fk[i].nilai));
        }
        System.out.println("================================");
        System.out.println("Hasil Faktorial dengan Divide and Conquer");
        for (int i = 0; i<`elemen; i++){
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah : "+fk[i].faktorialDC(fk[i].nilai));
        }
        System.out.println("====================================");

5. Hasil
	run:
================================
Masukkan Jumlah Elemen yang ingin di hitung : 25
Masukkan nilai data ke -1 : 
2
Masukkan nilai data ke -2 : 
32
Masukkan nilai data ke -3 : 
42
Masukkan nilai data ke -4 : 
12
Masukkan nilai data ke -5 : 
1
Masukkan nilai data ke -6 : 
2
Masukkan nilai data ke -7 : 
3
Masukkan nilai data ke -8 : 
4
Masukkan nilai data ke -9 : 
5
Masukkan nilai data ke -10 : 
7
Masukkan nilai data ke -11 : 
8
Masukkan nilai data ke -12 : 
9
Masukkan nilai data ke -13 : 
20
Masukkan nilai data ke -14 : 
40
Masukkan nilai data ke -15 : 
30
Masukkan nilai data ke -16 : 
60
Masukkan nilai data ke -17 : 
07
Masukkan nilai data ke -18 : 
80
Masukkan nilai data ke -19 : 
50
Masukkan nilai data ke -20 : 
30
Masukkan nilai data ke -21 : 
40
Masukkan nilai data ke -22 : 
342
Masukkan nilai data ke -23 : 
23
Masukkan nilai data ke -24 : 
45
Masukkan nilai data ke -25 : 
56
===========================
a. Hasil Faktorial dengan Brute Force
	Faktorial dari nilai 2 adalah : 2
	Faktorial dari nilai 32 adalah : -2147483648
	Faktorial dari nilai 42 adalah : 0
	Faktorial dari nilai 12 adalah : 479001600
	Faktorial dari nilai 1 adalah : 1
	Faktorial dari nilai 2 adalah : 2
	Faktorial dari nilai 3 adalah : 6
	Faktorial dari nilai 4 adalah : 24
	Faktorial dari nilai 5 adalah : 120
	Faktorial dari nilai 7 adalah : 5040
	Faktorial dari nilai 8 adalah : 40320
	Faktorial dari nilai 9 adalah : 362880
	Faktorial dari nilai 20 adalah : -2102132736
	Faktorial dari nilai 40 adalah : 0
	Faktorial dari nilai 30 adalah : 1409286144
	Faktorial dari nilai 60 adalah : 0
	Faktorial dari nilai 7 adalah : 5040
	Faktorial dari nilai 80 adalah : 0
	Faktorial dari nilai 50 adalah : 0
	Faktorial dari nilai 30 adalah : 1409286144
	Faktorial dari nilai 40 adalah : 0
	Faktorial dari nilai 342 adalah : 0
	Faktorial dari nilai 23 adalah : 862453760
	Faktorial dari nilai 45 adalah : 0
	Faktorial dari nilai 56 adalah : 0
	Waktu eksekusi Program adalah : 3.03239594064E14
=============================
b. Hasil Faktorial dengan divide and conquer
	faktorial dari nilai 2 adalah : 2
	faktorial dari nilai 32 adalah : -2147483648
	faktorial dari nilai 42 adalah : 0
	faktorial dari nilai 12 adalah : 479001600
	faktorial dari nilai 1 adalah : 1
	faktorial dari nilai 2 adalah : 2
	faktorial dari nilai 3 adalah : 6
	faktorial dari nilai 4 adalah : 24
	faktorial dari nilai 5 adalah : 120
	faktorial dari nilai 7 adalah : 5040
	faktorial dari nilai 8 adalah : 40320
	faktorial dari nilai 9 adalah : 362880
	faktorial dari nilai 20 adalah : -2102132736
	faktorial dari nilai 40 adalah : 0
	faktorial dari nilai 30 adalah : 1409286144
	faktorial dari nilai 60 adalah : 0
	faktorial dari nilai 7 adalah : 5040
	faktorial dari nilai 80 adalah : 0
	faktorial dari nilai 50 adalah : 0
	faktorial dari nilai 30 adalah : 1409286144
	faktorial dari nilai 40 adalah : 0
	faktorial dari nilai 342 adalah : 0
	faktorial dari nilai 23 adalah : 862453760
	faktorial dari nilai 45 adalah : 0
	faktorial dari nilai 56 adalah : 0
	waktu eksekusi program adalah : 3.032395968941E14
	==============================
	BUILD SUCCESSFUL (total time: 32 seconds)

# Jawaban 2.4.3
1. Perbedaan 2 method PangkatBF() dan PangkatDC() 
	a.  PangkatBF() menggunakan perulangan 
	public int pangkatBF(int a,int n){
            int hasil=1;
            for (int i = 0; i < n; i++){
                hasil = hasil * a;
            }
            return hasil;
        }
    b.	PangkatDC() menggunakan fungsi rekursif 
    	public int pangkatDC(int a, int n){
            if (n==0){
                return 1;
            }
            else{
                if(n%2==1)//bilangan ganjil
                    return (pangkatDC(a,n/2)*pangkatDC(a,n/2)*a);
                else//bilangan genap
                    return (pangkatDC(a,n/2)*pangkatDC(a,n/2));
            }
2. Dalam kode program tersebut ada penyeleksian angka dimana angka n, jika (n%2) = 1 maka n adalah bilangan ganjil dan akan dikembalikan ke nilai return berupa rekursif yaitu (pangkatDC (a, n/2) * pangkatDC (a, n/2) * a) dan  jika salah maka angka n merupakan bilangan genap sehingga akan mengembalikan nilai return rekursif pada (pangkatDC (a, n/2) * pangkatDC (a, n/2)); 
3. return (pangkatDC(a,n/2)*pangkatDC(a,n/2));
4. public int nilai,Pangkat;
	Pangkat(){
	this.nilai=nilai;
	this.Pangkat=Pangkat;
}
5. /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu3;

import java.util.Scanner;

/**
 *
 * @author ROG STRIX
 */
public class MainPangkat_1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("===========================");
        System.out.println("Menu");
        System.out.println("1. BRUTE FORCE\n 2. CIVIDE AND CONQUER");
        System.out.print("Masukkan pilihan anda : ");
        int pilih = sc.nextInt();
        System.out.println("===============================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();
        
        Pangkat [] png = new Pangkat[elemen];
        for (int i = 0; i < elemen; i++){
            png[i] = new Pangkat();
            System.out.print("Masukkan nilai yang akan dipangkatkan ke-"+(i+1)+" : ");
            png[i].nilai = sc.nextInt();
            System.out.print("Masukkan nilai pemangkat ke-"+(i+1)+" : ");
            png[i].pangkat = sc.nextInt();
        }
        switch (pilih){
            case 1 :
            System.out.println("==============================");
            System.out.println("Hasil Faktorial dengan Brute Force");
            for (int i = 0; i < elemen; i++){
                System.out.println("Nilai "+png[i].nilai+" adalah : "+png[i].pangkat+" adalah : "+png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                break;
            }
                case 2:
            System.out.println("================================");
            System.out.println("Hasil Faktorial dengan Divide and Conquer");
            for (int i = 0; i<`elemen; i++){
                System.out.println("Nilai "+png[i].nilai+" adalah : "+png[i].pangkat+" adalah : "+png[i].pangkatDC(png[i].nilai, png[i].pangkat));
            }
            System.out.println("====================================");
            break;
                default:
        }`

# Jawaban 2.5.3
1. Perbedaan perhitungan  
 
a) TotalBF() menggunakan mengunakan for untuk melakukan perulangan dimana untuk menghitung keuntungan for (i = 0; i<= elemen; i) akan bertambah sampai terpenuhi yang akan dijabarkan dibawah ini : • i = 0 => total = 0+keuntungan 1  • i = 1 => total = (0+keuntungan 1)+keuntungan 2  • i = 2 => total = ((0+keuntungan 1)+(keuntungan 2)+ keuntungan elemen )  
 
b) TotalDC() menggunakan Divide and Conquer  
 
Misalnya  bulan yang kita masukan = 5, keuntungan = {1,2,3,4,5}  Jadi perhitungan keuntungan dibagi manjadi 2 bagian bagian kiri lsum dan bagian kanan rsum ,yang akan saya jabarkan sebagai berikut : • Lsum = 1, 2 dan rsum = 4, 5, kemudian nilai mid (tengah) = 3  • Di lsum melakukan perhitungan 1+2 = 3  • Di rsum melakukan perhitungan 4+5 = 9  Kemudian direturn dengan menjumlahkan lsum+rsum+arr[mid] = 3+9+3 = 15 (hasil akhir) 

2. Cara membatasinya dengan System.out.printf 
	System.out.printf("Total keuntungan perusahaan selama "+s.elemen+"bulan adalah = "+s.totalBF(s.keuntungan));
3. Source Code
	return lsum+rsum+arr[mid];
Kode program tersebut adalah combine dari divide and conquer yaitu fungsi TotalDC itu sendiri, dimana fungsi digunakan untuk menggabungkan kembali pemecahan masalah tadi yang telah di conquer sebelumnya.(Hasil akhir dari proses tersebut dan untuk menampilkan outputnya) 
4. Variabel mid berfungsi untuk mengetahui nilai tengah dari array arr[ ] yang dimana fungsi program  mid ini yang mencari keuntungan perbulan yang didapatkan.(keuntungan perbulan yang didapatkan). 
5. /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu3;

import java.util.Scanner;

/**
 *
 * @author ROG STRIX
 */
public class MainSum_1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("======================================");
        System.out.println("      MENGHITUNG KEUNTUNGAN TOTAL     ");
        System.out.println("======================================");
        System.out.println("Masukkan jumlah Perusahaan : ");
        int elm = sc.nextInt();
        for (int i = 0; i < elm; i++){
            System.out.println("=====================================");
            System.out.println("Perusahaan ke-"+(i+1));
            System.out.print("Masukkan jumlah bulan = ");
            int ku = sc.nextInt();
        }
        Sum sm = new Sum(elm);
        System.out.println("==========================================");
        for (int i = 0; i < sm.elemen; i++){
            System.out.print("Masukkan untung bulan ke - "+(i+1)+" = ");
            sm.keuntungan[i] = sc.nextDouble();
        }
        System.out.println("==========================================");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total Keuntungan Perusahaan selama " + sm.elemen + "bulan adalah = "+sm.totalBF(sm.keuntungan));
        System.out.println("==========================================");
        System.out.println("Algoritma Divide Conquer");
        System.out.println("Total keuntungan perusahaan selama " + sm.elemen + "bulan adalah = "+sm.totalDC(sm.keuntungan, 0,sm.elemen-1));
    }
}

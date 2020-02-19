# Nama : Auzan Ihtifazhuddin F.Z.H
Kelas : TI-1F

# Jawaban 2.3.3

1. Karakteristik Class dan Objek
Class: diawali dengan huruf kapital
Objek: harus instansiasi di method main
2. Dengan menggunakan kunci dari objek yang digunakan. Seperti Barang item = new Barang(); Bisa juga dengan menggunakan keyword sepeti public class dll. 
3.  Ada 4 atribut,yaitu : String namaBarang, jenisBarang; int stok, hargaSatuan; 
Deklarasi atribut dilakukan pada baris ke 4-5 
4. Ada 4 method : tampilBarang(), tambahStok(), kurangiStok(), dan hitungHargaTotal(); 
Method tampilBarang() pada baris ke 7-12 Method tambahStok() pada baris ke 13-15 Method kurangiStok() pada baris ke 16-18 Method hitungHargaTotal() pada baris ke 19-21.
5. void kurangiStok(int n){ if(stok > 0){ stok = stok - n; } else { System.out.println("Maaf, stok anda kurang"); } } 
6. Karena dalam method tersebut hanya membutuhkan nilai yang diambil n. n adalah bilangan integer. Nilai n digunakan untuk proses tambah stok. 
7.  Karena method tersebut berfungsi mengembalikan nilai dari hasil perhitungan jumlah*hargaSatuan. Dan Hasil tersebut akan dikembalikan ke tempat dimana method tersebut dipanggil. 
8. Karena method tersebut tidak perlu mengembalikan nilai dari proses yang ada didalam method. 

# Jawaban 2.4.3

1. Prose instansiasi dilakukan pada baris ke-5. Nama objek yang dihasilkan adalah b1. 
2. Melakukan instansiasi terlebih dahulu , seperti dibawah ini: namaKelas namaObjek = new namaKelas(); - Kemudian untuk mengakses atributnya, dengan menulis : namaObjek.namaAtribut = nilaiDariAtribut; - Sedangkan untuk mengakses method, dengan manulis : namaObjek.namaMethod; 

# Jawaban 2.5.3

1. public Barang(String nm, String jn, int st, int hs){
        namaBarang = nm;
        jenisBarang = jn;
        stok = st;
        hargaSatuan = hs;
    }
2. Dilakukan proses instansiasi atau proses mengakses objek dari kelas barang. 
3. /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu2;

/**
 *
 * @author ROG STRIX
 */
public class BarangMain {
    public static void main(String[] args) {
        Barang b1 = new Barang();
        b1.namaBarang = "Corsair 2 GB";
        b1.jenisBarang = "DDR";
        b1.hargaSatuan = 250000;
        b1.stok = 10;
        b1.tambahStok(1);
        b1.kurangiStok(3);
        b1.tampilBarang();
        int hargaTotal = b1.hitungHargaTotal(4);
        System.out.println("Harga 4 buah = "+hargaTotal);
        
        Barang b3 = new Barang("Logitech", "Wireless Mouse", 150000, 25);
        b3.tampilBarang();
    }
}
Hasil Run :
Nama = Corsair 2 GB
Jenis = DDR
Stok = 11
Harga Satuan = 250000
Harga 4 buah = 1000000
Nama = Logitech
Jenis = Wireless Mouse
Stok = 150000
Harga Satuan = 25
BUILD SUCCESSFUL (total time: 0 seconds)

# Jawaban 2.6.3
1. Kode di atas akan membuat ppArray yang dapat menampung 3 objek persegi Panjang tetapi array tersebut masih kosong.
2. Kode tersebut untuk membuat objek pada array persegi Panjang Menerima Input Isian Array Menggunakan Looping.

# Jawaban 2.7.3

1. Karena objek pada atribut tersebut belum dibuat dan masih kosong 

# Jawaban 2.8.3 

1. Method khusus yang akan dijalankan secara otomatis pada saat sebuah objek dibuat (instansiasi), yakni ketika perintah “new” dijalankan 
2. public static void main(String[] args) {
    Segitiga[] sgArray = new Segitiga [15];
}

3. public Segitiga(int a, int t){
        alas = a;
        tinggi = t;
    }

4. public double hitungLuas(){
        return 0.5 * alas * tinggi;
    }
    public double hitungKeliling(){
        double hasil = Math.sqrt(Math.pow(alas,2) + Math.pow(tinggi,2));
        return hasil + alas + tinggi;
    }

5. /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Segitiga;

/**
 *
 * @author ROG STRIX
 */
public class ArraySegitiga {
    public static void main(String[] args) {
    Segitiga[] sgArray = new Segitiga [10];
    
        sgArray[0] = new Segitiga(10, 4);
        sgArray[1] = new Segitiga(20, 10);
        sgArray[2] = new Segitiga(15, 6);
        sgArray[3] = new Segitiga(25, 10);
        
for (int i = 0; i < 4; i++){
    System.out.println("Luas Segitiga ke-" +i+ ": " + sgArray[i].hitungLuas());
    System.out.println("Keliling segitiga ke-" +i+": " + sgArray[i].hitungKeliling());
}
    }
}
 
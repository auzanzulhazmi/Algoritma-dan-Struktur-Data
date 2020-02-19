package Minggu2;

public class Barang {
    public String namaBarang, jenisBarang;
    public int stok, hargaSatuan;
    
    public Barang(){
        
    }
    
    public Barang(String nm, String jn, int st, int hs){
        namaBarang = nm;
        jenisBarang = jn;
        stok = st;
        hargaSatuan = hs;
    }
    
    public void tampilBarang(){
        System.out.println("Nama\t\t: " + namaBarang);
        System.out.println("Jenis\t\t: " + jenisBarang);
        System.out.println("Stok\t\t: " + stok);
        System.out.println("Harga Satuan\t: " + hargaSatuan);
    }
    
    public void tambahStok(int n){
        stok = stok + n;
    }
    
    public void kurangiStok(int n){
        stok = stok - n;
    }
    
    public int hitungHargaTotal(int jumlah){
        return jumlah * hargaSatuan;
    }
}

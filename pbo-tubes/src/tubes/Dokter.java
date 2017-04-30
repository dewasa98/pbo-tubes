/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

/**
 *
 * @author User
 */
public class Dokter {
    private String nama;
    private Pasien[] daftarPasien;
    private int jumlahPasien;
    private Periksa[] daftarPeriksa;
    private int jumlahPeriksa;

    public Dokter(String nama, int maxJumlahPasien) {
        this.nama = nama;
        this.daftarPasien = new Pasien[maxJumlahPasien];
        this.jumlahPasien = 0;
        this.daftarPeriksa = new Periksa[maxJumlahPasien*5];
        this.jumlahPeriksa = 0;
    }
    
    public Dokter(String nama) {
        this.nama = nama;
        this.daftarPasien = new Pasien[25];
        this.jumlahPasien = 0;
        this.daftarPeriksa = new Periksa[125];
        this.jumlahPeriksa = 0;
    }

    public String getNama() {
        return nama;
    }

    public int getJumlahPasien() {
        return jumlahPasien;
    }
    
    public void addPeriksa(Pasien pas, String tglPeriksa, String indikasi, String rekomendasi){
        if(jumlahPeriksa < daftarPeriksa.length){
            Periksa entry = new Periksa(this, daftarPasien[jumlahPeriksa], tglPeriksa, indikasi, rekomendasi);
            daftarPeriksa[jumlahPeriksa] = entry;
            jumlahPeriksa++;
        }
    }
    
    public Periksa getDaftarPeriksa(int i){
        return daftarPeriksa[i];
    }
    
}
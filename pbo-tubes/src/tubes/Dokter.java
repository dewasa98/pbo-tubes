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
    private int jumlahPemeriksaan;
    private Periksa[] daftarPemeriksaan;

    public Dokter(String nama, int maxJumlahPasien) {
        this.nama = nama;
        this.daftarPemeriksaan = new Periksa[maxJumlahPasien];
    }

    public Dokter(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public int getJumlahPasien() {
        return jumlahPemeriksaan;
    }
    
    public void tambahPeriksa(Pasien pas, String tglPeriksa, String indikasi, String rekomendasi){
        if(jumlahPemeriksaan < daftarPemeriksaan.length){
            Periksa entry = new Periksa(this, daftarPasien[jumlahPemeriksaan], tglPeriksa, indikasi, rekomendasi);
            daftarPemeriksaan[jumlahPemeriksaan] = entry;
            jumlahPemeriksaan++;
        }
    }
    
    public Periksa getDaftarPeriksa(int i){
        return daftarPemeriksaan[i];
    }
    
}
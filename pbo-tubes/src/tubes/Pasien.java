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
public class Pasien {
    private String nama;
    private Periksa[] riwayatPemeriksaan;
    private int jumlahPemeriksaan;

    public Pasien(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public String getRekomendasiTerakhir() {
        return riwayatPemeriksaan[jumlahPemeriksaan].getRekomendasi();
    }

    public String getIndikasiTerakhir() {
        return riwayatPemeriksaan[jumlahPemeriksaan].getIndikasi();
    }
    
    public int getJumlahPeriksa(){
        return jumlahPemeriksaan;
    }
    
    public Periksa getPeriksa(int i){
        return riwayatPemeriksaan[i];
    }
    
    public void addPeriksa(String tanggalPeriksa, String indikasi, Dokter dokter, String rekomendasi){
        Periksa entry = new Periksa(dokter, this, tanggalPeriksa, indikasi, rekomendasi);
        this.riwayatPemeriksaan[jumlahPemeriksaan] = entry;
        this.jumlahPemeriksaan++;
    }
    
    
}

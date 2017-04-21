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
public class Periksa {
    private String namaPasien;
    private String namaDokter;
    private String tanggalPeriksa;
    private String indikasi;
    private String rekomendasi;
    private double bayarPeriksa;

    public Periksa(Dokter dok, Pasien pas, String tanggalPeriksa, String indikasi, String rekomendasi){
        this.namaDokter = dok.getNama();
        this.namaPasien = pas.getNama();
        this.tanggalPeriksa = tanggalPeriksa;
        this.indikasi = indikasi;
        this.rekomendasi = rekomendasi;
    }

    public String getNamaPasien() {
        return namaPasien;
    }

    public String getNamaDokter() {
        return namaDokter;
    }

    public String getTanggalPeriksa() {
        return tanggalPeriksa;
    }

    public String getIndikasi() {
        return indikasi;
    }

    public String getRekomendasi() {
        return rekomendasi;
    }
    
    
    
}

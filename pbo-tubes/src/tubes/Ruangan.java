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
public class Ruangan {
    private String nomor;
    private int kapasitas;
    private int jumlahDokter;
    private Dokter dokter;
    private Ruangan[] ruang;

    public Ruangan(String nomor, int kapasitas){
        this.nomor = nomor;
        this.ruang = new Ruangan[kapasitas];
        this.jumlahDokter = 0;
    }
    
    public Dokter getDokter(int i){
        return ruang[i].dokter;
    }
    //method getPasien masih salah.
    public String getPasien(int i){
        return ruang[i].dokter.getNama();
    }
    
    public void addDokter(String nomor, Dokter d){
        if(this.jumlahDokter < ruang.length){
            ruang[jumlahDokter].dokter = d;
            jumlahDokter++;
        }
    }
}

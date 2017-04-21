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
    private int ndok;
    private Dokter dokter;
    private Ruangan[] ruang;

    public Ruangan(String nama, int kapasitas){
        this.nomor = nomor;
        this.ruang = new Ruangan[kapasitas];
    }
    
    public Dokter getDokter(int i){
        return ruang[i].dokter;
    }
    
    public Pasien getPasien(int i){
        Pasien entry = new Pasien(ruang[i].dokter.getDaftarPeriksa(i).getNamaPasien());
        return entry;
    }
    
    public void addDokter(String nomor, Dokter d){
        if(this.ndok < ruang.length){
            ruang[ndok].dokter = d;
            ndok++;
        }
    }
}

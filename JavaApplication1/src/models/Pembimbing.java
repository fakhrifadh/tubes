/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package models;

import java.io.Serializable;

/**
 *
 * @author JOKER
 */
public class Pembimbing extends Orang implements Serializable {
    private int idKelompok;
    private int lokasi;
    
    public Pembimbing(String nama, String noId, String nohp) {
        super(nama, noId, nohp, "pembimbing");
        idKelompok = 0;
        lokasi = 0;
    }
    public int getLokasi() {
        return lokasi;
    }

    public void setLokasi(int lokasi) {
        this.lokasi = lokasi;
    }

    public int getIdKelompok() {
        return idKelompok;
    }

    public void setIdKelompok(int idKelompok) {
        this.idKelompok = idKelompok;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

/**
 *
 * @author JOKER
 */
public class kelompok {
    public String namaKelompok;
    public mahasiswa anggota[] = new mahasiswa[4];
    public pembimbing pembimbingkel[] = new pembimbing[2];
    int i,j=0;

    public void setNamaKelompok(String namaKelompok) {
        this.namaKelompok = namaKelompok;
    }
    
    public String getNamaKelompok() {
        return namaKelompok;
    }
    
    public void add_anggota(mahasiswa m){
        if (i < 4){
            anggota[i]=m;
            i++;
        }
        else System.out.println("kelompok penuh");
    }
     public void add_pembimbing(pembimbing p){
        if (j < 4){
            pembimbingkel[j]=p;
            j++;
        }
        else System.out.println("pembimbing kelompok penuh");
    }
    
    public mahasiswa getAnggotabyIndex(int n){
        return anggota[n];
    }
    
    public mahasiswa getAnggotabyId(String idmhs){
        for(int y=0; y < anggota.length ;y++){
            if ( anggota[y].getId() == idmhs ){
                return anggota[y];
            }
        }
        return null;
    }
    public void removeanggota(String id){
        for(int i=0; i < anggota.length; i++){
            if ( anggota[i].id == id ){
                for (int j=i; j < anggota.length; j++){
                    anggota[j] = anggota[j+1];
                }
            }
        }
    }
}
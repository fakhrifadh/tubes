/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package models;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
/**
 *
 * @author JOKER
 */
public class serial {
    public void savedatamhs (Collection<Mahasiswa> mhs) {
        
        try {
            FileOutputStream fout = new FileOutputStream("mahasiswa.txt");
            ObjectOutputStream oout = new ObjectOutputStream(fout);
            oout.writeObject(mhs);
            fout.close();
            oout.close();
        } catch (Exception e) {
            System.out.println("terjadi exception");
        }
    }
    public Collection loadmhs(){
        Collection<Mahasiswa> listDeserialized;
        try {
            FileInputStream fIN = new FileInputStream("listOrang.txt");
            ObjectInputStream oIS = new ObjectInputStream(fIN);
            listDeserialized = (Collection<Mahasiswa>) oIS.readObject();
            oIS.close();
            fIN.close();
        } catch (IOException io) {
            io.printStackTrace();
            return null;
        } catch (ClassNotFoundException c){
            c.printStackTrace();
            return null;
        }
        return listDeserialized;
    }
    public void savedatalokasi (Collection<LokasiGladi> lok) {
        
        try {
            FileOutputStream fout = new FileOutputStream("lokasi.txt");
            ObjectOutputStream oout = new ObjectOutputStream(fout);
            oout.writeObject(lok);
            fout.close();
            oout.close();
        } catch (Exception e) {
            System.out.println("terjadi exception");
        }
    }
    public Collection loadlokasi(){
        Collection<LokasiGladi> listDeserialized;
        try {
            FileInputStream fIN = new FileInputStream("lokasi.txt");
            ObjectInputStream oIS = new ObjectInputStream(fIN);
            listDeserialized = (Collection<LokasiGladi>) oIS.readObject();
            oIS.close();
            fIN.close();
        } catch (IOException io) {
            io.printStackTrace();
            return null;
        } catch (ClassNotFoundException c){
            c.printStackTrace();
            return null;
        }
        return listDeserialized;
    }
    public void savedatapem (Collection<Pembimbing> pem) {
        
        try {
            FileOutputStream fout = new FileOutputStream("pembimbing.txt");
            ObjectOutputStream oout = new ObjectOutputStream(fout);
            oout.writeObject(pem);
            fout.close();
            oout.close();
        } catch (Exception e) {
            System.out.println("terjadi exception");
        }
    }
    public Collection loadpem(){
        Collection<Pembimbing> listDeserialized;
        try {
            FileInputStream fIN = new FileInputStream("pembimbing.txt");
            ObjectInputStream oIS = new ObjectInputStream(fIN);
            listDeserialized = (Collection<Pembimbing>) oIS.readObject();
            oIS.close();
            fIN.close();
        } catch (IOException io) {
            io.printStackTrace();
            return null;
        } catch (ClassNotFoundException c){
            c.printStackTrace();
            return null;
        }
        return listDeserialized;
    }
}

package main;

import controller.ControllerMenuUtamaGladi;
import java.io.Serializable;
import models.Aplikasi;
import java.io.*;
import models.serial;
import models.*;

public class driver implements Serializable {
    public static void main(String[] args) {
        Aplikasi aplikasi = new Aplikasi();
        /*serial sr = new serial();
        aplikasi.setListPembimbing(sr.loadpem());
        aplikasi.setListMahasiswa(sr.loadmhs());
        aplikasi.setListLokasiGladi(sr.loadlokasi());
        */new ControllerMenuUtamaGladi(aplikasi);
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;
import models.Aplikasi;
import view.MenuPilihGeladi ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import models.LokasiGladi;

import models.Aplikasi;

/**
 *
 * @author JOKER
 */
class ControllerMenuPilihGeladi implements ActionListener {
    Aplikasi model;
    MenuPilihGeladi menupilihgeladi;
    
    public ControllerMenuPilihGeladi(Aplikasi model) {
        this.model = model;
        menupilihgeladi = new MenuPilihGeladi();
        menupilihgeladi.addListener(this);
        menupilihgeladi.setVisible(true);
        menupilihgeladi.getListlokasi().setListData(model.getdaftarlokasi());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

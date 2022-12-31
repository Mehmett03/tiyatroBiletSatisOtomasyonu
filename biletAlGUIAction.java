/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tıyatrootomasyonu.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class biletAlGUIAction implements ActionListener{
    private biletAlGUI bilet;

    public biletAlGUIAction(biletAlGUI bilet) {
        this.bilet = bilet;
    }

    public biletAlGUI getBilet() {
        if(this.bilet==null)
        {
            this.bilet=new biletAlGUI();
        }
        return bilet;
    }

    public void setBilet(biletAlGUI bilet) {
        this.bilet = bilet;
    }
    
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==getBilet().getBtn1())
        {
            if(Integer.parseInt(getBilet().getTxt1().getText())<5 &&Integer.parseInt(getBilet().getTxt1().getText())>0)
            {
                JOptionPane.showMessageDialog(null, "İşlem başarılı");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Oyun bulunamadı");
            }
        }
    }
    
    
}

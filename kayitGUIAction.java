/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tıyatrootomasyonu.gui;

import DAO.UserDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class kayitGUIAction implements ActionListener{
    private kayitGUI kayit;
    private UserDAO user;
    public kayitGUIAction(kayitGUI kayit)
    {
        this.kayit=kayit;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==getKayit().getBtn1())
        {
            try {
                getUser().Save(getKayit().getTxt1().getText(), getKayit().getTxt2().getText(), getKayit().getTxt3().getText(), getKayit().getTxt4().getText());
                getKayit().getWindow().setVisible(false);
            } catch (IOException ex) {
                Logger.getLogger(kayitGUIAction.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public kayitGUI getKayit() {
        if(this.kayit==null)
        {
            this.kayit=new kayitGUI();
            kayit.build();
        }
        return kayit;
    }

    public void setKayit(kayitGUI kayit) {
        this.kayit = kayit;
    }

    public UserDAO getUser() {
        if(this.user==null)
        {
            this.user=new UserDAO();
        }
        return user;
    }
    
    
    
    
    
}


package tıyatrootomasyonu.gui;

import DAO.UserDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class girisGUIAction implements ActionListener{
    private girisGUI giris;
    private oyunlarGUI oyunlar;
    private kayitGUI kayit;
    private UserDAO user;
    
    public girisGUIAction(girisGUI giris)
    {
        this.giris=giris;
    }
    

    public girisGUI getGiris() {
        if(this.giris==null)
        {
            giris=new girisGUI();
            
        }
        return giris;
    }

    public void setGiris(girisGUI giris) {
        this.giris = giris;
    }

    public oyunlarGUI getOyunlar() {
        if(this.oyunlar==null)
        {
            oyunlar=new oyunlarGUI();
            oyunlar.build();
        }
        return oyunlar;
    }

    public void setOyunlar(oyunlarGUI oyunlar) {
        this.oyunlar = oyunlar;
    }

    public kayitGUI getKayit() {
        if(this.kayit==null)
        {
            kayit=new kayitGUI();
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

    public void setUser(UserDAO user) {
        this.user = user;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==getGiris().getBtn2())
        {
            getKayit().getWindow().setContentPane(getKayit().getPnl());
            getKayit().getWindow().setVisible(true);
        }
        else if(e.getSource()==getGiris().getBtn1())
        {
            if(getUser().getData(getGiris().getTxt1().getText(),getGiris().getTxt2().getText()))
            {
                getOyunlar().getWindow().setContentPane(getOyunlar().getPnl());
                getOyunlar().getWindow().setVisible(true);
                        
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Email veya Şifre hatalı" );
            }
        }
    }
 
}

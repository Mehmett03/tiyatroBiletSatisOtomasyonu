
package tıyatrootomasyonu.gui;

import DAO.OyunDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class oyunlarGUIAction implements ActionListener {
   
    private oyunlarGUI oyunlar;
    private biletAlGUI bilet;
    private OyunDAO oyun;
    
    public oyunlarGUIAction(oyunlarGUI oyunlar)
    {
        this.oyunlar=oyunlar;
        
    }

    public OyunDAO getOyun() {
        if(this.oyun==oyun)
        {
            this.oyun=new OyunDAO();
        }
        return oyun;
    }

    public void setOyun(OyunDAO oyun) {
        this.oyun = oyun;
    }

    public oyunlarGUI getOyunlar() {
        if(this.oyunlar==null)
        {
            this.oyunlar=new oyunlarGUI();
            
        }
        return oyunlar;
    }

    public void setOyunlar(oyunlarGUI oyunlar) {
        this.oyunlar = oyunlar;
    }

    public biletAlGUI getBilet() {
        if(this.bilet==null)
        {
            this.bilet=new biletAlGUI();
            bilet.build();
            
        }
        return bilet;
    }

    public void setBilet(biletAlGUI bilet) {
        this.bilet = bilet;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==getOyunlar().getBtn1())
        {
            try {
                getOyun().Save(getOyunlar().getId1().getText(),getOyunlar().getId2().getText(),getOyunlar().getId3().getText(),getOyunlar().getId4().getText());
                getBilet().getWindow().setContentPane(getBilet().getPnl());
                getBilet().getWindow().setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(oyunlarGUIAction.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
}

package tıyatrootomasyonu.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;


public class oyunlarGUI {

private String ad;
private String soyAd;
private String eposta;
private String sifre;



private JPanel pnl;
private JButton btn1;


private JLabel lbl1;
private JLabel lbl2;
private JLabel lbl3;
private JLabel lbl4;
private JLabel id1;
private JLabel id2;
private JLabel id3;
private JLabel id4;
private JLabel tur;
private JLabel ID;
private JFrame window;

private ImageIcon imageicon;
private Image image;
private JLabel fotografEtiket;

public oyunlarGUI() {


}

public void build()
{

    this.getPnl().add(this.getLbl1());
    this.getPnl().add(this.getLbl2());
    this.getPnl().add(this.getLbl3());
    this.getPnl().add(this.getLbl4());
    this.getPnl().add(this.getId1());
    this.getPnl().add(this.getId2());
    this.getPnl().add(this.getId3());
    this.getPnl().add(this.getId4());
    this.getPnl().add(this.getTur());
    this.getPnl().add(this.getID());
    this.getPnl().add(this.getBtn1());
    this.getPnl().add(getFotografEtiket());
    this.getWindow().setContentPane(this.getPnl());
    this.getWindow().setLayout(null);
    this.getWindow().setVisible(true);

}






public JFrame getWindow() {
    if (this.window==null)
    {
        window=new JFrame("OYUNLAR");
        window.setBounds(300,100,800,800);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    return window;
}

public String getAd() {
    return ad;
}

public void setAd(String ad) {
    this.ad = ad;
}

public void setSoyAd(String soyAd) {
    this.soyAd = soyAd;
}

public void setEposta(String eposta) {
    this.eposta = eposta;
}

public String getSoyAd() {
    return soyAd;
}

public String getEposta() {
    return eposta;
}

public String getSifre() {
    return sifre;
}

public void setSifre(String sifre) {
    this.sifre = sifre;
}

public JPanel getPnl() {
    if ( this.pnl == null ){
        this.pnl = new JPanel();
        this.pnl.setBounds(300,100,800,800);
        pnl.setLayout(new BoxLayout(pnl,BoxLayout.LINE_AXIS));
        this.pnl.setBackground(Color.blue);

    }
    return pnl;
}

public void setPnl(JPanel pnl) {
    this.pnl = pnl;
}

public JButton getBtn1() {
    if ( this.btn1 == null ){
        this.btn1 = new JButton("BİLET AL");
        this.btn1.setBounds(600,600,100,30);
        this.btn1.addActionListener(new oyunlarGUIAction(this));
    }
    return btn1;
}

public void setBtn1(JButton btn1) {
    this.btn1 = btn1;
}



public JLabel getLbl1() {
    if( this.lbl1 == null ){
        this.lbl1 = new JLabel("HACİVAT VE KARAGÖZ");
        this.lbl1.setBounds(100, 100, 150, 30);
        this.lbl1.setFont(new Font("Arial",Font.BOLD,13));
        this.lbl1.setForeground(Color.white);

    }
    return lbl1;
}

public void setLbl1(JLabel lbl1) {
    this.lbl1 = lbl1;
}

public  JLabel getLbl2() {
    if( this.lbl2 == null ){
        this.lbl2 = new JLabel("EYLÜL");
        this.lbl2.setBounds(100, 150, 150, 30);
        this.lbl2.setFont(new Font("Arial",Font.BOLD,13));
        this.lbl2.setForeground(Color.white);

    }
    return lbl2;
}

public void setLbl2(JLabel lbl2) {
    this.lbl2 = lbl2;
}
public JLabel getLbl3() {
    if( this.lbl3 == null ){
        this.lbl3= new JLabel("YAŞAMAYA DAİR");
        this.lbl3.setBounds(100, 200, 150, 30);
        this.lbl3.setFont(new Font("Arial",Font.BOLD,13));
        this.lbl3.setForeground(Color.white);
    }
    return lbl3;
}

public void setLbl3(JLabel lbl3) {
    this.lbl3 = lbl3;
}

public JLabel getLbl4() {
    if( this.lbl4 == null ){
        this.lbl4 = new JLabel("KALP");
        this.lbl4.setBounds(100, 250, 150, 30);
        this.lbl4.setFont(new Font("Arial",Font.BOLD,13));
        this.lbl4.setForeground(Color.white);

    }
    return lbl4;
}

public void setLbl4(JLabel lbl4) {
    this.lbl4 = lbl4;
}
 public JLabel getId1() {
        if( this.id1 == null ){
            this.id1 = new JLabel("1");
            this.id1.setBounds(300, 100, 100, 30);
            this.id1.setFont(new Font("Arial",Font.BOLD,15));
            this.id1.setForeground(Color.white);
            
        }
        return id1;
    }

    public void setId1(JLabel id1) {
        this.id1 = id1;
    }

    public  JLabel getId2() {
        if( this.id2 == null ){
            this.id2 = new JLabel("2");
            this.id2.setBounds(300, 150, 100, 30);
            this.id2.setFont(new Font("Arial",Font.BOLD,15));
            this.id2.setForeground(Color.white);
            
        }
        return id2;
    }

    public void setId2(JLabel id2) {
        this.id2 = id2;
    }
    public JLabel getId3() {
        if( this.id3 == null ){
            this.id3 = new JLabel("3");
            this.id3.setBounds(300, 200, 100, 30);
            this.id3.setFont(new Font("Arial",Font.BOLD,15));
            this.id3.setForeground(Color.white);
        }
        return id3;
    }

    public void setId3(JLabel id3) {
        this.id3 = id3;
    }

    public JLabel getId4() {
        if( this.id4 == null ){
            this.id4 = new JLabel("4");
            this.id4.setBounds(300, 250, 100, 30);
            this.id4.setFont(new Font("Arial",Font.BOLD,15));
            this.id4.setForeground(Color.white);
            
        }
        return id4;
    }

    public void setId4(JLabel id4) {
        this.id4 = id4;
    }
    public JLabel getTur() {
        if( this.tur == null ){
            this.tur = new JLabel("OYUN TUR");
            this.tur.setBounds(100, 0, 200, 30);
            this.tur.setFont(new Font("Arial",Font.BOLD,13));
            this.tur.setForeground(Color.white);
            
        }
        return tur;
    }

    public void setTur(JLabel tur) {
        this.tur = tur;
    }

    public JLabel getID() {
        if( this.ID == null ){
            this.ID = new JLabel("OYUN ID");
            this.ID.setBounds(300, 0, 200, 30);
            this.ID.setFont(new Font("Arial",Font.BOLD,13));
            this.ID.setForeground(Color.white);
            
        }
        return ID;
    }

    public void setID(JLabel ID) {
        this.ID = ID;
    }
    public ImageIcon getImageicon() {
        if(imageicon==null)
        {
            this.imageicon=new ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\TıyatroOtomasyonu\\gorsel\\20121104142148-028cc6aa-me.jpg");
        }
        return imageicon;
    }

    public void setImageicon(ImageIcon imageicon) {
        this.imageicon = imageicon;
    }

    public Image getImage() {
        if(this.image==null)
        {
            this.image=getImageicon().getImage().getScaledInstance(800, 800, Image.SCALE_SMOOTH);
        }
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public JLabel getFotografEtiket() {
        if(this.fotografEtiket==null)
        {
            this.fotografEtiket=new JLabel(new ImageIcon(getImage()));
            this.fotografEtiket.setBounds(0,0,800,800);
        }
        return fotografEtiket;
    }

    public void setFotografEtiket(JLabel fotografEtiket) {
        this.fotografEtiket = fotografEtiket;
    }



}

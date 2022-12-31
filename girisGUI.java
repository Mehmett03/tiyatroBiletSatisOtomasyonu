package tıyatrootomasyonu.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;

 
public class girisGUI {
    
    private String kullanıcıAd;
    private String sifre;
    
    private JPanel pnl;
    private JButton btn1;
    private JButton btn2;
    private JTextField txt1;
    private JTextField txt2;
    private JFrame window;
    private JLabel lbl1;
    private JLabel lbl2;
    
    private ImageIcon imageicon;
    private Image image;
    private JLabel fotografEtiket;
    
    
    public girisGUI() {
        
        
    }
    
    public void build()
    {
        
        this.getPnl().add(this.getTxt1());
        this.getPnl().add(this.getTxt2());
        this.getPnl().add(this.getBtn1());
        this.getPnl().add(this.getBtn2());
        this.getPnl().add(this.getLbl1());
        this.getPnl().add(this.getLbl2());
        this.getPnl().add(getFotografEtiket());
        this.getWindow().setContentPane(this.getPnl());
        this.getWindow().setLayout(null);
        this.getWindow().setVisible(true);
        
    }

    public JFrame getWindow() {
        if (this.window==null)
        {
            window=new JFrame("Giriş");
            window.setBounds(300,100,800,800);
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        return window;
    }

    public void setWindow(JFrame window) {
        this.window = window;
    }
    public String getKullanıcıAd() {
        return kullanıcıAd;
    }

    public void setKullanıcıAd(String kullanıcıAd) {
        this.kullanıcıAd = kullanıcıAd;
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
            this.btn1 = new JButton("GİRİS YAP");
            this.btn1.setBounds(100,600,100,30);
            this.btn1.addActionListener(new girisGUIAction(this));
            
        }
        return btn1;
    }

    public void setBtn1(JButton btn1) {
        this.btn1 = btn1;
    }

    public JButton getBtn2() {
        if ( this.btn2 == null ){
            this.btn2 = new JButton("KAYIT OL");
            this.btn2.setBounds(550,600,100,30);
            this.btn2.addActionListener(new girisGUIAction(this));
        }
        return btn2;
    }

    public void setBtn2(JButton btn2) {
        this.btn2 = btn2;
    }

    public JTextField getTxt1() {
        if( this.txt1 == null ){
            this.txt1 = new JTextField();
            this.txt1.setBounds(300, 200, 200, 30);
            
        }
        return txt1;
    }

    public void setTxt1(JTextField txt1) {
        this.txt1 = txt1;
    }
    

    public  JTextField getTxt2() {
        if( this.txt2 == null ){
            this.txt2 = new JTextField();
            this.txt2.setBounds(300, 250, 200, 30);
            
        }
        return txt2;
    }

    public void setTxt2(JTextField txt2) {
        this.txt2 = txt2;
    }
    
    public JLabel getLbl1() {
        if( this.lbl1 == null ){
            this.lbl1 = new JLabel("E-POSTA");
            this.lbl1.setBounds(200, 200, 200, 30);
            this.lbl1.setFont(new Font("Arial",Font.BOLD,13));
            this.lbl1.setForeground(Color.WHITE);  
        }
        
    
        return lbl1;
    }

    public void setLbl1(JLabel lbl1) {
        this.lbl1 = lbl1;
    }
    public JLabel getLbl2() {
        if( this.lbl2 == null ){
            this.lbl2 = new JLabel("ŞİFRE");
            this.lbl2.setBounds(200, 250, 200, 30);
            this.lbl2.setFont(new Font("Arial",Font.BOLD,13));
            this.lbl2.setForeground(Color.WHITE);
            
        }
        return lbl2;
    }

    public void setLbl2(JLabel lbl2) {
        this.lbl2 = lbl2;
    }

    
    
    
    

    public ImageIcon getImageicon() {
        if(imageicon==null)
        {
            this.imageicon=new ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\TıyatroOtomasyonu\\gorsel\\perde.png");
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

package tıyatrootomasyonu.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;

 
public class biletAlGUI {
    
    private String ad;
    private String soyAd;
    private String eposta;
    private String sifre;

    
    
    private JPanel pnl;
    private JButton btn1;

    
    private JTextField txt1;
    private JTextField txt2;
    private JTextField txt3;
    private JTextField txt4;

    private JFrame window;
    private JLabel lbl1;
    private JLabel lbl2;
    private JLabel lbl3;
    private JLabel lbl4;
    private ImageIcon imageicon;
    private Image image;
    private JLabel fotografEtiket;
    
    
    public biletAlGUI() {
        
        
    }
    
    public void build()
    {
        
        this.getPnl().add(this.getTxt1());
        this.getPnl().add(this.getTxt2());
        this.getPnl().add(this.getTxt3());
        this.getPnl().add(this.getTxt4());
        this.getPnl().add(this.getLbl1());
        this.getPnl().add(this.getLbl2());
        this.getPnl().add(this.getLbl3());
        this.getPnl().add(this.getLbl4());
        this.getPnl().add(this.getBtn1());
        this.getPnl().add(getFotografEtiket());
        this.getWindow().setContentPane(this.getPnl());
        this.getWindow().setLayout(null);
        this.getWindow().setVisible(true);
        
    }

    

    
    
    
    public JFrame getWindow() {
        if (this.window==null)
        {
            window=new JFrame("BİLET SATIŞ");
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
            this.btn1 = new JButton("ONAYLA");
            this.btn1.setBounds(600,600,100,30);
            this.btn1.addActionListener(new biletAlGUIAction(this));
            
        }
        return btn1;
    }

    public void setBtn1(JButton btn1) {
        this.btn1 = btn1;
    }

    

    public JTextField getTxt1() {
        if( this.txt1 == null ){
            this.txt1 = new JTextField();
            this.txt1.setBounds(300, 300, 200, 30);
            
        }
        return txt1;
    }

    public void setTxt1(JTextField txt1) {
        this.txt1 = txt1;
    }

    public  JTextField getTxt2() {
        if( this.txt2 == null ){
            this.txt2 = new JTextField();
            this.txt2.setBounds(300, 350, 200, 30);
            
        }
        return txt2;
    }

    public void setTxt2(JTextField txt2) {
        this.txt2 = txt2;
    }
    public JTextField getTxt3() {
        if( this.txt3 == null ){
            this.txt3 = new JTextField();
            this.txt3.setBounds(300, 400, 200, 30);
            
        }
        return txt3;
    }

    public void setTxt3(JTextField txt3) {
        this.txt3 = txt3;
    }

    public JTextField getTxt4() {
        if( this.txt4 == null ){
            this.txt4 = new JTextField();
            this.txt4.setBounds(300, 450, 200, 30);
            
        }
        return txt4;
    }

    public void setTxt4(JTextField txt4) {
        this.txt4 = txt4;
    }
    
     public JLabel getLbl1() {
         if( this.lbl1 == null ){
            this.lbl1 = new JLabel("ID");
            this.lbl1.setBounds(200, 300, 200, 30);
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
            this.lbl2 = new JLabel("KART NO");
            this.lbl2.setBounds(200, 350, 200, 30);
            this.lbl2.setFont(new Font("Arial",Font.BOLD,13));
            this.lbl2.setForeground(Color.WHITE);  
            
        }
        return lbl2;
    }

    public void setLbl2(JLabel lbl2) {
        this.lbl2 = lbl2;
    }

    public JLabel getLbl3() {
        if( this.lbl3 == null ){
            this.lbl3 = new JLabel("KART SAHİBİ");
            this.lbl3.setBounds(200, 400, 200, 30);
            this.lbl3.setFont(new Font("Arial",Font.BOLD,13));
            this.lbl3.setForeground(Color.WHITE);  
            
        }
        return lbl3;
    }

    public void setLbl3(JLabel lbl3) {
        this.lbl3 = lbl3;
    }

    public JLabel getLbl4() {
        if( this.lbl4 == null ){
            this.lbl4 = new JLabel("CVC");
            this.lbl4.setBounds(200, 450, 200, 30);
            this.lbl4.setFont(new Font("Arial",Font.BOLD,13));
            this.lbl4.setForeground(Color.WHITE);  
            
        }
        return lbl4;
    }

    public void setLbl4(JLabel lbl4) {
        this.lbl4 = lbl4;
    }
    public ImageIcon getImageicon() {
        if(imageicon==null)
        {
            this.imageicon=new ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\TıyatroOtomasyonu\\gorsel\\Theatre-paly-765x510.jpg");
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


package tıyatrootomasyonu.entity;
import javax.swing.*;


public class giris {
    private String kullanıcıAd;
    private String sifre;
    private JFrame window;
    private JPanel mainPanel;
    private JLabel blockName;
    private JTextField block;
    private JButton button;
    public void build()
    {
        this.getWindow().setContentPane(this.getMainPanel());
        this.getMainPanel().add(this.getBlockName());
        this.getMainPanel().add(this.getBlock());
        this.getMainPanel().add(this.getButton());
        this.getWindow().setVisible(true);
        this.getWindow().setBounds(500,500 , 300, 200);
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

    public JFrame getWindow() {
        if (this.window == null){
            window = new JFrame();
            window.setBounds(100,100,200,120);
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
        }
        return window;
    }

    public void setWindow(JFrame window) {
        this.window = window;
    }

    public JPanel getMainPanel() {
        if ( mainPanel == null ){
            mainPanel = new JPanel();
            mainPanel.setLayout(new BoxLayout(mainPanel,BoxLayout.LINE_AXIS));
            
        }
        return mainPanel;
    }

    public void setMainPanel(JPanel mainPanel) {
        this.mainPanel = mainPanel;
    }

    public JLabel getBlockName() {
        if ( blockName == null ){
            blockName = new JLabel();
            
        }
        return blockName;
    }

    public void setBlockName(JLabel blockName) {
        this.blockName = blockName;
    }

    public JTextField getBlock() {
        if ( block == null ){
            block = new JTextField();
        }
        return block;
    }

    public void setBlock(JTextField block) {
        this.block = block;
    }

    public JButton getButton() {
        if ( button == null ){
            button = new JButton("bas");
        }
        return button;
    }

    public void setButton(JButton button) {
        this.button = button;
    }
    
    
    
    
}

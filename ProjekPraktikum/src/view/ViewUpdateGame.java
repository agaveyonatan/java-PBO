package view;





import javax.swing.*;
import java.awt.*;

public class ViewUpdateGame extends JFrame{
    public Font fjudul ;
    public JLabel ljudul, lnama, lpublisher,lharga,ldeskripsi;
    public JTextField tfnama, tfpublisher , tfharga, tfdeskripsi; 
    public JButton btnedit, btnkembali ; 
    
    public ViewUpdateGame () { 
        fjudul = new Font("Tahoma", Font.BOLD + Font.ITALIC, 21);
        
        ljudul = new JLabel("Edit Game"); ljudul.setFont(fjudul);
        lnama = new JLabel("Nama Game"); 
        lpublisher = new JLabel("Publisher Game");
        lharga = new JLabel("Harga ");
        ldeskripsi = new JLabel("Deskripsi Game "); 
        tfnama = new JTextField();
        tfpublisher = new JTextField();
        tfharga = new JTextField();
        tfdeskripsi = new JTextField();
        btnedit = new JButton("Edit");
        btnkembali = new JButton("Cancel");

        setTitle("Legend");
        setVisible(false);
        setLayout(null);
        setSize(360,360);
        setLocationRelativeTo(null);
        getRootPane().setDefaultButton(btnedit);

        add(ljudul);
        ljudul.setBounds(125,50,200,20);
        
        add(lnama);
        lnama.setBounds(20,110,100,20);
        add(tfnama);
        tfnama.setBounds(120,110,200,20);
        tfnama.setBackground(Color.BLACK);
        tfnama.setForeground(Color.ORANGE);
        
        add(lpublisher);
        lpublisher.setBounds(20,140,100,20);
        add(tfpublisher);
        tfpublisher.setBounds(120,140,200,20);
        tfpublisher.setBackground(Color.BLACK);
        tfpublisher.setForeground(Color.ORANGE);
        
        add(lharga);
        lharga.setBounds(20,170,100,20);
        add(tfharga);
        tfharga.setBounds(120,170,200,20);
        tfharga.setBackground(Color.BLACK);
        tfharga.setForeground(Color.ORANGE);
        
        add(ldeskripsi);
        ldeskripsi.setBounds(20,200,100,20);
        add(tfdeskripsi);
        tfdeskripsi.setBounds(120,200,200,20);
        tfdeskripsi.setBackground(Color.BLACK);
        tfdeskripsi.setForeground(Color.ORANGE);
        
        add(btnkembali);
        btnkembali.setBounds(75,250,100,30);
        btnkembali.setBackground(Color.BLACK);
        btnkembali.setForeground(Color.RED);
        add(btnedit);
        btnedit.setBounds(185,250,100,30);
        btnedit.setBackground(Color.BLACK);
        btnedit.setForeground(Color.CYAN);
    }
    

}

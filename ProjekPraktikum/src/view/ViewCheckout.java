package view;





import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Agave-PC
 */
public class ViewCheckout extends JFrame {
    public Font fjudul ;
    public JLabel ljudul, lgame, ljenis,lketerangan,lid_game, lid_user,ltanggal,lnama_game,lnama_jenis;
    public JButton btnbuy, btnkembali ; 
    
    public ViewCheckout(){
        lid_game = new JLabel();
        lid_user = new JLabel();
        ltanggal = new JLabel();
        
        fjudul = new Font("Tahoma", Font.BOLD + Font.ITALIC, 21);
        ljudul = new JLabel("Checkout Game"); ljudul.setFont(fjudul);
        lgame = new JLabel("Nama Game"); 
        ljenis = new JLabel("Jenis Game");
        lketerangan = new JLabel("Apakah Anda Yakin Ingin Membeli?");
        lnama_game = new JLabel();
        lnama_jenis = new JLabel();
        btnbuy = new JButton("Buy");
        btnkembali = new JButton("Cancel");

        setTitle("Legend");
        setVisible(false);
        setLayout(null);
        setSize(360,360);
        setLocationRelativeTo(null);

        add(ljudul);
        ljudul.setBounds(85,50,200,20);
        add(lgame);
        lgame.setBounds(100,110,100,20);
        add(lnama_game);
        lnama_game.setBounds(180,110,200,20);
        add(ljenis);
        ljenis.setBounds(100,140,100,20);
        add(lnama_jenis);
        lnama_jenis.setBounds(180,140,200,20);
        add(lketerangan);
        lketerangan.setBounds(75,220,300,20);
        
        add(btnkembali);
        btnkembali.setBounds(50,250,120,30);
        btnkembali.setBackground(Color.BLACK);
        btnkembali.setForeground(Color.RED);
        
        add(btnbuy);
        btnbuy.setBounds(180,250,120,30);
        btnbuy.setBackground(Color.BLACK);
        btnbuy.setForeground(Color.GREEN);
    }
}

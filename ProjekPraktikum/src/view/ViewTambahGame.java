package view;






import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ViewTambahGame extends JFrame implements ItemListener{
    public Font fjudul,fkata;
    public String jenis [] = {"MMORPG", "CASUAL" , "SPORT", "SIMULATION", "RACING"};
    public JLabel ljudul,lnama, lpublisher, ljenis,lharga,ldeskripsi;
    public JTextField tfnama, tfpublisher, tfharga, tfdeskripsi ; 
    public JComboBox cbjenis ;
    public JButton btntambah,btnbatal;
    //mengambil nama jenisnya
    public JLabel ltextjenis;
    
       public ViewTambahGame () {
           setSize(400,450);
           setVisible(false);
           setDefaultCloseOperation(EXIT_ON_CLOSE);
           setLayout(null);
           setLocationRelativeTo(null);
           setTitle("Legend");
           getRootPane().setDefaultButton(btntambah);
           
           
           fjudul = new Font("Tahoma", Font.BOLD + Font.ITALIC, 21);
           
           ljudul = new JLabel("ADD GAME");  ljudul.setFont(fjudul);
           lnama = new JLabel("Nama Game"); lnama.setFont(new java.awt.Font("Helvetica", 0, 15));
           lpublisher = new JLabel("Publisher Game"); lpublisher.setFont(new java.awt.Font("Helvetica", 0, 15));
           ljenis = new JLabel("Jenis Game"); ljenis.setFont(new java.awt.Font("Helvetica", 0, 15));
           lharga = new JLabel("Harga "); lharga.setFont(new java.awt.Font("Helvetica", 0, 15));
           ldeskripsi = new JLabel("Deskripsi Game "); ldeskripsi.setFont(new java.awt.Font("Helvetica", 0, 15));
           tfnama = new JTextField();
           tfpublisher = new JTextField();
           tfharga = new JTextField();
           tfdeskripsi = new JTextField();
           cbjenis = new JComboBox(jenis);
           btnbatal = new JButton("Cancel");
           btntambah = new JButton("Register");
           ltextjenis = new JLabel();
           cbjenis.addItemListener(this);
           
           add(ljudul);
           add(lnama);
           add(lpublisher);
           add(ljenis);
           add(lharga);
           add(ldeskripsi);
           add(tfnama);
           add(tfpublisher);
           add(tfharga);
           add(tfdeskripsi);
           add(cbjenis);
           add(btnbatal);
           add(btntambah);
           
           add(ltextjenis);
           ltextjenis.setBounds(10,10,200,10);
           ljudul.setBounds(140,30,200,30);
           lnama.setBounds(55,100,120,20);
           tfnama.setBounds(175,100,150,20);
           tfnama.setBackground(Color.BLACK);
           tfnama.setForeground(Color.ORANGE);
           
           lpublisher.setBounds(55,130,120,20);
           tfpublisher.setBounds(175,130,150,20);
           tfpublisher.setBackground(Color.BLACK);
           tfpublisher.setForeground(Color.ORANGE);
           
           ljenis.setBounds(55,160,120,20);
           cbjenis.setBounds(175,160,150,20);
           cbjenis.setBackground(Color.BLACK);
           cbjenis.setForeground(Color.ORANGE);
           
           lharga.setBounds(55,190,120,20);
           tfharga.setBounds(175,190,150,20);
           tfharga.setBackground(Color.BLACK);
           tfharga.setForeground(Color.ORANGE);
           
           ldeskripsi.setBounds(55,220,120,20);
           tfdeskripsi.setBounds(175,220,150,20);
           tfdeskripsi.setBackground(Color.BLACK);
           tfdeskripsi.setForeground(Color.ORANGE);
           
           btntambah.setBounds(195,270,100,30);
           btntambah.setBackground(Color.BLACK);
           btntambah.setForeground(Color.CYAN);
           btnbatal.setBounds(85,270,100,30);
           btnbatal.setBackground(Color.BLACK);
           btnbatal.setForeground(Color.RED);
           
           
       }
     
       //membuat ltextjenis
    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED){
            if (cbjenis.getSelectedIndex() == 0) { 
                ltextjenis.setText("1");
            }
            else if (cbjenis.getSelectedIndex() == 1) { 
                ltextjenis.setText("2");
            }
            else if (cbjenis.getSelectedIndex() == 2) { 
                ltextjenis.setText("3");
            }
            else if (cbjenis.getSelectedIndex() == 3) { 
                ltextjenis.setText("4");
            }
            else if (cbjenis.getSelectedIndex() == 4) { 
                ltextjenis.setText("5");
            }
            
        }
    }
}

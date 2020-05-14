package view;



import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
/**
 *
 * @author Agave-PC
 */
public class ViewDirectoryGame extends JFrame{
    
    public JPanel ppanel= new JPanel();
    public JPanel ppaneldalam = new JPanel();
    public JLabel ljudul, lmenupilihan,lnama,lpublisher,lharga,ldeskripsi,ltanggal,lnamaisi,lpublisherisi,lhargaisi,ldeskripsiisi,ltanggalisi;
    public JTextField tfsearch;
    public Font fjudul,fmenupilihan;
    public JTable tabel ;
    public JButton btnkembali, btnrefresh, btnsearch;
    public DefaultTableModel tabelModel;
    public JScrollPane scrollPane; 
    public Object namaKolom [] =  {"Nama","Publisher","Harga","Deskripsi","Tanggal", ""}; 
    public GroupLayout gppanel,gppaneldalam;
    
    public ViewDirectoryGame(){
        fjudul = new Font("Tahoma", Font.BOLD + Font.ITALIC, 21);
        fmenupilihan = new Font("Tahoma", Font.BOLD + Font.CENTER_BASELINE, 17);

        ljudul = new JLabel("LIST GAME"); ljudul.setFont(fjudul);
        lnama = new JLabel("Nama Game");
        lpublisher = new JLabel("Publisher");
        lharga = new JLabel("Harga");
        ldeskripsi = new JLabel("Deskripsi");
        ltanggal = new JLabel("Tanggal");

        lnamaisi = new JLabel();
        lhargaisi = new JLabel();
        lpublisherisi = new JLabel();
        ldeskripsiisi = new JLabel();
        ltanggalisi = new JLabel();
        //tabel
        tabelModel = new DefaultTableModel(namaKolom,0);
        tabel = new JTable(tabelModel);
        tabel.setBackground(Color.BLACK);
        tabel.setForeground(Color.WHITE);
        scrollPane = new JScrollPane(tabel);
        //button
        btnsearch = new JButton("Search");
        tfsearch = new JTextField();
        btnkembali = new JButton("Back"); 
        btnrefresh = new JButton("Refresh");
        ppanel.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gppanel = new GroupLayout(ppanel);
        ppanel.setLayout(gppanel);
        ppaneldalam.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detailed", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        gppaneldalam = new GroupLayout(ppaneldalam);
        ppaneldalam.setLayout(gppaneldalam);
        lmenupilihan = new JLabel("SELECTED LIST"); lmenupilihan.setFont(fmenupilihan);

        setTitle("Legend");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(false);
        setLayout(null);
        setSize(900,600);
        setLocationRelativeTo(null);

        add(ppanel);
        ppanel.add(lmenupilihan);
        ppanel.add(btnkembali);
        ppanel.add(btnrefresh);
        ppanel.add(ppaneldalam);
        ppaneldalam.add(lnama);
        ppaneldalam.add(lpublisher);
        ppaneldalam.add(lharga);
        ppaneldalam.add(ldeskripsi);
        ppaneldalam.add(ltanggal);
        ppaneldalam.add(lnamaisi);
        ppaneldalam.add(lpublisherisi);
        ppaneldalam.add(lhargaisi);
        ppaneldalam.add(ldeskripsiisi);
        ppaneldalam.add(ltanggalisi);
        add(ljudul);
        add(scrollPane);
        add(btnsearch);
        add(tfsearch);

        ppanel.setBounds(540,50,330,480);
        ppanel.setBackground(Color.BLACK);
        ppanel.setForeground(Color.WHITE);
        ppaneldalam.setBounds(30,70,275,200);
        ppaneldalam.setBackground(Color.BLACK);
        ppaneldalam.setForeground(Color.WHITE);
        lmenupilihan.setBounds(115,30,170,20);
        lmenupilihan.setForeground(Color.WHITE);

        btnkembali.setBounds(30,320,130,30);
        btnkembali.setBackground(Color.BLACK);
        btnkembali.setForeground(Color.getHSBColor(446, 240, 640));
        
        btnrefresh.setBounds(175,320,130,30);
        btnrefresh.setBackground(Color.BLACK);
        btnrefresh.setForeground(Color.WHITE);
        
        ljudul.setBounds(220,20,160,20);

        scrollPane.setBounds(50,100,470,430);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setBackground(Color.BLACK);
        scrollPane.setForeground(Color.WHITE);
        
        tfsearch.setBounds(50,60,370,20);
        tfsearch.setBackground(Color.BLACK);
        tfsearch.setForeground(Color.ORANGE);
        btnsearch.setBounds(420,60,100,20);
        btnsearch.setBackground(Color.BLACK);
        btnsearch.setForeground(Color.ORANGE);
        
        lnama.setBounds(20,50,80,20);
        lnama.setBackground(Color.BLACK);
        lnama.setForeground(Color.WHITE);
        
        lpublisher.setBounds(20,80,80,20);
        lpublisher.setBackground(Color.BLACK);
        lpublisher.setForeground(Color.WHITE);
        
        lharga.setBounds(20,110,80,20);
        lharga.setBackground(Color.BLACK);
        lharga.setForeground(Color.WHITE);
        
        ldeskripsi.setBounds(20,140,80,20);
        ldeskripsi.setBackground(Color.BLACK);
        ldeskripsi.setForeground(Color.WHITE);
        
        ltanggal.setBounds(20,170,80,20);
        ltanggal.setBackground(Color.BLACK);
        ltanggal.setForeground(Color.WHITE);
        
        lnamaisi.setBounds(100,50,200,20);
        lnamaisi.setBackground(Color.BLACK);
        lnamaisi.setForeground(Color.WHITE);
        
        lpublisherisi.setBounds(100,80,200,20);
        lpublisherisi.setBackground(Color.BLACK);
        lpublisherisi.setForeground(Color.WHITE);
        
        lhargaisi.setBounds(100,110,200,20);
        lhargaisi.setBackground(Color.BLACK);
        lhargaisi.setForeground(Color.WHITE);
        
        ldeskripsiisi.setBounds(100,140,200,20);
        ldeskripsiisi.setBackground(Color.BLACK);
        ldeskripsiisi.setForeground(Color.WHITE);
        
        ltanggalisi.setBounds(100,170,200,20);
        ltanggalisi.setBackground(Color.BLACK);
        ltanggalisi.setForeground(Color.WHITE);
    }
}

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


public class ViewAdminGameDetailed extends JFrame{
    

    public JPanel ppanel= new JPanel();
    public JPanel ppaneldalam = new JPanel();
    public JLabel ljudul, lmenupilihan,lnama,ljenis,lpublisher,lharga,ldeskripsi,lnamaisi,ljenisisi,lpublisherisi,lhargaisi,ldeskripsiisi,lid;
    public JTextField tfsearch;
    public Font fjudul,fmenupilihan;
    public JTable tabel ;
    public JButton btntambah , btnkembali, btnhapus, btnupdate,btnrefresh,btnsearch;
    public DefaultTableModel tabelModel;
    public JScrollPane scrollPane; 
    public Object namaKolom [] =  {"Nama","Jenis","Publisher","Harga","Deskripsi",""} ; 
    public GroupLayout gppanel,gppaneldalam;
    
    public ViewAdminGameDetailed () {
            fjudul = new Font("Tahoma", Font.BOLD + Font.ITALIC, 24);
            fmenupilihan = new Font("Tahoma", Font.BOLD + Font.CENTER_BASELINE, 20);
            
            ljudul = new JLabel("LIST GAME"); ljudul.setFont(fjudul);
            lnama = new JLabel("Nama Game");
            ljenis = new JLabel("Jenis Game");
            lpublisher = new JLabel("Publisher");
            lharga = new JLabel("Harga");
            ldeskripsi = new JLabel("Deskripsi");
            
            lid = new JLabel();
            lnamaisi = new JLabel();
            ljenisisi = new JLabel();
            lhargaisi = new JLabel();
            lpublisherisi = new JLabel();
            ldeskripsiisi = new JLabel();
            //tabel
            tabelModel = new DefaultTableModel(namaKolom,0);
            tabel = new JTable(tabelModel);
            tabel.setBackground(Color.BLACK);
            tabel.setForeground(Color.WHITE);
            scrollPane = new JScrollPane(tabel);
            //button
            btnsearch = new JButton("Search");
            tfsearch = new JTextField();
            btntambah = new JButton("Add Game");
            btnkembali = new JButton("Back"); 
            btnhapus = new JButton("Delete"); 
            btnupdate = new JButton("Update");
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
            ppanel.add(btntambah);
            ppanel.add(btnkembali);
            ppanel.add(btnhapus);
            ppanel.add(btnupdate);
            ppanel.add(btnrefresh);
            ppanel.add(ppaneldalam);
            ppaneldalam.add(lnama);
            ppaneldalam.add(ljenis);
            ppaneldalam.add(lpublisher);
            ppaneldalam.add(lharga);
            ppaneldalam.add(ldeskripsi);
            ppaneldalam.add(lnamaisi);
            ppaneldalam.add(ljenisisi);
            ppaneldalam.add(lpublisherisi);
            ppaneldalam.add(lhargaisi);
            ppaneldalam.add(ldeskripsiisi);
            add(ljudul);
            add(scrollPane);
            add(btnsearch);
            add(tfsearch);
            
            ppanel.setBounds(540,50,330,480);
            ppanel.setBackground(Color.BLACK);
            ppaneldalam.setBounds(30,70,275,200);
            ppaneldalam.setBackground(Color.BLACK);
            ppaneldalam.setForeground(Color.WHITE);
            lmenupilihan.setBounds(100,30,170,20);
            lmenupilihan.setForeground(Color.WHITE);
            
            btntambah.setBounds(175,400,100,30);
            btntambah.setBackground(Color.DARK_GRAY);
            btntambah.setForeground(Color.GREEN);
            
            btnkembali.setBounds(65,400,100,30);
            btnkembali.setBackground(Color.DARK_GRAY);
            btnkembali.setForeground(Color.getHSBColor(446, 240, 640));
            
            btnhapus.setBounds(175,340,100,30);
            btnhapus.setBackground(Color.DARK_GRAY);
            btnhapus.setForeground(Color.RED);
            
            btnupdate.setBounds(65,340,100,30);
            btnupdate.setBackground(Color.DARK_GRAY);
            btnupdate.setForeground(Color.CYAN);
            
            btnrefresh.setBounds(120,280,100,20);
            btnrefresh.setBackground(Color.DARK_GRAY);
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
            lnama.setForeground(Color.WHITE);
            ljenis.setBounds(20,80,80,20);
            ljenis.setForeground(Color.WHITE);
            lpublisher.setBounds(20,110,80,20);
            lpublisher.setForeground(Color.WHITE);
            lharga.setBounds(20,140,80,20);
            lharga.setForeground(Color.WHITE);
            ldeskripsi.setBounds(20,170,80,20);
            ldeskripsi.setForeground(Color.WHITE);

            lnamaisi.setBounds(100,50,200,20);
            lnamaisi.setForeground(Color.WHITE);
            ljenisisi.setBounds(100,80,200,20);
            ljenisisi.setForeground(Color.WHITE);
            lpublisherisi.setBounds(100,110,200,20);
            lpublisherisi.setForeground(Color.WHITE);
            lhargaisi.setBounds(100,140,200,20);
            lhargaisi.setForeground(Color.WHITE);
            ldeskripsiisi.setBounds(100,170,200,20);
            ldeskripsiisi.setForeground(Color.WHITE);

            btnhapus.setEnabled(false);
            btnupdate.setEnabled(false);
            
            
    }
}


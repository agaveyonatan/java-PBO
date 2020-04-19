/**
 *
 * @author Agave-PC
 */
import java.awt.Color;
import static java.awt.SystemColor.window;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

public class ViewPraktikum extends JFrame {
    JLabel lJudul = new JLabel("CRUD Contact");
    
    JLabel lNomor = new JLabel("Nomor");
    JTextField tfnomor = new JTextField();
    
    JLabel lNama = new JLabel("Nama");
    JTextField tfNama = new JTextField();  
    
    JLabel lUmur = new JLabel("Umur");
    JTextField tfUmur = new JTextField();
    
    JLabel lEmail = new JLabel("Email");
    JTextField tfEmail = new JTextField();  

    JButton btnInputPanel = new JButton("Input");
    JButton btnCancelPanel = new JButton("Cancel");
    JButton btnUpdatePanel = new JButton("Update");
    JButton btnDeletePanel = new JButton("Delete");

    JTable tabel;
    DefaultTableModel tableModel;
    JScrollPane scrollPane;
    Object namaKolom[] = {"Nomor HP", "Nama","Umur", "Email"};
    
    public ViewPraktikum() {

        tableModel = new DefaultTableModel(namaKolom, 0);
        tabel = new JTable(tableModel);
        scrollPane = new JScrollPane(tabel);

        setTitle("MVC");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(655, 650);

        ButtonGroup group = new ButtonGroup();

        //TABEL
        add(scrollPane);
        scrollPane.setBounds(30, 235, 580, 300);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        add(lJudul);
        lJudul.setBounds(230, 30, 200, 20);
        lJudul.setFont(new java.awt.Font("Times New Roman", 0, 25));
        
        add(lNomor);
        lNomor.setBounds(35, 80, 90, 20);
        add(tfnomor);
        tfnomor.setBounds(90, 80, 170, 20);
        
        add(lNama);
        lNama.setBounds(35, 115, 90, 20);
        add(tfNama);
        tfNama.setBounds(90, 115, 170, 20);
        
        add(lUmur);
        lUmur.setBounds(360, 80, 90, 20);
        add(tfUmur);
        tfUmur.setBounds(435, 80, 170, 40);
        
        add(lEmail);
        lEmail.setBounds(35, 150, 90, 20);
        add(tfEmail);
        tfEmail.setBounds(90, 150, 170, 20);
        
        add(btnInputPanel);
        btnInputPanel.setBounds(30, 200, 90, 25);
        
        add(btnUpdatePanel);
        btnUpdatePanel.setBounds(170, 200, 90, 25);
        
        add(btnDeletePanel);
        btnDeletePanel.setBounds(310, 200, 90, 25);
        
        add(btnCancelPanel);
        btnCancelPanel.setBounds(450, 200, 90, 25);
    }
    
    public String getNomor() {
        return tfnomor.getText();
    }

    public String getNamaMhs() {
        return tfNama.getText();
    }

    public String getUmurMhs() {
        return tfUmur.getText();
    }
    
    public String getEmail() {
        return tfEmail.getText();
    }
}
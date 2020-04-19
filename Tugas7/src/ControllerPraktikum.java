/**
 *
 * @author Agave-PC
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class ControllerPraktikum {
    
    ModelPraktikum modelpraktikum;
    ViewPraktikum viewpraktikum;
    
    public ControllerPraktikum(ModelPraktikum modelpraktikum, ViewPraktikum viewpraktikum) {
        this.modelpraktikum = modelpraktikum;
        this.viewpraktikum = viewpraktikum;
        
        if (modelpraktikum.getBanyakData() != 0) {
            String dataContact[][] = modelpraktikum.readContact();
            viewpraktikum.tabel.setModel((new JTable(dataContact, viewpraktikum.namaKolom)).getModel());
            listenerTabel();
        } 
        
        viewpraktikum.btnInputPanel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nomor = viewpraktikum.getNomor();
                String nama = viewpraktikum.getNamaMhs();
                String umur = viewpraktikum.getUmurMhs();
                String email = viewpraktikum.getEmail();

                modelpraktikum.insertContact(nomor, nama, umur, email);

                String dataContact[][] = modelpraktikum.readContact();
                viewpraktikum.tabel.setModel(new JTable(dataContact, viewpraktikum.namaKolom).getModel());
                listenerTabel();
            }
        });
        
        viewpraktikum.btnUpdatePanel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nomor = viewpraktikum.getNomor();
                String nama = viewpraktikum.getNamaMhs();
                String umur = viewpraktikum.getUmurMhs();
                String email = viewpraktikum.getEmail();

                modelpraktikum.updateContact(nomor, nama, umur, email);
                
                String dataContact[][] = modelpraktikum.readContact();
                viewpraktikum.tabel.setModel(new JTable(dataContact, viewpraktikum.namaKolom).getModel());
                listenerTabel();
            }
        });
        
        viewpraktikum.btnDeletePanel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nomor = viewpraktikum.getNomor();
                String nama = viewpraktikum.getNamaMhs();
                String umur = viewpraktikum.getUmurMhs();
                String email = viewpraktikum.getEmail();

                modelpraktikum.deleteContact(nomor);
                
                String dataContact[][] = modelpraktikum.readContact();
                viewpraktikum.tabel.setModel(new JTable(dataContact, viewpraktikum.namaKolom).getModel());
                cancelForm();
                listenerTabel();
            }
        });
        
        viewpraktikum.btnCancelPanel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cancelForm();
                
                String dataContact[][] = modelpraktikum.readContact();
                viewpraktikum.tabel.setModel(new JTable(dataContact, viewpraktikum.namaKolom).getModel());
                listenerTabel();
            }
        });
    }
    
    public void listenerTabel() {
        String data[][] = modelpraktikum.readContact();
        String dataContact[][] = modelpraktikum.readContact();
        viewpraktikum.tabel.setModel(new JTable(dataContact, viewpraktikum.namaKolom).getModel());
        viewpraktikum.tabel.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int row = viewpraktikum.tabel.getSelectedRow();
                int col = viewpraktikum.tabel.getSelectedColumn();

                viewpraktikum.tfnomor.setText(data[row][0]);
                viewpraktikum.tfnomor.setEnabled(false);
                viewpraktikum.tfNama.setText(data[row][1]);
                viewpraktikum.tfUmur.setText(data[row][2]);
                viewpraktikum.tfEmail.setText(data[row][3]);
            }
        });
    }
    
    public void cancelForm(){
        viewpraktikum.tfnomor.setText("");
        viewpraktikum.tfnomor.setEnabled(true);
        viewpraktikum.tfNama.setText("");
        viewpraktikum.tfUmur.setText("");
        viewpraktikum.tfEmail.setText("");
    }   
    
}
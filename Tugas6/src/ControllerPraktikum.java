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
            String dataMahasiswa[][] = modelpraktikum.readMahasiswa();
            viewpraktikum.tabel.setModel((new JTable(dataMahasiswa, viewpraktikum.namaKolom)).getModel());
            listenerTabel();
        } 
        
        viewpraktikum.btnInputPanel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nim = viewpraktikum.getNim();
                String nama = viewpraktikum.getNamaMhs();
                String alamat = viewpraktikum.getAlamatMhs();
                String email = viewpraktikum.getEmail();

                modelpraktikum.insertMahasiswa(nim, nama, alamat, email);

                String dataMahasiswa[][] = modelpraktikum.readMahasiswa();
                viewpraktikum.tabel.setModel(new JTable(dataMahasiswa, viewpraktikum.namaKolom).getModel());
                listenerTabel();
            }
        });
        
        viewpraktikum.btnUpdatePanel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nim = viewpraktikum.getNim();
                String nama = viewpraktikum.getNamaMhs();
                String alamat = viewpraktikum.getAlamatMhs();
                String email = viewpraktikum.getEmail();

                modelpraktikum.updateMahasiswa(nim, nama, alamat, email);
                
                String dataMahasiswa[][] = modelpraktikum.readMahasiswa();
                viewpraktikum.tabel.setModel(new JTable(dataMahasiswa, viewpraktikum.namaKolom).getModel());
                listenerTabel();
            }
        });
        
        viewpraktikum.btnDeletePanel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nim = viewpraktikum.getNim();
                String nama = viewpraktikum.getNamaMhs();
                String alamat = viewpraktikum.getAlamatMhs();
                String email = viewpraktikum.getEmail();

                modelpraktikum.deleteMahasiswa(nim);
                
                String dataMahasiswa[][] = modelpraktikum.readMahasiswa();
                viewpraktikum.tabel.setModel(new JTable(dataMahasiswa, viewpraktikum.namaKolom).getModel());
                cancelForm();
                listenerTabel();
            }
        });
        
        viewpraktikum.btnCancelPanel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cancelForm();
                
                String dataMahasiswa[][] = modelpraktikum.readMahasiswa();
                viewpraktikum.tabel.setModel(new JTable(dataMahasiswa, viewpraktikum.namaKolom).getModel());
                listenerTabel();
            }
        });
    }
    
    public void listenerTabel() {
        String data[][] = modelpraktikum.readMahasiswa();
        String dataMahasiswa[][] = modelpraktikum.readMahasiswa();
        viewpraktikum.tabel.setModel(new JTable(dataMahasiswa, viewpraktikum.namaKolom).getModel());
        viewpraktikum.tabel.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int row = viewpraktikum.tabel.getSelectedRow();
                int col = viewpraktikum.tabel.getSelectedColumn();

                viewpraktikum.tfnim.setText(data[row][0].toString());
                viewpraktikum.tfnim.setEnabled(false);
                viewpraktikum.tfNama.setText(data[row][1].toString());
                viewpraktikum.tfAlamat.setText(data[row][2].toString());
                viewpraktikum.tfEmail.setText(data[row][3].toString());
            }
        });
    }
    
    public void cancelForm(){
        viewpraktikum.tfnim.setText("");
        viewpraktikum.tfnim.setEnabled(true);
        viewpraktikum.tfNama.setText("");
        viewpraktikum.tfAlamat.setText("");
        viewpraktikum.tfEmail.setText("");
    }   
    
}

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class InputDataMahasiswa extends JFrame {
 
    String DBurl = "jdbc:mysql://localhost/praktikum";
    String DBusername = "root";
    String DBpassword = "";
    Connection koneksi;
    Statement statement;
    
    JLabel lNim = new JLabel("NIM");
    JLabel lNama = new JLabel("Nama");
    JLabel lAlamat = new JLabel("Alamat");
    JTextField tfNim = new JTextField(9);
    JTextField tfNama = new JTextField(50);
    JTextField tfAlamat = new JTextField(50);
    JButton bSimpan = new JButton("Simpan");
    JPanel panelForm = new JPanel(new GridLayout(3, 2));
    JPanel panelTombol = new JPanel(new FlowLayout());
    
    public InputDataMahasiswa() {
        setTitle("Coba Database!");
        setSize(400, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        
        setLayout(new BorderLayout());
        add(panelForm, BorderLayout.CENTER);
        panelForm.add(lNim);
        panelForm.add(tfNim);
        panelForm.add(lNama);
        panelForm.add(tfNama);
        panelForm.add(lAlamat);
        panelForm.add(tfAlamat);
        add(panelTombol, BorderLayout.SOUTH);
        panelTombol.add(bSimpan);
        
        bSimpan.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                masukkanData();
            }          });    }
    public void masukkanData() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection(DBurl, DBusername, DBpassword);
            statement = koneksi.createStatement();
            statement.executeUpdate("INSERT INTO `mahasiswa`(`NIM`, `Nama`, `Alamat`) " + "VALUES ('"+ tfNim.getText() +"','"+ tfNama.getText() +"','"+ tfAlamat.getText() +"')");
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan!", "Hasil",JOptionPane.INFORMATION_MESSAGE);            
            statement.close();
            koneksi.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan!", "Hasil", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver Tidak Ditemukan!", "Hasil", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void main(String[] args) {
        new InputDataMahasiswa();
    }
}

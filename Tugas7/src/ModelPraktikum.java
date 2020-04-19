/**
 *
 * @author Agave-PC
 */
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ModelPraktikum {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/dbcontact";
    static final String USER = "root";
    static final String PASS = "";

    Connection koneksi;
    Statement statement;
    
    public ModelPraktikum() {
        try {
            Class.forName(JDBC_DRIVER);
            koneksi = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connection Success");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println("Connection Error");
        }
    }
    
    public void insertContact(String nomor, String nama, String umur, String email) {
        try {
            if ("".equals(nomor) || "".equals(nama) || "".equals(umur) || "".equals(email)) {
                System.out.println("Input Error");
                JOptionPane.showMessageDialog(null, "Some Field Empty");
            } else {
                String query = "INSERT INTO `contact`(`nomor`, `nama`, `umur`,`email`) VALUES ('" + nomor + "','" + nama + "','" + umur + "','" + email + "')";
                statement = (Statement) koneksi.createStatement();
                statement.executeUpdate(query);
                System.out.println("Input Success");
                JOptionPane.showMessageDialog(null, "Input Success");
            }
        } catch (Exception sql) {
            System.out.println(sql.getMessage());
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }
    
    public void updateContact(String nomor, String nama, String umur, String email) {
        try {
            if ("".equals(nomor)) {
                System.out.println("Update Error");
//                JOptionPane.showMessageDialog(null, "Data tidak boleh kosong");
            } else {
                String query = "UPDATE `contact` SET nama='" + nama + "',umur='" + umur + "',email='" + email
                        + "' WHERE nomor='" + nomor + "'";
                statement = (Statement) koneksi.createStatement();
                statement.executeUpdate(query);
                System.out.println("Edit Success");
                JOptionPane.showMessageDialog(null, "Edit Success");
            }
        } catch (Exception sql) {
            System.out.println(sql.getMessage());
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }
    
    public void deleteContact(String nomor) {
        try {
            if ("".equals(nomor)) {
//                JOptionPane.showMessageDialog(null, "Gagal Dihapus\nPastikan Isi NIM yang ingin dihapus benar !");
            } else {
                String query = "DELETE FROM `contact` WHERE `nomor` ='" + nomor + "'";
                statement = koneksi.createStatement();
                statement.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Delete Success");
            }
        } catch (SQLException sql) {
            System.out.println(sql.getMessage());
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }
    
    public String[][] readContact() {
        try {
            int jmlData = 0;

            String data[][] = new String[getBanyakData()][4];

            String query = "Select * from `contact`";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                data[jmlData][0] = resultSet.getString("nomor");
                data[jmlData][1] = resultSet.getString("nama");
                data[jmlData][2] = resultSet.getString("umur");
                data[jmlData][3] = resultSet.getString("email");
                jmlData++;
            }
            return data;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }

    public int getBanyakData() {
        int jmlData = 0;
        try {
            statement = koneksi.createStatement();
            String query = "Select * from `contact`";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                jmlData++;
            }
            return jmlData;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return 0;
        }
    }
}
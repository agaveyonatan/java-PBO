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
    static final String DB_URL = "jdbc:mysql://localhost/tugas6";
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
    
    public void insertMahasiswa(String nim, String nama, String alamat, String email) {
        try {
            if ("".equals(nim) || "".equals(nama) || "".equals(alamat) || "".equals(email)) {
                System.out.println("Input Error");
                JOptionPane.showMessageDialog(null, "Some Field Empty");
            } else {
                String query = "INSERT INTO `mahasiswa`(`nim`, `nama`, `alamat`,`email`) VALUES ('" + nim + "','" + nama + "','" + alamat + "','" + email + "')";
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
    
    public void updateMahasiswa(String nim, String nama, String alamat, String email) {
        try {
            if ("".equals(nim)) {
                System.out.println("Update Error");
//                JOptionPane.showMessageDialog(null, "Data tidak boleh kosong");
            } else {
                String query = "UPDATE `mahasiswa` SET nama='" + nama + "',alamat='" + alamat + "',email='" + email
                        + "' WHERE nim='" + nim + "'";
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
    
    public void deleteMahasiswa(String nim) {
        try {
            if ("".equals(nim)) {
//                JOptionPane.showMessageDialog(null, "Gagal Dihapus\nPastikan Isi NIM yang ingin dihapus benar !");
            } else {
                String query = "DELETE FROM `mahasiswa` WHERE `nim` ='" + nim + "'";
                statement = koneksi.createStatement();
                statement.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Delete Success");
            }
        } catch (SQLException sql) {
            System.out.println(sql.getMessage());
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }
    
    public String[][] readMahasiswa() {
        try {
            int jmlData = 0;

            String data[][] = new String[getBanyakData()][4];

            String query = "Select * from `mahasiswa`";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                data[jmlData][0] = resultSet.getString("nim");
                data[jmlData][1] = resultSet.getString("nama");
                data[jmlData][2] = resultSet.getString("alamat");
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
            String query = "Select * from `mahasiswa`";
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

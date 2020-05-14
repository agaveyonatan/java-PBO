package model;



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
 
public class ModelProject {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/project_pbo";
    static final String USER = "root";
    static final String PASS = ""; 
    
    Connection koneksi;
    Statement statement;
    
    public ModelProject() {
        try {
            Class.forName(JDBC_DRIVER);
            koneksi = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connection Success");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println("Connection Error");  
        }
    }
    
    public int checkLoginUser (String username , String password) { 
        int user=0 ;
        try {
            String query = "SELECT * FROM user WHERE nama_user='" + username + "' AND password_user='"+password+"' ";
            statement = (Statement) koneksi.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while(rs.next()) {
                user++;
            }
            if (user==1)
            JOptionPane.showMessageDialog(null, "Berhasil Login User!");
            return user ;
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return 0 ;
        }
    }
    
     public int checkLoginAdmin (String nama , String password) { 
         int admin = 0;
        try {
            String query = "SELECT * FROM admin WHERE nama_admin='" +nama+ "' AND password_admin='"+password+"'";
            statement = (Statement) koneksi.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()){ 
                admin++;
            }
            if (admin ==1)
            JOptionPane.showMessageDialog(null, "Berhasil Login Admin!");
            return admin ;
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return 0 ;
        }
    }
     
     //game    
     public int getGame () {
         int jumlahData =0 ;
            try { 
                statement = (Statement) koneksi.createStatement();
                String query = "SELECT * FROM game ";
                ResultSet rs = statement.executeQuery(query);
                while (rs.next() ) { 
                    jumlahData ++ ;
                }
                return jumlahData;
            }
            catch(SQLException e) {
                System.out.println(e.getMessage());
                System.out.println("SQL Eror");
                return 0;
            }
    }
     
     public String[][] readGame () {
         int jumlah = 0;
         try {
             String data[][] = new String[getGame()][6];
             String query = "SELECT * FROM game g INNER JOIN jenis j WHERE g.id_jenis = j.id_jenis";
             ResultSet rs = statement.executeQuery(query);
             while (rs.next()) {
                 data[jumlah][0] = rs.getString("nama_game");
                 data[jumlah][1] = rs.getString("nama_jenis");
                 data[jumlah][2] = rs.getString("publisher_game");
                 data[jumlah][3] = rs.getString("harga_game");
                 data[jumlah][4] = rs.getString("deskripsi_game");
                 data[jumlah][5] = rs.getString("id_game");
                 jumlah++;
             }
             return data;
         }
         catch (SQLException e){
             System.out.println(e.getMessage());
            System.out.println("SQL Eror");
            return null;
         }
     }
     
      public int getDirectory (String id) { 
        int jmlh=0;
        try {
            statement = (Statement) koneksi.createStatement();
             String query = "SELECT * FROM game g INNER JOIN user_pembelian u ON g.id_game = u.id_game WHERE u.id_user = '"+id+"' ";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                jmlh ++;
            }
            return jmlh ;
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "");
            return 0 ;
        }
    }
      
     public String[][] readDirectoryGame (String id) {
         int jumlah = 0;
         try {
             String data[][] = new String[getDirectory(id)][5];
             String query = "SELECT * FROM game g INNER JOIN user_pembelian u ON g.id_game = u.id_game WHERE u.id_user = '"+id+"' ";
             ResultSet rs = statement.executeQuery(query);
             while (rs.next()) {
                 data[jumlah][0] = rs.getString("nama_game");
                 data[jumlah][1] = rs.getString("publisher_game");
                 data[jumlah][2] = rs.getString("harga_game");
                 data[jumlah][3] = rs.getString("deskripsi_game");
                 data[jumlah][4] = rs.getString("tanggal_pembelian");
                 jumlah++;
             }
             return data;
         }
         catch (SQLException e){
             System.out.println(e.getMessage());
            System.out.println("SQL Eror");
            return null;
         }
     }
     
     public void insertGame (String jenis_id ,String nama , String publisher , String harga, String deskripsi) {
         try {
             String query = "INSERT INTO `game` (`id_jenis`,`nama_game`,`publisher_game`,`harga_game`,`deskripsi_game`) "
                + "VALUES ('" + jenis_id + "','" + nama + "','" + publisher + "','" + harga + "','" + deskripsi + "')";
            statement = (Statement) koneksi.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Berhasil Menambahkan Game!");
         }
         catch (SQLException e) {
             JOptionPane.showMessageDialog(null, e.getMessage());
         }
         
     }
     
    public int getBanyakGameSearch (String cari) { 
        int jmlh=0;
        try {
            statement = (Statement) koneksi.createStatement();
            String query = "SELECT * FROM game WHERE nama_game like '%"+cari+"%' OR publisher_game like '%"+cari+"%' OR harga_game like '%"+cari+"%' OR deskripsi_game like '%"+cari+"%' ";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                jmlh ++;
            }
            return jmlh ;
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "List Game yang Dicari Tidak Ditemukan");
            return 0 ;
        }
    }
    
    public String[][] getGameSearch (String cari) {
        try {
            int jmlh = 0 ;
            String data[][] = new String [getBanyakGameSearch(cari)][6] ;
            String query = "SELECT * FROM game g INNER JOIN jenis j ON g.id_jenis = j.id_jenis WHERE g.nama_game like '%"+cari+"%' OR g.publisher_game like '%"+cari+"%' OR g.harga_game like '%"+cari+"%' OR g.deskripsi_game like '%"+cari+"%' ";
            ResultSet rs = statement.executeQuery(query) ;
            while (rs.next()) {
                data[jmlh][0] = rs.getString("nama_game");
                data[jmlh][1] = rs.getString("nama_jenis");
                data[jmlh][2] = rs.getString("publisher_game");
                data[jmlh][3] = rs.getString("harga_game");
                data[jmlh][4] = rs.getString("deskripsi_game");
                data[jmlh][5] = rs.getString("id_game");
                jmlh++;
            }
            return data;
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "List Game yang Dicari Tidak Ditemukan");
            return null;
        }
    }
    
    public int getBanyakGameDirectorySearch (String cari, String id) { 
        int jmlh=0;
        try {
            statement = (Statement) koneksi.createStatement();
            String query = "SELECT * FROM game g LEFT JOIN user_pembelian u ON g.id_game = u.id_game WHERE g.nama_game like '%"+cari+"%' OR g.publisher_game like '%"+cari+"%' OR g.harga_game like '%"+cari+"%' OR g.deskripsi_game like '%"+cari+"%' AND u.id_user = '"+id+"'";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                jmlh ++;
            }
            return jmlh ;
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "List Game yang Dicari Tidak Ditemukan");
            return 0 ;
        }
    }
    
    public String[][] getGameDirectorySearch (String cari, String id) {
        try {
            int jmlh = 0 ;
            String data[][] = new String [getBanyakGameDirectorySearch(cari, id)][6] ;
            String query = "SELECT * FROM game g INNER JOIN user_pembelian u ON g.id_game = u.id_game WHERE g.nama_game like '%"+cari+"%' OR g.publisher_game like '%"+cari+"%' OR g.harga_game like '%"+cari+"%' OR g.deskripsi_game like '%"+cari+"%' AND u.id_user='"+id+"'";
            ResultSet rs = statement.executeQuery(query) ;
            while (rs.next()) {
                data[jmlh][0] = rs.getString("nama_game");
                data[jmlh][1] = rs.getString("publisher_game");
                data[jmlh][2] = rs.getString("harga_game");
                data[jmlh][3] = rs.getString("deskripsi_game");
                data[jmlh][4] = rs.getString("tanggal_pembelian");
                jmlh++;
            }
            return data;
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "List Game yang Dicari Tidak Ditemukan");
            return null;
        }
    }
    
    public void hapusGame(String id) {
        try{
            statement = (Statement) koneksi.createStatement();
            String query = "DELETE FROM game WHERE `id_game` = '" +id+ "'";
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Game Berhasil Dihapus");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println("Tidak ada data");
        }
    }
    
    public void updateGame (String id_game,String nama, String publisher, String harga, String deskripsi){
        try{ 
            statement = (Statement) koneksi.createStatement();
            String query = "UPDATE `game` SET `nama_game` ='"+nama+"', `publisher_game` ='"+publisher+"', `harga_game` ='"+harga+"', `deskripsi_game` ='"+deskripsi+"' "+"WHERE `id_game` ='"+id_game+"'";
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Game Berhasil Diupdate");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void registerUser (String username ,String password , String gender , String email, String contact) {
         try {
             String query = "INSERT INTO `user` (`nama_user`,`password_user`,`email_user`,`jenis_kelamin_user`, `nomor_hp_user`)"
                + "VALUES ('" + username + "','" + password + "','" + email + "','" + gender + "','" + contact + "')";
            statement = (Statement) koneksi.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Berhasil Menambahkan User!");
         }
         catch (SQLException e) {
             JOptionPane.showMessageDialog(null, e.getMessage());
         }
         
    }
    
     public void insertTransaction (String id_user ,String id_game , String tanggal) {
         try {
             String query = "INSERT INTO `user_pembelian` (`id_user`,`id_game`,`tanggal_pembelian`)"
                + "VALUES ('" + id_user + "','" + id_game + "','" + tanggal + "')";
            statement = (Statement) koneksi.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Berhasil Menambahkan Transaksi!");
         }
         catch (SQLException e) {
             JOptionPane.showMessageDialog(null, e.getMessage());
         }
         
    }
     
     public String getIdUser (String nama) {
         int jumlah = 0;
         try {
             String iduser = new String();
             String query = "SELECT * FROM user WHERE nama_user = '"+nama+ "'";
             ResultSet rs = statement.executeQuery(query);
             while (rs.next()) {
                 iduser = rs.getString("id_user");
                 jumlah++;
             }
             return iduser;
         }
         catch (SQLException e){
             System.out.println(e.getMessage());
            System.out.println("SQL Eror");
            return null;
         }
     }
}

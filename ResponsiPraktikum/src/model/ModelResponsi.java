
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
 
public class ModelResponsi {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/responsi_pbo";
    static final String USER = "root";
    static final String PASS = ""; 
    
    Connection koneksi;
    Statement statement;
    
    //CONNECTION CHECK
    public ModelResponsi() {
        try {
            Class.forName(JDBC_DRIVER);
            koneksi = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connection Success");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println("Connection Error");  
        }
    }
    
    //LOGIN ADMIN
    public int checkLoginAdmin (String username , String password) { 
        int admin = 0;
        try {
            String query = "SELECT * FROM admin WHERE username='" +username+ "' AND password='"+password+"'";
            statement = (Statement) koneksi.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()){ 
                admin++;
            }
            if (admin ==1)
            JOptionPane.showMessageDialog(null, "Berhasil Login!");
            return admin ;
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return 0 ;
        }
    }
    
    //INSERT LOAN
    public void insertLoan (String IDM ,String Name , String IDB , String BTitle, String Date) {
        try {
            String query = "INSERT INTO `loan` (`id_member`,`member_name`,`id_book`,`book_title`,`loan_date`)"
                + "VALUES ('" + IDM + "','" + Name + "','" + IDB + "','" + BTitle + "','" + Date + "')";
            statement = (Statement) koneksi.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Insert Loan Success!");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }   
    }
    
    //GET RECORD   
    public int getRecord(){
        int total=0 ;
            try { 
                statement = (Statement) koneksi.createStatement();
                String query = "SELECT * FROM loan";
                ResultSet rs = statement.executeQuery(query);
                while (rs.next() ) { 
                    total ++ ;
                }
                return total;
            }
            catch(SQLException e) {
                System.out.println(e.getMessage());
                System.out.println("SQL Eror");
                return 0;
            }
    }
    
    //READ RECORD
    public String[][] readRecord(){
         int total = 0;
         try {
            String data[][] = new String[getRecord()][6];
            String query = "SELECT * FROM `loan`";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                data[total][0] = rs.getString("id_member");
                data[total][1] = rs.getString("member_name");
                data[total][2] = rs.getString("id_book");
                data[total][3] = rs.getString("book_title");
                data[total][4] = rs.getString("loan_date");
                total++;
            }
            return data;
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Eror");
            return null;
        }
    }
    
    //DELETE RECORD
    public void deleteRecord(String id) {
        try{
            statement = (Statement) koneksi.createStatement();
            String query = "DELETE FROM loan WHERE `id_member` = '" +id+ "'";
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data has been deleted!");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println("Empty Data!");
        }
    }
    
    //UPDATE LOAN
    public void updateLoan (String IDM,String Name, String IDB, String BTitle, String Date){
        try{ 
            statement = (Statement) koneksi.createStatement();
            String query = "UPDATE `loan` SET `id_member` ='"+IDM+"', `member_name` ='"+Name+"', `id_book` ='"+IDB+"', `book_title` ='"+BTitle+"' "+"WHERE `loan_date` ='"+Date+"'";
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Loan has been updated!");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}

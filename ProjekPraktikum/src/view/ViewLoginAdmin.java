package view;





/**
 *
 * @author Agave-PC
 */
import java.awt.*;
import static java.awt.SystemColor.window;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

public class ViewLoginAdmin extends JFrame {
    public JLabel lJudul = new JLabel("Login Admin");
    
    public JLabel lUsername = new JLabel("Username");
    public JTextField tfUsername = new JTextField();
    
    public JLabel lPass = new JLabel("Password");
    public JPasswordField tfPass = new JPasswordField();
            
    public JButton btnLogin = new JButton("Login");
    public JButton btnKembali = new JButton("Back");
   
    public ViewLoginAdmin(){
        setTitle("Legend");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(false);
        setLayout(null);
        setSize(400, 450);
        setLocationRelativeTo(null);
        getRootPane().setDefaultButton(btnLogin);
        
        add(lJudul);
        lJudul.setBounds(110, 30, 180, 35);
        lJudul.setFont(new java.awt.Font("Helvetica", 0, 30));
        
        add(lUsername);
        lUsername.setBounds(60, 100, 120, 25);
        lUsername.setFont(new java.awt.Font("Helvetica", 0, 20));
        add(tfUsername);
        tfUsername.setBounds(60, 125, 260, 25);
        tfUsername.setBackground(Color.BLACK);
        tfUsername.setForeground(Color.ORANGE);
        
        add(lPass);
        lPass.setBounds(60, 155, 120, 25);
        lPass.setFont(new java.awt.Font("Helvetica", 0, 20));
        add(tfPass);
        tfPass.setBounds(60, 180, 260, 25);
        tfPass.setBackground(Color.BLACK);
        tfPass.setForeground(Color.ORANGE);
        
        add(btnKembali);
        btnKembali.setBounds(85, 250, 100, 30);
        btnKembali.setBackground(Color.BLACK);
        btnKembali.setForeground(Color.getHSBColor(446, 240, 640));
        add(btnLogin);
        btnLogin.setBounds(195, 250, 100, 30);
        btnLogin.setBackground(Color.BLACK);
        btnLogin.setForeground(Color.CYAN);
    }

}

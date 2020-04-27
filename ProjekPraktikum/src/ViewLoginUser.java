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
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

public class ViewLoginUser extends JFrame {
    JLabel lJudul = new JLabel("Login User");
    
    JLabel lUsername = new JLabel("Username");
    JTextField tfUsername = new JTextField();
    
    JLabel lPass = new JLabel("Password");
    JTextField tfPass = new JTextField();
    
    JLabel lText1 = new JLabel("Need account?");
    
    JLabel lText2 = new JLabel("Are you admin?");

    JLabel lRegister = new JLabel("Register");
            
    JButton btnLogin = new JButton("Login");
   
    JButton btnLogin2 = new JButton("Login Admin");

    public ViewLoginUser(){
        setTitle("Legend Games");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(400, 450);
        
        add(lJudul);
        lJudul.setBounds(120, 30, 150, 35);
        lJudul.setFont(new java.awt.Font("Helvetica", 0, 30));
        
        add(lUsername);
        lUsername.setBounds(60, 100, 120, 25);
        lUsername.setFont(new java.awt.Font("Helvetica", 0, 20));
        add(tfUsername);
        tfUsername.setBounds(60, 125, 260, 25);
        
        add(lPass);
        lPass.setBounds(60, 155, 120, 25);
        lPass.setFont(new java.awt.Font("Helvetica", 0, 20));
        add(tfPass);
        tfPass.setBounds(60, 180, 260, 25);
        
        add(lText1);
        lText1.setBounds(160, 223, 180, 25);
        lText1.setFont(new java.awt.Font("Helvetica", 0, 15));

        add(lRegister);
        lRegister.setBounds(263, 223, 120, 25);
        lRegister.setFont(new java.awt.Font("Helvetica", 0, 15));
        lRegister.setForeground(Color.blue);
        
        add(btnLogin);
        btnLogin.setBounds(60, 220, 70, 30);
        
        add(lText2);
        lText2.setBounds(140, 280, 180, 25);
        lText2.setFont(new java.awt.Font("Helvetica", 0, 15));
        
        add(btnLogin2);
        btnLogin2.setBounds(130, 310, 120, 30);

    }

}

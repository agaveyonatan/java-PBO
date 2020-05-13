 /**
 *
 * @author Agave-PC
 */
import java.awt.*;
//import java.swing.*;
import static java.awt.SystemColor.window;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
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

public class ViewLoginUser extends JFrame {
    JLabel lJudul = new JLabel("Login User");
    
    JLabel lUsername = new JLabel("Username");
    JTextField tfUsername = new JTextField();
    
    JLabel lPass = new JLabel("Password");
    JPasswordField tfPass = new JPasswordField();
    
    JLabel lText1 = new JLabel("Need account?");
    
    JLabel lText2 = new JLabel("Are you admin?");

    JLabel lRegister = new JLabel("Register");
            
    JButton btnLogin = new JButton("Login");
   
    JButton btnLogin2 = new JButton("Login Admin");
    
//    JLabel background = new JLabel();
    

    public ViewLoginUser(){
        setTitle("Legend");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(400, 450);
        setLocationRelativeTo(null);
        getRootPane().setDefaultButton(btnLogin);
//        JFrame.setBackground(Color.RED);
//        background.setIcon(new ImageIcon("background3.png"));
        
//        add(background);
//        background.setBounds(0,0, 400, 450);
//        validate();
        
        add(lJudul);
        lJudul.setBounds(120, 30, 150, 35);
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
        
        add(lText1);
        lText1.setBounds(160, 223, 180, 25);
        lText1.setFont(new java.awt.Font("Helvetica", 0, 15));

        add(lRegister);
        lRegister.setBounds(263, 223, 120, 25);
        lRegister.setFont(new java.awt.Font("Helvetica", 0, 15));
        lRegister.setForeground(Color.blue);
//        lRegister.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));

        add(btnLogin);
        btnLogin.setBounds(60, 220, 70, 30);
        btnLogin.setBackground(Color.BLACK);
        btnLogin.setForeground(Color.CYAN);
        
        add(lText2);
        lText2.setBounds(140, 280, 180, 25);
        lText2.setFont(new java.awt.Font("Helvetica", 0, 15));
        
        add(btnLogin2);
        btnLogin2.setBounds(130, 310, 120, 30);
        btnLogin2.setBackground(Color.BLACK);
        btnLogin2.setForeground(Color.getHSBColor(446, 240, 640));
    }

}

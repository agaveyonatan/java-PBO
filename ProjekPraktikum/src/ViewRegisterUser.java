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

public class ViewRegisterUser extends JFrame  {
    JLabel lJudul = new JLabel("Register User");
    
    JLabel lUsername = new JLabel("Username");
    JTextField tfUsername = new JTextField();
    
    JLabel lPass = new JLabel("Password");
    JTextField tfPass = new JTextField();
    
    JLabel lEmail = new JLabel("Email");
    JTextField tfEmail = new JTextField();
    
    JLabel lContact = new JLabel("Contact");
    JTextField tfContact = new JTextField();
    
    JLabel lGender = new JLabel("Gender  ");
    JRadioButton rbMan = new JRadioButton("Man");
    JRadioButton rbWoman = new JRadioButton("Woman");
    
    JButton btnRegister = new JButton("Register");

    public ViewRegisterUser(){
        setTitle("Legend Games");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(400, 600);
        
        add(lJudul);
        lJudul.setBounds(100, 30, 200, 35);
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
        
        add(lEmail);
        lEmail.setBounds(60, 240, 120, 25);
        lEmail.setFont(new java.awt.Font("Helvetica", 0, 20));
        add(tfEmail);
        tfEmail.setBounds(60, 265, 260, 25);
        
        add(lContact);
        lContact.setBounds(60, 295, 120, 25);
        lContact.setFont(new java.awt.Font("Helvetica", 0, 20));
        add(tfContact);
        tfContact.setBounds(60, 320, 260, 25);
        
        ButtonGroup group = new ButtonGroup();
        group.add(rbMan);
        group.add(rbWoman);
        
        add(lGender);
        lGender.setBounds(60, 210, 120, 25);
        lGender.setFont(new java.awt.Font("Helvetica", 0, 20));
                
        add(rbMan);
        rbMan.setBounds(145, 215, 50, 20);
        add(rbWoman);
        rbWoman.setBounds(195, 215, 70, 20);
        
        add(btnRegister);
        btnRegister.setBounds(150, 370, 90, 30);
    }

}

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

public class ViewRegisterUser extends JFrame  {
    public JLabel lJudul = new JLabel("Register User");
    
    public JLabel lUsername = new JLabel("Username");
    public JTextField tfUsername = new JTextField();
    
    public JLabel lPass = new JLabel("Password");
    public JPasswordField tfPass = new JPasswordField();
    
    public JLabel lEmail = new JLabel("Email");
    public JTextField tfEmail = new JTextField();
    
    public JLabel lContact = new JLabel("Contact");
    public JTextField tfContact = new JTextField();
    
    public JLabel lGender = new JLabel("Gender  ");
    public JRadioButton rbMan = new JRadioButton("Man");
    public JRadioButton rbWoman = new JRadioButton("Woman");
    
    public JButton btnRegister = new JButton("Register");
    public JButton btnkembali = new JButton("Cancel");

    public ViewRegisterUser(){
        setTitle("Legend");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(false);
        setLayout(null);
        setSize(400, 550);
        setLocationRelativeTo(null);
        getRootPane().setDefaultButton(btnRegister);
        
        add(lJudul);
        lJudul.setBounds(100, 30, 200, 35);
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
        
        add(lEmail);
        lEmail.setBounds(60, 240, 120, 25);
        lEmail.setFont(new java.awt.Font("Helvetica", 0, 20));
        add(tfEmail);
        tfEmail.setBounds(60, 265, 260, 25);
        tfEmail.setBackground(Color.BLACK);
        tfEmail.setForeground(Color.ORANGE);
        
        add(lContact);
        lContact.setBounds(60, 295, 120, 25);
        lContact.setFont(new java.awt.Font("Helvetica", 0, 20));
        add(tfContact);
        tfContact.setBounds(60, 320, 260, 25);
        tfContact.setBackground(Color.BLACK);
        tfContact.setForeground(Color.ORANGE);
        
        ButtonGroup group = new ButtonGroup();
        group.add(rbMan);
        group.add(rbWoman);
//        rbMan.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
//        rbWoman.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));

        add(lGender);
        lGender.setBounds(60, 210, 120, 25);
        lGender.setFont(new java.awt.Font("Helvetica", 0, 20));
                
        add(rbMan);
        rbMan.setBounds(145, 215, 50, 20);
        rbMan.setBackground(Color.BLACK);
        rbMan.setForeground(Color.ORANGE);
        add(rbWoman);
        rbWoman.setBounds(195, 215, 70, 20);
        rbWoman.setBackground(Color.BLACK);
        rbWoman.setForeground(Color.ORANGE);
        
        add(btnRegister);
        btnRegister.setBounds(195, 370, 125, 30);
        btnRegister.setBackground(Color.BLACK);
        btnRegister.setForeground(Color.CYAN);
        add(btnkembali);
        btnkembali.setBounds(60, 370, 125, 30);
        btnkembali.setBackground(Color.BLACK);
        btnkembali.setForeground(Color.RED);
    }
    
    public String getGender() {
        if (rbMan.isSelected()) {
            return "Man";
        } else {
            return "Woman";
        }
    }
}

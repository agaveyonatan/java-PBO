package view;

/**
 *
 * @author Agave-PC
 */
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JPanel;
    
public class ViewLoginAdmin extends JFrame {
    public JLabel lTitle = new JLabel("LOGIN");
    
    public JLabel lUsername = new JLabel("Username");
    public JTextField tfUsername = new JTextField();
    
    public JLabel lPass = new JLabel("Password");
    public JPasswordField tfPass = new JPasswordField();
            
    public JButton btnLogin = new JButton("Login");
   
    public JButton btnExit = new JButton("Exit");
        
    public JPanel panelbackground = new JPanel ();
    
    public ViewLoginAdmin(){
        setTitle("TAKA LIBRARY");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(400, 400);
        setLocationRelativeTo(null);
        getRootPane().setDefaultButton(btnLogin);
        panelbackground.setLayout(null);
        
        add(panelbackground);
        panelbackground.add(lTitle);
        panelbackground.add(lUsername);
        panelbackground.add(tfUsername);
        panelbackground.add(lPass);
        panelbackground.add(tfPass);
        panelbackground.add(btnLogin);
        panelbackground.add(btnExit);
        
        lTitle.setFont(new java.awt.Font("Helvetica", 0, 30));
        lUsername.setFont(new java.awt.Font("Helvetica", 0, 20));
        lPass.setFont(new java.awt.Font("Helvetica", 0, 20));
        
        panelbackground.setBackground(Color.BLACK);
        panelbackground.setBounds(0,0,400,400); 
        
        lTitle.setBounds(140, 30, 150, 35);
        lTitle.setForeground(Color.WHITE);
        
        lUsername.setBounds(60, 100, 120, 25);
        lUsername.setForeground(Color.WHITE);
        tfUsername.setBounds(60, 125, 260, 25);
        tfUsername.setBackground(Color.BLACK);
        tfUsername.setForeground(Color.ORANGE);
        
        lPass.setBounds(60, 155, 120, 25);
        lPass.setForeground(Color.WHITE);
        tfPass.setBounds(60, 180, 260, 25);
        tfPass.setBackground(Color.BLACK);
        tfPass.setForeground(Color.ORANGE);

        btnLogin.setBounds(60, 230, 120, 30);
        btnLogin.setBackground(Color.BLACK);
        btnLogin.setForeground(Color.CYAN);
        
        btnExit.setBounds(200, 230, 120, 30);
        btnExit.setBackground(Color.BLACK);
        btnExit.setForeground(Color.RED);
    }
}


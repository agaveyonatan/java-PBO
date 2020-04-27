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

public class ViewLoginAdmin extends JFrame {
    JLabel lJudul = new JLabel("Login Admin");
    
    JLabel lUsername = new JLabel("Username");
    JTextField tfUsername = new JTextField();
    
    JLabel lPass = new JLabel("Password");
    JTextField tfPass = new JTextField();
            
    JButton btnLogin = new JButton("Login");
   
    public ViewLoginAdmin(){
        setTitle("Legend Games");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(400, 450);
        
        add(lJudul);
        lJudul.setBounds(110, 30, 180, 35);
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
        
        add(btnLogin);
        btnLogin.setBounds(160, 220, 70, 30);

    }

}

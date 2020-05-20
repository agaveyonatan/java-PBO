package view;

/**
 *
 * @author Agave-PC
 */
import javax.swing.*;
import java.awt.*;

public class ViewAbout extends JFrame{
    public JPanel panelbackground = new JPanel ();

    public JLabel lTitle, lDesc, lDesc2, lDesc3, lDesc4, lDesc5, lContact, lLine, lWa, lWeb;

    public Font fTitle, fDesc, fButton;
    
    public JButton btnHome= new JButton("Home");

    public ViewAbout(){
        setTitle("TAKA LIBRARY");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(false);
        setLayout(null);
        setSize(320, 350);
        setLocationRelativeTo(null);
        panelbackground.setLayout(null);
        
        fTitle = new Font("Helvetica", Font.BOLD, 30);
        fButton = new Font("Helvetica", Font.BOLD, 18);
        fDesc = new Font("Helvetica", Font.BOLD, 15);

        lTitle = new JLabel ("About Us"); lTitle.setFont(fTitle);
   
        lDesc = new JLabel ("Our Company, Taka Library Established "); lDesc.setFont(fDesc);
        lDesc2 = new JLabel ("in 2020"); lDesc2.setFont(fDesc);
        lDesc3 = new JLabel ("In Order To Make "); lDesc3.setFont(fDesc);
        lDesc4 = new JLabel ("Indonesian Kids Well Educated"); lDesc4.setFont(fDesc);
        lDesc5 = new JLabel ("Credit : @agaveyonatan"); lDesc5.setFont(fDesc);

        add(panelbackground);
        //FORM
        panelbackground.add(lTitle);
        panelbackground.add(lDesc);
        panelbackground.add(lDesc2);
        panelbackground.add(lDesc3);
        panelbackground.add(lDesc4);
        panelbackground.add(lDesc5);
        panelbackground.add(btnHome);
        
        lTitle.setBounds(85,20,150,30);
        lTitle.setForeground(Color.WHITE);
        
        lDesc.setBounds(15,80,300,30);
        lDesc.setForeground(Color.WHITE);
        
        lDesc2.setBounds(125,105,300,30);
        lDesc2.setForeground(Color.WHITE);
        
        lDesc3.setBounds(90,130,300,30);
        lDesc3.setForeground(Color.WHITE);
        
        lDesc4.setBounds(40,160,300,30);
        lDesc4.setForeground(Color.WHITE);
        
        lDesc5.setBounds(65,190,300,30);
        lDesc5.setForeground(Color.WHITE);
        
        btnHome.setBounds(95,250,120,30); btnHome.setFont(fButton);
        btnHome.setForeground(Color.RED);
        btnHome.setBackground(Color.BLACK);

        panelbackground.setBackground(Color.BLACK);
        panelbackground.setBounds(0,0,320,350);
    }
}

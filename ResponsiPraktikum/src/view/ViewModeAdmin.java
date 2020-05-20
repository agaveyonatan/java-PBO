package view;

/**
 *
 * @author Agave-PC
 */

import javax.swing.*;
import java.awt.*;

public class ViewModeAdmin extends JFrame{
    
    public JLabel lTitle = new JLabel("TAKA LIBRARY");

    public JLabel lIntro = new JLabel("Enjoy Working!");
            
    public JLabel lOutro = new JLabel("Connect With Us :");
    public JLabel lLine = new JLabel("LINE : @perpustaka");
    public JLabel lWhatsapp = new JLabel("WA : 085384534567");
    public JLabel lWeb = new JLabel("WEB : www.perpustaka.co.id");

    public JButton btnLoan= new JButton("LOAN");
    public JButton btnRecord = new JButton("RECORD");
    public JButton btnAbout = new JButton("ABOUT");
    public JButton btnLogout = new JButton("LOGOUT");

    public JPanel panelbackground = new JPanel ();

    public ViewModeAdmin(){
        setTitle("TAKA LIBRARY");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(false);
        setLayout(null);
        setSize(500, 500);
        setLocationRelativeTo(null);
        panelbackground.setLayout(null);
        
        add(panelbackground);
        panelbackground.add(lTitle);
        panelbackground.add(lIntro);
        panelbackground.add(lLine);
        panelbackground.add(lWhatsapp);
        panelbackground.add(lWeb);
        panelbackground.add(btnRecord);
        panelbackground.add(btnLoan);
        panelbackground.add(btnAbout);
        panelbackground.add(btnLogout);
        panelbackground.add(lOutro);

        lTitle.setFont(new java.awt.Font("Helvetica", 0, 30));
        lIntro.setFont(new java.awt.Font("Helvetica", 0, 25));
        lOutro.setFont(new java.awt.Font("Helvetica", 0, 20));
        lLine.setFont(new java.awt.Font("Helvetica", 0, 13));
        lWhatsapp.setFont(new java.awt.Font("Helvetica", 0, 13));
        lWeb.setFont(new java.awt.Font("Helvetica", 0, 13));
        
        btnLoan.setFont(new java.awt.Font("Helvetica", 0, 25));
        btnRecord.setFont(new java.awt.Font("Helvetica", 0, 25));
        btnAbout.setFont(new java.awt.Font("Helvetica", 0, 25));
        btnLogout.setFont(new java.awt.Font("Helvetica", 0, 25));

        panelbackground.setBackground(Color.BLACK);
        panelbackground.setBounds(0,0,500,500);
        
        lTitle.setBounds(135, 30, 350, 30);
        lTitle.setForeground(Color.WHITE);
        
        lIntro.setBounds(155, 80, 250, 30);
        lIntro.setForeground(Color.WHITE);
        
        lOutro.setBounds(160, 360, 250, 30);
        lOutro.setForeground(Color.WHITE);
        
        lLine.setBounds(30, 400, 250, 30);
        lLine.setForeground(Color.WHITE);
        
        lWhatsapp.setBounds(160, 400, 250, 30);
        lWhatsapp.setForeground(Color.WHITE);
        
        lWeb.setBounds(290, 400, 250, 30);
        lWeb.setForeground(Color.WHITE);
        
        //BUTTON
        btnLoan.setBounds(80, 170, 150, 70);
        btnLoan.setForeground(Color.GREEN);
        btnLoan.setBackground(Color.BLACK);
        
        btnRecord.setBounds(260, 170, 150, 70);
        btnRecord.setForeground(Color.ORANGE);
        btnRecord.setBackground(Color.BLACK);
        
        btnAbout.setBounds(80, 250, 150, 70);
        btnAbout.setForeground(Color.CYAN);
        btnAbout.setBackground(Color.BLACK);
        
        btnLogout.setBounds(260, 250, 150, 70);
        btnLogout.setForeground(Color.RED);
        btnLogout.setBackground(Color.BLACK);

    }
}

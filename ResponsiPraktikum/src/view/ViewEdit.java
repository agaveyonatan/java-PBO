package view;

/**
 *
 * @author Agave-PC
 */

import javax.swing.*;
import java.awt.*;

public class ViewEdit extends JFrame {
    public JPanel panelbackground = new JPanel ();

    public JLabel lTitle, lIDM, lDataIDM, lIDB, lName, lBTitle, lDate, lDataDate;

    public JTextField tfIDB, tfName, tfBTitle;

    public Font fTitle, fForm;
    
    //BUTTON
    public JButton btnCancel= new JButton("CANCEL");
    public JButton btnEdit = new JButton("EDIT");

    public ViewEdit(){
        setTitle("TAKA LIBRARY");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(false);
        setLayout(null);
        setSize(320, 350);
        setLocationRelativeTo(null);
        panelbackground.setLayout(null);
        
        fTitle = new Font("Helvetica", Font.BOLD, 20);
        fForm = new Font("Helvetica", Font.BOLD, 15);

        lTitle = new JLabel ("EDIT LOAN"); lTitle.setFont(fTitle);
        
         //FORM
        lIDM = new JLabel   ("ID Member   "); lIDM.setFont(fForm);
        lName = new JLabel  ("Member Name "); lName.setFont(fForm);
        lIDB = new JLabel   ("ID Book     "); lIDB.setFont(fForm);
        lBTitle = new JLabel("Book Title  "); lBTitle.setFont(fForm);
        lDate = new JLabel  ("Loan Date   "); lDate.setFont(fForm);
        tfBTitle = new JTextField();
        tfName = new JTextField();
        tfIDB = new JTextField();
        lDataDate = new JLabel();
        lDataIDM = new JLabel();
        
        add(panelbackground);
        //FORM
        panelbackground.add(lTitle);
        panelbackground.add(lIDM);
        panelbackground.add(lName);
        panelbackground.add(lIDB);
        panelbackground.add(lBTitle);
        panelbackground.add(lDataDate);
        panelbackground.add(lDataIDM);
        panelbackground.add(lDate);
        panelbackground.add(tfIDB);
        panelbackground.add(tfBTitle);
        panelbackground.add(tfName);
        panelbackground.add(btnCancel);
        panelbackground.add(btnEdit);

        lTitle.setBounds(100,20,120,30);
        lTitle.setForeground(Color.WHITE);

        lIDM.setBounds(20,65,120,30);
        lIDM.setForeground(Color.WHITE);
        lDataIDM.setBounds(135,65,120,30);
        lDataIDM.setForeground(Color.ORANGE);
        
        lName.setBounds(20,90,120,30);
        lName.setForeground(Color.WHITE);
        tfName.setBounds(135,95,150,20);
        tfName.setForeground(Color.ORANGE);
        tfName.setBackground(Color.BLACK);

        lIDB.setBounds(20,120,120,30);
        lIDB.setForeground(Color.WHITE);
        tfIDB.setBounds(135,125,150,20);
        tfIDB.setForeground(Color.ORANGE);
        tfIDB.setBackground(Color.BLACK);
        
        lBTitle.setBounds(20,150,120,30);
        lBTitle.setForeground(Color.WHITE);
        tfBTitle.setBounds(135,155,150,20);
        tfBTitle.setForeground(Color.ORANGE);
        tfBTitle.setBackground(Color.BLACK);
        
        lDate.setBounds(20,180,120,30);
        lDate.setForeground(Color.WHITE);
        lDataDate.setBounds(135,180,120,30);
        lDataDate.setForeground(Color.ORANGE);
        
        btnCancel.setBounds(40,250,100,30);
        btnCancel.setForeground(Color.RED);
        btnCancel.setBackground(Color.BLACK);

        btnEdit.setBounds(160,250,100,30);
        btnEdit.setForeground(Color.GREEN);
        btnEdit.setBackground(Color.BLACK);
        
        panelbackground.setBackground(Color.BLACK);
        panelbackground.setBounds(0,0,320,350);
    }

}

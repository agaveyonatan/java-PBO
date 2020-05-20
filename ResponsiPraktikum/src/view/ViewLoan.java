package view;

/**
 *
 * @author Agave-PC
 */
import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ViewLoan extends JFrame{
    public JPanel panelbackground = new JPanel ();
    public JPanel panel1= new JPanel();
    public JPanel panel2 = new JPanel();
    
    public GroupLayout gpanel1,gpanel2;
    
    //FORM
    public JLabel lTitle, lIDM, lIDB, lName, lBTitle, lDate;
    public JTextField tfIDM, tfIDB, tfName, tfBTitle, tfDate;
    //SIDE PANEL
    public JLabel lIDMember, lIDBook, lMemberName, lBookTitle, lDateLoan, lNewData;
    //CONTENT SIDE PANEL
    public JLabel lDataIDM, lDataIDB, lDataName, lDataBTitle, lDataDate;

    //BUTTON
    public JButton btnHome= new JButton("HOME");
    public JButton btnRecord = new JButton("RECORD");
    public JButton btnAbout = new JButton("ABOUT");
    public JButton btnRefresh = new JButton("REFRESH");
    public JButton btnInput = new JButton("INPUT");
    public JButton btnCancel = new JButton("CANCEL");

    public Font fTitle, fNewData, fForm;

    public ViewLoan(){
        fTitle = new Font("Tahoma", Font.BOLD + Font.ITALIC, 24);
        fNewData = new Font("Tahoma", Font.BOLD + Font.CENTER_BASELINE, 20);
        fForm = new Font("Helvetica", Font.BOLD, 20);

        setTitle("TAKA LIBRARY");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(false);
        setLayout(null);
        setSize(700, 550);
        setLocationRelativeTo(null);
        panelbackground.setLayout(null);
        
        lTitle = new JLabel ("LOAN FORM"); lTitle.setFont(fTitle);
        //FORM
        lIDM = new JLabel   ("ID Member   "); lIDM.setFont(fForm);
        lName = new JLabel  ("Member Name "); lName.setFont(fForm);
        lIDB = new JLabel   ("ID Book     "); lIDB.setFont(fForm);
        lBTitle = new JLabel("Book Title  "); lBTitle.setFont(fForm);
        lDate = new JLabel  ("Date        "); lDate.setFont(fForm);
        tfIDM = new JTextField();
        tfName = new JTextField();
        tfIDB = new JTextField();
        tfBTitle = new JTextField();
        tfDate = new JTextField();

        //SIDE PANEL
        lIDMember = new JLabel  ("ID Member        : ");
        lMemberName = new JLabel("Member Name : ");
        lIDBook = new JLabel    ("ID Book              : ");
        lBookTitle = new JLabel ("Book Title         : ");
        lDateLoan = new JLabel  ("Date                   : ");
        
        //CONTENT SIDE PANEL
        lDataIDM = new JLabel();
        lDataName = new JLabel();
        lDataIDB = new JLabel();
        lDataBTitle = new JLabel();
        lDataDate = new JLabel();
        
        panel1.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gpanel1 = new GroupLayout(panel1);
        panel1.setLayout(gpanel1);
        panel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detailed", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        gpanel2 = new GroupLayout(panel2);
        panel2.setLayout(gpanel2);
        lNewData = new JLabel("NEW DATA"); lNewData.setFont(fNewData);
        
        add(panelbackground);
        //FORM
        panelbackground.add(panel1);
        panelbackground.add(btnInput);
        panelbackground.add(btnCancel);
        panelbackground.add(lTitle);
        panelbackground.add(lIDM);
        panelbackground.add(lName);
        panelbackground.add(lIDB);
        panelbackground.add(lBTitle);
        panelbackground.add(lDate);
        panelbackground.add(tfIDM);
        panelbackground.add(tfName);
        panelbackground.add(tfIDB);
        panelbackground.add(tfBTitle);
        panelbackground.add(tfDate);
        
        //SIDE PANEL
        panel1.add(panel2);
        panel1.add(btnRecord);
        panel1.add(btnHome);
        panel1.add(btnAbout);
        panel1.add(btnRefresh);
        panel1.add(lNewData);
        
        //CONTENT SIDE PANEL
        panel2.add(lIDMember);
        panel2.add(lMemberName);
        panel2.add(lIDBook);
        panel2.add(lBookTitle);
        panel2.add(lDateLoan);
        panel2.add(lDataIDM);
        panel2.add(lDataName);
        panel2.add(lDataIDB);
        panel2.add(lDataBTitle);
        panel2.add(lDataDate);

        panel1.setBounds(330,20,330,480);
        panel1.setBackground(Color.DARK_GRAY);
        panel2.setBounds(30,70,275,200);
        panel2.setBackground(Color.BLACK);
        panel2.setForeground(Color.WHITE);
        lNewData.setBounds(120,30,170,20);
        lNewData.setForeground(Color.WHITE);

        //SIDE PANEL
        btnAbout.setBounds(175,400,100,30);
        btnAbout.setBackground(Color.BLACK);
        btnAbout.setForeground(Color.CYAN);

        btnHome.setBounds(65,400,100,30);
        btnHome.setBackground(Color.BLACK);
        btnHome.setForeground(Color.RED);

        btnRecord.setBounds(175,340,100,30);
        btnRecord.setBackground(Color.BLACK);
        btnRecord.setForeground(Color.ORANGE);

        btnRefresh.setBounds(65,340,100,30);
        btnRefresh.setBackground(Color.BLACK);
        btnRefresh.setForeground(Color.WHITE);
        
        lTitle.setBounds(85,20,250,20);
        lTitle.setForeground(Color.WHITE);
        
        //CONTENT SIDE PANEL
        lIDMember.setBounds(20,50,100,20);
        lIDMember.setForeground(Color.WHITE);
        lDataIDM.setBounds(110,50,80,20);
        lDataIDM.setForeground(Color.WHITE);
        
        lMemberName.setBounds(20,80,100,20);
        lMemberName.setForeground(Color.WHITE);
        lDataName.setBounds(110,80,80,20);
        lDataName.setForeground(Color.WHITE);

        lIDBook.setBounds(20,110,100,20);
        lIDBook.setForeground(Color.WHITE);
        lDataIDB.setBounds(110,110,80,20);
        lDataIDB.setForeground(Color.WHITE);
        
        lBookTitle.setBounds(20,140,100,20);
        lBookTitle.setForeground(Color.WHITE);
        lDataBTitle.setBounds(110,140,80,20);
        lDataBTitle.setForeground(Color.WHITE);
        
        lDateLoan.setBounds(20,170,100,20);
        lDateLoan.setForeground(Color.WHITE);
        lDataDate.setBounds(110,170,80,20);
        lDataDate.setForeground(Color.WHITE);
        
        //FORM
        lIDM.setBounds(55,80,150,20);
        lIDM.setForeground(Color.WHITE);
        tfIDM.setBounds(55,110,200,25);
        tfIDM.setForeground(Color.ORANGE);
        tfIDM.setBackground(Color.BLACK);
        
        lName.setBounds(55,140,150,20);
        lName.setForeground(Color.WHITE);
        tfName.setBounds(55,170,200,25);
        tfName.setForeground(Color.ORANGE);
        tfName.setBackground(Color.BLACK);
        
        lIDB.setBounds(55,200,150,20);
        lIDB.setForeground(Color.WHITE);
        tfIDB.setBounds(55,230,200,25);
        tfIDB.setForeground(Color.ORANGE);
        tfIDB.setBackground(Color.BLACK);
        
        lBTitle.setBounds(55,260,150,20);
        lBTitle.setForeground(Color.WHITE);
        tfBTitle.setBounds(55,290,200,25);
        tfBTitle.setForeground(Color.ORANGE);
        tfBTitle.setBackground(Color.BLACK);
        
        lDate.setBounds(55,320,150,20);
        lDate.setForeground(Color.WHITE);
        tfDate.setBounds(55,350,200,25);
        tfDate.setForeground(Color.ORANGE);
        tfDate.setBackground(Color.BLACK);
        
        btnInput.setBounds(160,410,95,30);
        btnInput.setBackground(Color.BLACK);
        btnInput.setForeground(Color.GREEN);
        
        btnCancel.setBounds(55,410,95,30);
        btnCancel.setBackground(Color.BLACK);
        btnCancel.setForeground(Color.RED);
        
        panelbackground.setBackground(Color.BLACK);
        panelbackground.setBounds(0,0,700,550);
        
    }

}

package view;

/**
 *
 * @author Agave-PC
 */
import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

public class ViewRecord extends JFrame {
    public JPanel panelbackground = new JPanel ();
    public JPanel panel1= new JPanel();

    public JLabel lTitle, lIDM, lIDB, lName, lBTitle, lDate;
    public JLabel lDataIDM, lDataIDB, lDataName, lDataBTitle, lDataDate;

    public JTable table;
    public DefaultTableModel tableModel;
    public JScrollPane scrollPane; 
    public Object columnName [] = {"ID Member","Member Name","ID Book","Book Title","Loan Date",""}; 
    
    //BUTTON
    public JButton btnHome= new JButton("HOME");
    public JButton btnAbout = new JButton("ABOUT");
    public JButton btnEdit = new JButton("EDIT");
    public JButton btnDelete= new JButton("DELETE");
    public JButton btnAdd = new JButton("NEW LOAN");
    public JButton btnSearch = new JButton("SEARCH");
    public JButton btnRefresh = new JButton("REFRESH");

    public Font fTitle, fSearch;

    public ViewRecord(){
        fTitle = new Font("Helvetica", Font.BOLD, 30);

        setTitle("TAKA LIBRARY");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(false);
        setLayout(null);
        setSize(620, 600);
        setLocationRelativeTo(null);
        panelbackground.setLayout(null);
        
        lTitle = new JLabel ("LOAN RECORD"); lTitle.setFont(fTitle);
        lDataIDM = new JLabel();
        lDataIDB = new JLabel();
        lDataName = new JLabel();
        lDataBTitle = new JLabel();
        lDataDate = new JLabel();

        panel1.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        
        //TABLE
        tableModel = new DefaultTableModel(columnName,0);
        table = new JTable(tableModel);
        table.setBackground(Color.BLACK);
        table.setForeground(Color.WHITE);
        scrollPane = new JScrollPane(table);
        
        add(panelbackground);
        panelbackground.add(panel1);
        panelbackground.add(lTitle);
        panelbackground.add(scrollPane);
        panelbackground.add(btnAdd);
        
        panel1.add(btnRefresh);
        panel1.add(btnEdit);
        panel1.add(btnDelete);
        panel1.add(btnAbout);
        panel1.add(btnHome);

//        btnRefresh.setBounds(500,20,110,30);
        btnRefresh.setForeground(Color.WHITE);
        btnRefresh.setBackground(Color.BLACK);
        
//        btnEdit.setBounds(10,20,110,30);
        btnEdit.setForeground(Color.ORANGE);
        btnEdit.setBackground(Color.BLACK);
        
//        btnDelete.setBounds(155,20,110,30);
        btnDelete.setForeground(Color.RED);
        btnDelete.setBackground(Color.BLACK);
        
//        btnHome.setBounds(395,20,110,30);
        btnHome.setForeground(Color.RED);
        btnHome.setBackground(Color.BLACK);
        
//        btnAbout.setBounds(275,20,110,30);
        btnAbout.setForeground(Color.CYAN);
        btnAbout.setBackground(Color.BLACK);
        
        btnAdd.setBounds(30,25,100,30);
        btnAdd.setForeground(Color.GREEN);
        btnAdd.setBackground(Color.BLACK);
        
        scrollPane.setBounds(30,110,550,350);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setBackground(Color.BLACK);
        scrollPane.setForeground(Color.WHITE);

        panel1.setBounds(30,480,550,70);
        panel1.setBackground(Color.DARK_GRAY);
        
        lTitle.setBounds(190,20,350,30);
        lTitle.setForeground(Color.WHITE);
        
        panelbackground.setBackground(Color.BLACK);
        panelbackground.setBounds(0,0,620,600);
    }
}

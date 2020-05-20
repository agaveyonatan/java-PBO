package controller;

import model.ModelResponsi;
import view.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Agave-PC
 */
public class ControllerResponsi {

    String select, IDM, IDB, Date, Name, BTitle;

    public ControllerResponsi(ModelResponsi modelresponsi, ViewLoginAdmin viewloginadmin, ViewModeAdmin viewmodeadmin, ViewLoan viewloan, ViewRecord viewrecord, ViewEdit viewedit, ViewAbout viewabout) {
                
        viewloan.tfDate.setText(date());
        
        //CONTENT RECORD
        if (modelresponsi.getRecord()!= 0) {
            String data[][] = modelresponsi.readRecord();
            viewrecord.table.setModel((new JTable(data, viewrecord.columnName)).getModel());
            viewrecord.table.getColumnModel().getColumn(5).setMinWidth(0);
            viewrecord.table.getColumnModel().getColumn(5).setMaxWidth(0);
         }else{
            JOptionPane.showMessageDialog(null, "Empty Data in Record!");
        }
        
        //KELUAR PROGRAM
        viewloginadmin.btnExit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                viewloginadmin.setVisible(false);
            }
        });
        
        //LOGIN ADMIN
        viewloginadmin.btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = viewloginadmin.tfUsername.getText();
                String password = viewloginadmin.tfPass.getText();
                if(viewloginadmin.tfUsername.getText().length() >0 && viewloginadmin.tfPass.getText().length() >0 && modelresponsi.checkLoginAdmin(username, password) == 1) {
                        viewloginadmin.setVisible(false);
                        viewmodeadmin.setVisible(true);
                        viewloginadmin.tfUsername.setText(null);
                        viewloginadmin.tfPass.setText(null);    
                }
                else { 
                     JOptionPane.showMessageDialog(null, "Username atau Password Salah");
                 }
            }
        });
        
        //LOGOUT ADMIN
        viewmodeadmin.btnLogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "You're Logged Out!");
                viewmodeadmin.setVisible(false);
                viewloginadmin.setVisible(true);
            }
        });
        
        //VIEW LOAN FROM MODE ADMIN
        viewmodeadmin.btnLoan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewmodeadmin.setVisible(false);
                viewloan.setVisible(true);
            }
        });
        
        //VIEW RECORD FROM VIEW LOAN
        viewloan.btnRecord.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewloan.setVisible(false);
                viewrecord.setVisible(true);
            }
        });
        
        //VIEW ABOUT FROM VIEW LOAN
        viewloan.btnAbout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewloan.setVisible(false);
                viewabout.setVisible(true);
            }
        });
        
        //VIEW ABOUT FROM VIEW MODE ADMIN
        viewmodeadmin.btnAbout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewmodeadmin.setVisible(false);
                viewabout.setVisible(true);
            }
        });
        
        //VIEW ABOUT FROM VIEW RECORD
        viewrecord.btnAbout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewrecord.setVisible(false);
                viewabout.setVisible(true);
            }
        });
        
        //VIEW MODE ADMIN FROM VIEW ABOUT
        viewabout.btnHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewabout.setVisible(false);
                viewmodeadmin.setVisible(true);
            }
        });
        
        //VIEW ABOUT FROM VIEW LOAN
        viewloan.btnAbout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewloan.setVisible(false);
                viewabout.setVisible(true);
            }
        });
        //VIEW LOAN FROM RECORD
        viewrecord.btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewrecord.setVisible(false);
                viewloan.setVisible(true);
            }
        });
        
        //VIEW RECORD FROM MODE ADMIN
        viewmodeadmin.btnRecord.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewmodeadmin.setVisible(false);
                viewrecord.setVisible(true);
            }
        });
        
        //VIEW RECORD FROM VIEW EDIT
        viewedit.btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewedit.setVisible(false);
                viewrecord.setVisible(true);
            }
        });
        
        //BACK HOME VIEW LOAN
        viewloan.btnHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewloan.setVisible(false);
                viewmodeadmin.setVisible(true);
            }
        });
        
        //BACK HOME VIEW RECORD
        viewrecord.btnHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewrecord.setVisible(false);
                viewmodeadmin.setVisible(true);
            }
        });
        
        //VIEW EDIT
        viewrecord.btnEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewrecord.setVisible(false);
                viewedit.setVisible(true);
                
                viewedit.lDataIDM.setText(IDM);
                viewedit.lDataDate.setText(Date);
                viewedit.tfName.setText(Name);
                viewedit.tfIDB.setText(IDB);
                viewedit.tfBTitle.setText(BTitle);

            }
        });
        
        //INPUT LOAN
        viewloan.btnInput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String IDM = viewloan.tfIDM.getText();
                String Name = viewloan.tfName.getText();
                String IDB = viewloan.tfIDB.getText();
                String BTitle = viewloan.tfBTitle.getText();
                String Date = viewloan.tfDate.getText();
               
                if (viewloan.tfIDM.getText().length() == 0 || viewloan.tfName.getText().length() == 0 || viewloan.tfIDB.getText().length() == 0 || viewloan.tfBTitle.getText().length() == 0 || viewloan.tfDate.getText().length() == 0) {
                    JOptionPane.showMessageDialog(null, "Empty Field Not Allowed!");
                }
                else {
                    modelresponsi.insertLoan(IDM, Name, IDB, BTitle, Date);
                    viewloan.setVisible(true);
                    viewloan.lDataIDM.setText(IDM);
                    viewloan.lDataName.setText(Name);
                    viewloan.lDataIDB.setText(IDB);
                    viewloan.lDataBTitle.setText(BTitle);
                    viewloan.lDataDate.setText(Date);

                    viewloan.tfIDM.setText(null);
                    viewloan.tfName.setText(null);
                    viewloan.tfIDB.setText(null);
                    viewloan.tfBTitle.setText(null);
                }
            }
        });
        
        //REFRESH NEW DATA INPUT LOAN
        viewloan.btnRefresh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewloan.lDataIDM.setText(null);
                viewloan.lDataName.setText(null);
                viewloan.lDataIDB.setText(null);
                viewloan.lDataBTitle.setText(null);
                viewloan.lDataDate.setText(null);
           }
        });
        
        //CANCEL INPUT DATA LOAN
        viewloan.btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewloan.tfIDM.setText(null);
                viewloan.tfName.setText(null);
                viewloan.tfIDB.setText(null);
                viewloan.tfBTitle.setText(null);
           }
        });
        
        //SELECTED DATA
        viewrecord.table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int baris = viewrecord.table.getSelectedRow(); 
                int kolom = viewrecord.table.getSelectedColumn();

                String dataterpilih = viewrecord.table.getValueAt(baris, 0).toString();
                
                System.out.println(dataterpilih);
                
                viewrecord.lDataIDM.setText(viewrecord.table.getValueAt(baris, 0).toString());
                viewrecord.lDataName.setText(viewrecord.table.getValueAt(baris, 1).toString());
                viewrecord.lDataIDB.setText(viewrecord.table.getValueAt(baris, 2).toString());
                viewrecord.lDataBTitle.setText(viewrecord.table.getValueAt(baris, 3).toString());
                viewrecord.lDataDate.setText(viewrecord.table.getValueAt(baris, 4).toString());
                
                select = dataterpilih;
                IDM = viewrecord.lDataIDM.getText();
                Name = viewrecord.lDataName.getText();
                IDB = viewrecord.lDataIDB.getText();
                BTitle = viewrecord.lDataBTitle.getText();
                Date = viewrecord.lDataDate.getText();
            }
        }
        );
        
        //DELETE DATA LOAN
         viewrecord.btnDelete.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        
                                 String id = select;
                                 modelresponsi.deleteRecord(id);
                                 String data[][] = modelresponsi.readRecord();
                                 viewrecord.table.setModel((new JTable(data, viewrecord.columnName)).getModel());
                                 viewrecord.table.getColumnModel().getColumn(5).setMinWidth(0);
                                 viewrecord.table.getColumnModel().getColumn(5).setMaxWidth(0);
                    }
        });
         
        //REFRESH DATA IN VIEW RECORD
        viewrecord.btnRefresh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String data[][] = modelresponsi.readRecord();

                viewrecord.table.setModel(new JTable(data,viewrecord.columnName).getModel());
                viewrecord.table.getColumnModel().getColumn(5).setMinWidth(0);
                viewrecord.table.getColumnModel().getColumn(5).setMaxWidth(0);
            }
        });
        
        //EDIT DATA LOAN
        viewedit.btnEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                IDM = viewedit.lDataIDM.getText();
                Name = viewedit.tfName.getText();
                IDB = viewedit.tfIDB.getText();
                BTitle = viewedit.tfBTitle.getText();
                Date = viewedit.lDataDate.getText();
                 
                modelresponsi.updateLoan(IDM,Name, IDB, BTitle, Date);
                String data[][] = modelresponsi.readRecord();
                viewrecord.table.setModel(new JTable(data,viewrecord.columnName).getModel());
                viewrecord.table.getColumnModel().getColumn(5).setMinWidth(0);
                viewrecord.table.getColumnModel().getColumn(5).setMaxWidth(0);
                
                viewedit.setVisible(false);
                viewrecord.setVisible(true);
            }
        });
    }    
    //GET DATE
    public static String date() {
    Calendar calender = new GregorianCalendar();
    int year = calender.get(Calendar.YEAR);
    int month = calender.get(Calendar.MONTH)+1;
    int day = calender.get(Calendar.DAY_OF_MONTH);
    String time = year + "-" + month + "-" + day;
    return time ;
    }
}

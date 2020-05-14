package controller;



/**
 *
 * @author Agave-PC
 */

import view.*;
import model.ModelProject;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ControllerProject {
    String nama,publisher,harga,deskripsi, id_game;
    
    public ControllerProject(ModelProject modelproject, ViewLoginUser viewloginuser, ViewLoginAdmin viewloginadmin, ViewRegisterUser viewregisteruser, ViewTambahGame viewtambahgame,ViewModeAdmin viewmodeadmin, ViewModeUser viewmodeuser, ViewAdminGameDetailed viewadmingamedetailed, ViewUserGameDetailed viewusergamedetailed, ViewUpdateGame viewupdategame, ViewCheckout viewcheckout, ViewDirectoryGame viewdirectorygame) {
       
        //isi list game
        if (modelproject.getGame()!= 0) {
             // menampilkan tabel di awal
            String datakontak[][] = modelproject.readGame();
            viewadmingamedetailed.tabel.setModel((new JTable(datakontak, viewadmingamedetailed.namaKolom)).getModel());
            viewadmingamedetailed.tabel.getColumnModel().getColumn(5).setMinWidth(0);
            viewadmingamedetailed.tabel.getColumnModel().getColumn(5).setMaxWidth(0);
            
            viewusergamedetailed.tabel.setModel((new JTable(datakontak, viewusergamedetailed.namaKolom)).getModel());
            viewusergamedetailed.tabel.getColumnModel().getColumn(5).setMinWidth(0);
            viewusergamedetailed.tabel.getColumnModel().getColumn(5).setMaxWidth(0);
         }
        
        //LOGIN USER
        viewloginuser.btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //cek login 
                String username = viewloginuser.tfUsername.getText();
                String password = viewloginuser.tfPass.getText();
                 if(viewloginuser.tfUsername.getText().length() > 0 && viewloginuser.tfPass.getText().length() >0 && modelproject.checkLoginUser(username, password) == 1) {
                    viewmodeuser.lnama.setText(username);
                    viewloginuser.setVisible(false);
                    viewmodeuser.setVisible(true);
                    viewloginuser.tfUsername.setText(null);
                    viewloginuser.tfPass.setText(null);
                }
                 else { 
                     JOptionPane.showMessageDialog(null, "Username atau Password Salah");
                 }
            }
        });
        
        //LOGIN ADMIN
        viewloginadmin.btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = viewloginadmin.tfUsername.getText();
                String password = viewloginadmin.tfPass.getText();
                if(viewloginadmin.tfUsername.getText().length() >0 && viewloginadmin.tfPass.getText().length() >0 && modelproject.checkLoginAdmin(username, password) == 1) {
                        viewmodeadmin.lnama.setText(username);
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
        
        //PINDAH KE LOGIN ADMIN
        viewloginuser.btnLogin2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewloginuser.setVisible(false);
                viewloginadmin.setVisible(true);
                viewloginuser.tfUsername.setText(null);
                viewloginuser.tfPass.setText(null);
            }
        });
              
        //PINDAH KE WINDOW TAMBAH GAME DARI MODE ADMIN
        viewmodeadmin.btntambahgame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewmodeadmin.setVisible(false);
                viewtambahgame.setVisible(true);
            }
        });
        
        //BATAL TAMBAH GAME
        viewtambahgame.btnbatal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewtambahgame.setVisible(false);
                viewmodeadmin.setVisible(true);
                viewtambahgame.tfnama.setText(null);
                viewtambahgame.tfpublisher.setText(null);
                viewtambahgame.tfharga.setText(null);
                viewtambahgame.tfdeskripsi.setText(null);
                viewtambahgame.ltextjenis.setText(null);
            }
        });
        
        //TAMBAH DATA GAME DI ADMIN
        viewtambahgame.btntambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String jenis_game = viewtambahgame.ltextjenis.getText();
                String nama = viewtambahgame.tfnama.getText();
                String publisher = viewtambahgame.tfpublisher.getText();
                String harga = viewtambahgame.tfharga.getText();
                String deskripsi = viewtambahgame.tfdeskripsi.getText();
                if(viewtambahgame.tfnama.getText().length() == 0 || viewtambahgame.ltextjenis.getText().length() == 0) {
                    JOptionPane.showMessageDialog(null, "Nama atau Jenis Game Belum Diinput!");
                }
                else {
                modelproject.insertGame(jenis_game, nama, publisher, harga, deskripsi);
                viewtambahgame.setVisible(false);
                viewmodeadmin.setVisible(true);
                viewtambahgame.tfnama.setText(null);
                viewtambahgame.tfpublisher.setText(null);
                viewtambahgame.tfharga.setText(null);
                viewtambahgame.tfdeskripsi.setText(null);
                viewtambahgame.ltextjenis.setText(null);
                }
            }
        });
        
        //REGISTER USER
        viewregisteruser.btnRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = viewregisteruser.tfUsername.getText();
                String password = viewregisteruser.tfPass.getText();
                String gender = viewregisteruser.getGender();
                String email = viewregisteruser.tfEmail.getText();
                String contact = viewregisteruser.tfContact.getText();
                if(viewregisteruser.tfUsername.getText().length() < 4 &&  viewregisteruser.tfUsername.getText().length() > 0 || viewregisteruser.tfPass.getText().length() < 4 && viewregisteruser.tfPass.getText().length() > 0) {
                    JOptionPane.showMessageDialog(null, "Username atau Password Terlalu Pendek!");
                }
                else if (viewregisteruser.tfUsername.getText().length() == 0 || viewregisteruser.tfPass.getText().length() == 0) {
                    JOptionPane.showMessageDialog(null, "Username atau Password Belum Diinput!");
                }
                else {
                    modelproject.registerUser(username, password, gender, email, contact);
                    viewregisteruser.setVisible(true);
                    viewregisteruser.tfUsername.setText(null);
                    viewregisteruser.tfPass.setText(null);
                    viewregisteruser.tfEmail.setText(null);
                    viewregisteruser.tfContact.setText(null);
                    viewregisteruser.setVisible(false);
                    viewloginuser.setVisible(true);
                }
            }
        });
        
        //TAMBAH TRANSAKSI
        viewcheckout.btnbuy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id_user = viewcheckout.lid_user.getText();
                String id_game = viewcheckout.lid_game.getText();
                String tanggal = viewcheckout.ltanggal.getText();
                modelproject.insertTransaction(id_user, id_game, tanggal);
                viewusergamedetailed.setVisible(true);            
                viewcheckout.setVisible(false);
            }
        });
        
        //LOGOUT ADMIN
        viewmodeadmin.btnlogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewmodeadmin.setVisible(false);
                viewloginuser.setVisible(true);
            }
        });
        
        //LOGOUT USER
        viewmodeuser.btnlogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewmodeuser.setVisible(false);
                viewloginuser.setVisible(true);
            }
        });
        
        //KEMBALI KE LOGIN USER
        viewloginadmin.btnKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewloginadmin.setVisible(false);
                viewloginuser.setVisible(true);
                viewloginadmin.tfUsername.setText(null);
                viewloginadmin.tfPass.setText(null);

            }
        });
        
        //MASUK LIHAT GAME (ADMIN)
        viewmodeadmin.btncheckgame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewmodeadmin.setVisible(false);
                viewadmingamedetailed.setVisible(true);
            }
        });
        
        //MASUK LIHAT GAME YANG DIJUAL (USER)
        viewmodeuser.btncheckgame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewmodeuser.setVisible(false);
                viewusergamedetailed.setVisible(true);
            }
        });
        
        //MASUK LIHAT DIRECTORY GAME
        viewmodeuser.btndirectorygame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewmodeuser.setVisible(false);
                viewdirectorygame.setVisible(true);
                String namauser = viewmodeuser.lnama.getText();
                String id_user = modelproject.getIdUser(namauser);
                System.out.println(id_user);
                String data[][] = modelproject.readDirectoryGame(id_user);
                viewdirectorygame.tabel.setModel((new JTable(data, viewdirectorygame.namaKolom)).getModel());
                viewdirectorygame.tabel.getColumnModel().getColumn(5).setMinWidth(0);
                viewdirectorygame.tabel.getColumnModel().getColumn(5).setMaxWidth(0);

            }

            private void readDirectoryGame(String id_user) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        //KEMBALI KE MODE ADMIN
        viewadmingamedetailed.btnkembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewadmingamedetailed.setVisible(false);
                viewmodeadmin.setVisible(true);
                viewadmingamedetailed.tfsearch.setText(null);
                viewadmingamedetailed.lnamaisi.setText(null);
                viewadmingamedetailed.ljenisisi.setText(null);
                viewadmingamedetailed.lpublisherisi.setText(null);
                viewadmingamedetailed.lhargaisi.setText(null);
                viewadmingamedetailed.ldeskripsiisi.setText(null);

            }
        });
        
        //KEMBALI KE MODE USER
        viewusergamedetailed.btnkembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewusergamedetailed.setVisible(false);
                viewmodeuser.setVisible(true);
                viewusergamedetailed.tfsearch.setText(null);
                viewusergamedetailed.lnamaisi.setText(null);
                viewusergamedetailed.ljenisisi.setText(null);
                viewusergamedetailed.lhargaisi.setText(null);
                viewusergamedetailed.ldeskripsiisi.setText(null);
                viewusergamedetailed.lpublisherisi.setText(null);
            }
        });
        
        //KEMBALI KE MODE USER
        viewdirectorygame.btnkembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewdirectorygame.setVisible(false);
                viewmodeuser.setVisible(true);
                viewdirectorygame.tfsearch.setText(null);
                viewdirectorygame.lnamaisi.setText(null);
                viewdirectorygame.lhargaisi.setText(null);
                viewdirectorygame.ldeskripsiisi.setText(null);
                viewdirectorygame.lpublisherisi.setText(null);
                viewdirectorygame.ltanggalisi.setText(null);
            }
        });
        
        //REFRESH DATA DI ADMIN
         viewadmingamedetailed.btnrefresh.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 String contact[][] = modelproject.readGame();
                
                 viewadmingamedetailed.tabel.setModel(new JTable(contact,viewadmingamedetailed.namaKolom).getModel());
                 viewadmingamedetailed.tabel.getColumnModel().getColumn(5).setMinWidth(0);
                 viewadmingamedetailed.tabel.getColumnModel().getColumn(5).setMaxWidth(0);
                 viewadmingamedetailed.lnamaisi.setText(null);
                 viewadmingamedetailed.ljenisisi.setText(null);
                 viewadmingamedetailed.lhargaisi.setText(null);
                 viewadmingamedetailed.ldeskripsiisi.setText(null);
                 viewadmingamedetailed.lpublisherisi.setText(null);
                 viewadmingamedetailed.btnupdate.setEnabled(false);
                 viewadmingamedetailed.btnhapus.setEnabled(false);
                 viewadmingamedetailed.tfsearch.setText(null);
                 
             }
         });
         
         //REFRESH DATA DI USER
         viewusergamedetailed.btnrefresh.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 String contact[][] = modelproject.readGame();
                
                 viewusergamedetailed.tabel.setModel(new JTable(contact,viewusergamedetailed.namaKolom).getModel());
                 viewusergamedetailed.tabel.getColumnModel().getColumn(5).setMinWidth(0);
                 viewusergamedetailed.tabel.getColumnModel().getColumn(5).setMaxWidth(0);
                 viewusergamedetailed.lnamaisi.setText(null);
                 viewusergamedetailed.ljenisisi.setText(null);
                 viewusergamedetailed.lhargaisi.setText(null);
                 viewusergamedetailed.ldeskripsiisi.setText(null);
                 viewusergamedetailed.lpublisherisi.setText(null);
                 viewusergamedetailed.btncheckout.setEnabled(false);
                 viewusergamedetailed.tfsearch.setText(null);
                 
             }
         });
         
         //REFRESH DATA DIRECTORY GAME USER
         viewdirectorygame.btnrefresh.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 String namauser = viewmodeuser.lnama.getText();
                 String id_user = modelproject.getIdUser(namauser);
                 String data[][] = modelproject.readDirectoryGame(id_user);
                
                 viewdirectorygame.tabel.setModel(new JTable(data,viewdirectorygame.namaKolom).getModel());
                 viewdirectorygame.tabel.getColumnModel().getColumn(5).setMinWidth(0);
                 viewdirectorygame.tabel.getColumnModel().getColumn(5).setMaxWidth(0);
                 viewdirectorygame.lnamaisi.setText(null);
                 viewdirectorygame.lhargaisi.setText(null);
                 viewdirectorygame.ldeskripsiisi.setText(null);
                 viewdirectorygame.lpublisherisi.setText(null);
                 viewdirectorygame.ltanggalisi.setText(null);
                 viewdirectorygame.tfsearch.setText(null);
                 
             }
         });
         
        //SEARCH DATA DI ADMIN
         viewadmingamedetailed.btnsearch.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                    String cari = viewadmingamedetailed.tfsearch.getText();
                    String data[][] = modelproject.getGameSearch(cari);
                    viewadmingamedetailed.tabel.setModel(new JTable(data, viewadmingamedetailed.namaKolom).getModel());
                    viewadmingamedetailed.tabel.getColumnModel().getColumn(5).setMinWidth(0);
                    viewadmingamedetailed.tabel.getColumnModel().getColumn(5).setMaxWidth(0);
             }
         });
         
         //SEARCH DATA DI USER
         viewusergamedetailed.btnsearch.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                    String cari = viewusergamedetailed.tfsearch.getText();
                    String data[][] = modelproject.getGameSearch(cari);
                    viewusergamedetailed.tabel.setModel(new JTable(data, viewusergamedetailed.namaKolom).getModel());
                    viewusergamedetailed.tabel.getColumnModel().getColumn(5).setMinWidth(0);
                    viewusergamedetailed.tabel.getColumnModel().getColumn(5).setMaxWidth(0);
             }
         });
         
        //SEARCH DATA GAME PUNYA USER
         viewdirectorygame.btnsearch.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                    String cari = viewdirectorygame.tfsearch.getText();
                    String namauser = viewmodeuser.lnama.getText();
                    String id_user = modelproject.getIdUser(namauser);
                    System.out.println(id_user);
                    String data[][] = modelproject.getGameDirectorySearch(cari, id_user);
                    viewdirectorygame.tabel.setModel(new JTable(data, viewdirectorygame.namaKolom).getModel());
                    viewdirectorygame.tabel.getColumnModel().getColumn(5).setMinWidth(0);
                    viewdirectorygame.tabel.getColumnModel().getColumn(5).setMaxWidth(0);
             }
         });
         
        //TAMPIL DATA DI ADMIN
         viewadmingamedetailed.tabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int baris = viewadmingamedetailed.tabel.getSelectedRow();
                int kolom = viewadmingamedetailed.tabel.getSelectedColumn();

                String dataterpilih = viewadmingamedetailed.tabel.getValueAt(baris, 0).toString();

                System.out.println(dataterpilih);
                viewadmingamedetailed.lnamaisi.setText(viewadmingamedetailed.tabel.getValueAt(baris, 0).toString());
                viewadmingamedetailed.ljenisisi.setText(viewadmingamedetailed.tabel.getValueAt(baris, 1).toString());
                viewadmingamedetailed.lpublisherisi.setText(viewadmingamedetailed.tabel.getValueAt(baris, 2).toString());
                viewadmingamedetailed.lhargaisi.setText(viewadmingamedetailed.tabel.getValueAt(baris, 3).toString());
                viewadmingamedetailed.ldeskripsiisi.setText(viewadmingamedetailed.tabel.getValueAt(baris, 4).toString());
                viewadmingamedetailed.lid.setText(viewadmingamedetailed.tabel.getValueAt(baris, 5).toString());
                
                nama = viewadmingamedetailed.lnamaisi.getText();
                publisher = viewadmingamedetailed.lpublisherisi.getText();
                harga = viewadmingamedetailed.lhargaisi.getText();
                deskripsi = viewadmingamedetailed.ldeskripsiisi.getText();
                
                viewadmingamedetailed.btnupdate.setEnabled(true);
                viewadmingamedetailed.btnhapus.setEnabled(true);
  
            }
        }
        );
        
        //TAMPIL DATA DI USER
         viewusergamedetailed.tabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int baris = viewusergamedetailed.tabel.getSelectedRow(); 
                int kolom = viewusergamedetailed.tabel.getSelectedColumn();

                String dataterpilih = viewusergamedetailed.tabel.getValueAt(baris, 0).toString();

                System.out.println(dataterpilih);
                viewusergamedetailed.lnamaisi.setText(viewusergamedetailed.tabel.getValueAt(baris, 0).toString());
                viewusergamedetailed.ljenisisi.setText(viewusergamedetailed.tabel.getValueAt(baris, 1).toString());
                viewusergamedetailed.lpublisherisi.setText(viewusergamedetailed.tabel.getValueAt(baris, 2).toString());
                viewusergamedetailed.lhargaisi.setText(viewusergamedetailed.tabel.getValueAt(baris, 3).toString());
                viewusergamedetailed.ldeskripsiisi.setText(viewusergamedetailed.tabel.getValueAt(baris, 4).toString());
                viewusergamedetailed.lid.setText(viewusergamedetailed.tabel.getValueAt(baris, 5).toString());
                
                nama = viewusergamedetailed.lnamaisi.getText();
                publisher = viewusergamedetailed.lpublisherisi.getText();
                harga = viewusergamedetailed.lhargaisi.getText();
                deskripsi = viewusergamedetailed.ldeskripsiisi.getText();
                id_game = viewusergamedetailed.lid.getText();
                
                viewusergamedetailed.btncheckout.setEnabled(true);
            }
        }
        );
         
        //TAMPIL DATA DIRECTORY GAME USER
         viewdirectorygame.tabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int baris = viewdirectorygame.tabel.getSelectedRow(); 
                int kolom = viewdirectorygame.tabel.getSelectedColumn();

                String dataterpilih = viewdirectorygame.tabel.getValueAt(baris, 0).toString();

                System.out.println(dataterpilih);
                viewdirectorygame.lnamaisi.setText(viewdirectorygame.tabel.getValueAt(baris, 0).toString());
                viewdirectorygame.lpublisherisi.setText(viewdirectorygame.tabel.getValueAt(baris, 1).toString());
                viewdirectorygame.lhargaisi.setText(viewdirectorygame.tabel.getValueAt(baris, 2).toString());
                viewdirectorygame.ldeskripsiisi.setText(viewdirectorygame.tabel.getValueAt(baris, 3).toString());
                viewdirectorygame.ltanggalisi.setText(viewdirectorygame.tabel.getValueAt(baris, 4).toString());
            }
        }
        );
         
        //PINDAH KE WINDOW TAMBAH GAME DARI ADMIN GAME DETAILED
         viewadmingamedetailed.btntambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewadmingamedetailed.setVisible(false);
                viewtambahgame.setVisible(true);
                viewadmingamedetailed.tfsearch.setText(null);
                viewadmingamedetailed.lnamaisi.setText(null);
                viewadmingamedetailed.ljenisisi.setText(null);
                viewadmingamedetailed.lpublisherisi.setText(null);
                viewadmingamedetailed.lhargaisi.setText(null);
                viewadmingamedetailed.ldeskripsiisi.setText(null);
            }
        });
         
        //HAPUS DATA DI ADMIN
         viewadmingamedetailed.btnhapus.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        
                                 String id = viewadmingamedetailed.lid.getText();
                                 modelproject.hapusGame(id);
                                 String datakontak[][] = modelproject.readGame();
                                 viewadmingamedetailed.tabel.setModel((new JTable(datakontak, viewadmingamedetailed.namaKolom)).getModel());
                                 viewadmingamedetailed.tabel.getColumnModel().getColumn(4).setMinWidth(0);
                                 viewadmingamedetailed.tabel.getColumnModel().getColumn(4).setMaxWidth(0);
                                 viewadmingamedetailed.lnamaisi.setText(null);
                                 viewadmingamedetailed.lpublisherisi.setText(null);
                                 viewadmingamedetailed.lhargaisi.setText(null);
                                 viewadmingamedetailed.ljenisisi.setText(null);
                                 viewadmingamedetailed.ldeskripsiisi.setText(null);
                                 viewadmingamedetailed.tfsearch.setText(null);

                    }
        });
        
        //UPDATE DATA DI ADMIN
        viewadmingamedetailed.btnupdate.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        
                        viewupdategame.setVisible(true);
                        viewadmingamedetailed.setVisible(false);
                        
                        viewupdategame.tfnama.setText(nama);
                        viewupdategame.tfpublisher.setText(publisher);
                        viewupdategame.tfharga.setText(harga);
                        viewupdategame.tfdeskripsi.setText(deskripsi);
                    }
        });
        
        //CHECKOUT GAME USER //BELUM SELESAI
        viewusergamedetailed.btncheckout.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {          
                        //INPUT ID & SET WAKTU
                        String namauser = viewmodeuser.lnama.getText();
                        String id_user = modelproject.getIdUser(namauser);
                        String game = viewusergamedetailed.lnamaisi.getText() ;
                        String jenis = viewusergamedetailed.ljenisisi.getText() ;
                        viewcheckout.setVisible(true);
                        viewusergamedetailed.setVisible(false);
                        
                        //viewcheckout.tfid_user.setText(); //id_user belum dapat
                        viewcheckout.lid_user.setText(id_user);
                        viewcheckout.lid_game.setText(id_game);
                        viewcheckout.ltanggal.setText(tanggal());
                        viewcheckout.lnama_game.setText(game);
                        viewcheckout.lnama_jenis.setText(jenis);
                    }
        });
        
        //PINDAH KE ADMIN GAME DETAILED DARI UPDATE GAME
        viewupdategame.btnkembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewupdategame.setVisible(false);
                viewadmingamedetailed.setVisible(true);
            }
        });
        
        //PINDAH KE USER GAME DETAILED DARI CHECKOUT GAME
        viewcheckout.btnkembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewcheckout.setVisible(false);
                viewusergamedetailed.setVisible(true);
            }
        });
        
        //EDIT DATA GAME
        viewupdategame.btnedit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                  nama = viewupdategame.tfnama.getText();
                  publisher = viewupdategame.tfpublisher.getText();
                  harga = viewupdategame.tfharga.getText();
                  deskripsi= viewupdategame.tfdeskripsi.getText();
                  String id = viewadmingamedetailed.lid.getText();
                 
                 modelproject.updateGame(id,nama, publisher, harga, deskripsi);
                 String contact[][] = modelproject.readGame();
                 viewadmingamedetailed.tabel.setModel(new JTable(contact,viewadmingamedetailed.namaKolom).getModel());
                 viewadmingamedetailed.tabel.getColumnModel().getColumn(5).setMinWidth(0);
                 viewadmingamedetailed.tabel.getColumnModel().getColumn(5).setMaxWidth(0);
                 viewadmingamedetailed.lnamaisi.setText(nama);
                 viewadmingamedetailed.lpublisherisi.setText(publisher);
                 viewadmingamedetailed.lhargaisi.setText(harga);
                 viewadmingamedetailed.ldeskripsiisi.setText(deskripsi);
                 viewupdategame.setVisible(false);
                 viewadmingamedetailed.setVisible(true);
            }
        });
        
        viewloginuser.lRegister.addMouseListener(new MouseListener() {
            public void mouseReleased(MouseEvent e) {
            }

            public void mousePressed(MouseEvent e) {
            }

            public void mouseExited(MouseEvent e) {
            }

            public void mouseEntered(MouseEvent e) {
            }

            public void mouseClicked(MouseEvent e) {
                viewloginuser.setVisible(false);
                viewregisteruser.setVisible(true);
            }
        });
        
        //KEMBALI KE LOGIN USER
        viewregisteruser.btnkembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewregisteruser.setVisible(false);
                viewloginuser.setVisible(true);
                viewregisteruser.tfUsername.setText(null);
                viewregisteruser.tfPass.setText(null);
                viewregisteruser.tfEmail.setText(null);
                viewregisteruser.tfContact.setText(null);
            }
        });
        
        
    }
    
    public static String tanggal () {
        Calendar kalender = new GregorianCalendar();
        int tahun = kalender.get(Calendar.YEAR);
        int bulan = kalender.get(Calendar.MONTH)+1;
        int hari = kalender.get(Calendar.DAY_OF_MONTH);
        String waktu = tahun + "-" + bulan + "-" + hari;
        return waktu ;
    }
    
}

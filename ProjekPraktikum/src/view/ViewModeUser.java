package view;





import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ViewModeUser extends JFrame{
    public Font fnama;
    public Label lnama;
    public JButton btnlogout,btncheckgame, btndirectorygame;
    
    public ViewModeUser () { 
        
           setLayout(null);
           setVisible(false);
           setSize(350,400);
           setDefaultCloseOperation(EXIT_ON_CLOSE);
           setLocationRelativeTo(null);
           setBackground(new java.awt.Color(204,204,204));
           setTitle("Legend");
           
           lnama = new Label();
           add(lnama);
           
           btncheckgame = new JButton("Game Shop");
           add(btncheckgame);
           
           btndirectorygame = new JButton("Directory Game");
           add(btndirectorygame);
           
           btnlogout = new JButton("Logout");
           add(btnlogout);
           
           fnama = new Font("Helvetica", Font.BOLD, 21);

           lnama.setBounds(130,20,200,30);
           lnama.setFont(fnama);
           
           btncheckgame.setBounds(80,100,180,30);
           btncheckgame.setBackground(Color.BLACK);
           btncheckgame.setForeground(Color.GREEN);
           
           btndirectorygame.setBounds(80,150,180,30);
           btndirectorygame.setBackground(Color.BLACK);
           btndirectorygame.setForeground(Color.CYAN);
           
           btnlogout.setBounds(80,200,180,30);
           btnlogout.setBackground(Color.BLACK);
           btnlogout.setForeground(Color.RED);
    }
    
}


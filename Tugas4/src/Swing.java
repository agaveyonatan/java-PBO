/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Agave-PC
 */
import javax.swing.*;
import java.awt.Font;
import java.awt.Color;

public class Swing extends JFrame {
    JLabel labelJudul = new JLabel("DATA PRODUK");
    JTextField inputNamaProduk = new JTextField(10);
    JTextField inputKodeProduk = new JTextField(10);
    JLabel labelNamaProduk = new JLabel("Nama Produk");
    JLabel labelKodeProduk = new JLabel("Kode Produk");
    JLabel labelJenisProduk = new JLabel("Jenis Produk");
    JRadioButton buttonFood = new JRadioButton("Makanan");
    JRadioButton buttonDrink = new JRadioButton("Minuman");
     
    JLabel labelMerk = new JLabel("Merk");
    String [] listMerk = {"ABC", "Nestle", "Indofood" , "Nutrifood" , "Barrons"};
    JComboBox comboMerk = new JComboBox(listMerk);
     
    JLabel labelSumber = new JLabel("Sumber");
    JCheckBox comboIn = new JCheckBox("Dalam Negeri");
    JCheckBox comboOut = new JCheckBox("Luar Negeri");
    
    JButton buttonInput = new JButton( "Input");
    JButton buttonReset = new JButton( "Reset");
    public Swing () {
        setTitle("Data Produk");
        setVisible(true);
        setLayout(null);
        setSize(600,400);
        
        ButtonGroup group = new ButtonGroup();
        group.add(buttonFood); 
        group.add(buttonDrink);
        
        add(labelJudul);
        add(labelNamaProduk);
        add(labelKodeProduk);
        add(inputNamaProduk);
        add(inputKodeProduk);
        add(labelJenisProduk);
        add(buttonFood);
        add(buttonDrink);
        add(labelMerk);
        add(comboMerk);
        add(labelSumber);
        add(comboIn);
        add(comboOut);
        add(buttonInput);
        add(buttonReset);
        
        labelJudul.setBounds(155,25,200,30);
        labelJudul.setFont(new java.awt.Font("Serif",0,20));
        labelNamaProduk.setBounds(50,90,120,20);
        inputNamaProduk.setBounds(170,90,150,20);
        labelKodeProduk.setBounds(50,120,120,20);
        inputKodeProduk.setBounds(170,120,150,20);
        labelMerk.setBounds(50,150,120,20);
        comboMerk.setBounds(170,150,120,20);
        labelJenisProduk.setBounds(50,180,120,20);
        buttonFood.setBounds(170,180,120,20);
        buttonDrink.setBounds(300,180,120,20);
        labelSumber.setBounds(50,210,120,20);
        comboIn.setBounds(170,210,120,20);
        comboOut.setBounds(300,210,120,20);
        buttonInput.setBounds(70,270,120,20);
        buttonInput.setBackground(Color.blue);
        buttonInput.setForeground(Color.white);
        buttonReset.setBounds(240,270,120,20);
        buttonReset.setBackground(Color.red);
        buttonReset.setForeground(Color.white);
    }
    
}
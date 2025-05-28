/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Controller.ControllerKucing;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

/**
 *
 * @author Lab Informatika
 */
public class InputData extends JFrame{
    ControllerKucing controller;
    
    JLabel header = new JLabel("Inpit Kucing");
    JLabel labelInputNamaPemilik = new JLabel("Nama Pemilik: ");
    JLabel labelInputNamaKucing = new JLabel("Nama Kucing: ");
    JLabel labelInputNoTelepon = new JLabel("Nomor Telepon: ");
    JLabel labelInputLamaPenitipan = new JLabel("Lama Penitipan (Hari): ");
    JTextField inputNamaPemilik = new JTextField();
    JTextField inputNamaKucing = new JTextField();
    JTextField inputNoTelepon = new JTextField();
    JTextField inputLamaPenitipan = new JTextField();

    JButton tombolTambah = new JButton("Tambah Kucing");
    JButton tombolKembali = new JButton("Kembali");
    JButton tombolClear = new JButton("Clear");
    JButton tombolUbah = new JButton("Ubah");
    JButton tombolHapus = new JButton("Hapus");
    
    public InputData(){
        setTitle("Input Kucing");
        setVisible(true);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setSize(480, 240);
        
        add(header);
        add(labelInputNamaPemilik);
        add(labelInputNamaKucing);
        add(labelInputNoTelepon);
        add(labelInputLamaPenitipan);
        add(inputNamaPemilik);
        add(inputNamaKucing);
        add(inputNoTelepon);
        add(inputLamaPenitipan);
        add(tombolTambah);
        add(tombolClear);
        add(tombolKembali);
        add(tombolUbah);
        add(tombolHapus);
        
        header.setBounds(20,8,440,24);
        labelInputNamaPemilik.setBounds(20,32,440,24);
        inputNamaPemilik.setBounds(18,56,440,36);
        labelInputNamaKucing.setBounds(20,96,440,36);
        inputNamaKucing.setBounds(18,120,440,36);
        labelInputNoTelepon.setBounds(20,160,440,48);
        inputNoTelepon.setBounds(18,184,440,48);
        labelInputLamaPenitipan.setBounds(20,258,440,60);
        inputNamaPemilik.setBounds(18,280,440,60);
        tombolKembali.setBounds(20,320,215,40);
        tombolTambah.setBounds(240,320,215,40);
        tombolClear.setBounds(20,320,215,40);
        tombolUbah.setBounds(240,320,215,40);
        tombolHapus.setBounds(20,320,215,40);
        
        controller = new ControllerKucing(this);
        
        tombolKembali.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                dispose();
                new ViewData();
            }
        });
        
        tombolTambah.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                controller.insertKucing();
            }
        };
        
    JButton tombolClear = new JButton("Clear");
    
    add(tombolClear);
    tombolClear.setBounds(20, 200, 440, 36);
    
    tombolClear.addActionListener(new ActionListener(){
        @Override
            public void actionPerformed(ActionEvent e){
                inputNamaPemilik.setText("");
                inputNamaKucing.setText("");
                inputNoTelepon.setText("");
                inputLamaPenitipan.setText("");
            }
    });

    public String getInputNamaPemilik(){
        return inputNamaPemilik.getText();
    }
    
    public String getInputNamaKucing(){
        return inputNamaKucing.getText();
    }

    public String getInputNoTelepon(){
        return inputNoTelepon.getText();
    }
    
    public String getInputLamaPenitipan(){
        return inputLamaPenitipan.getText();
    }
}

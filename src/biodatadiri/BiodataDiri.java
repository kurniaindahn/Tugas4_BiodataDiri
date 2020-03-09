/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biodatadiri;

import javax.swing.*;

/**
 *
 * @author Kurnia Indah N
 */
public class BiodataDiri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GUI g = new GUI();
    }
}

class GUI extends JFrame {
    JLabel ljudul = new JLabel ("BIODATA DIRI");
    final JTextField alamat = new JTextField (50);
    JLabel lgambar;
    JLabel lnama = new JLabel ("Kurnia Indah N");
    JLabel lttl = new JLabel ("Sragen, 22 Mei 2000");
    JLabel lagama = new JLabel ("Agama");
    String[] namaagama = {"Islam","Kristen","Khatolik","Hindhu","Budha"};
    JComboBox boxagama = new JComboBox(namaagama);
    JRadioButton rblk = new JRadioButton ("Laki-Laki");
    JRadioButton rbpr = new JRadioButton ("Perempuan");
    JLabel lalamat = new JLabel ("Alamat");
    JButton tombolEdit = new JButton ("Edit");
    JButton tombolSave = new JButton ("Save");
    
    public GUI(){
        setTitle("BIODATA DIRI");
        setDefaultCloseOperation(3);
        setSize(340,560);
        setLocation(500,100);

        lgambar = new JLabel (new ImageIcon (getClass().getResource(("Kur.jpg"))));
        ButtonGroup group = new ButtonGroup();
                    group.add(rblk);
                    group.add(rbpr);
                    
        setLayout (null);
        add(ljudul);
        add(lgambar);
        add(lnama);
        add(lttl);
        add(boxagama);
        add(rblk);
        add(rbpr);
        add(lalamat);
        add(alamat);
        add(tombolEdit);
        add(tombolSave);
   
        ljudul.setBounds(115,20,120,20);
        lgambar.setBounds(80,55,145,120);
        lnama.setBounds(110,190,120,20);
        lttl.setBounds(90,210,200,20);
        lagama.setBounds(100,230,90,20);
        boxagama.setBounds(45,250,230,20);
        rblk.setBounds(45,280,120,20);
        rbpr.setBounds(185,280,120,20);
        lalamat.setBounds(130,310,120,20);
        alamat.setBounds(45,330,230,100);
        tombolEdit.setBounds(45,450,90,30);
        tombolSave.setBounds(185,450,90,30);
        setVisible(true);
    }
}

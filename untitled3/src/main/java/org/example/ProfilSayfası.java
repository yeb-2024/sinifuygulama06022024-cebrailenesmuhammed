package org.example;

import javax.swing.*;
import java.awt.*;

public class ProfilSayfası {
    JFrame frame = new JFrame();
    JLabel label = new JLabel();

    ProfilSayfası(){

        label = new JLabel("isim cebrail");


        frame.setTitle("prfil sayısı");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout());
        frame.add(label);
        frame.setVisible(true);
    }

}

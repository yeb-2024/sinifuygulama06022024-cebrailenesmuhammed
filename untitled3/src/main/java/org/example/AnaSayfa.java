package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnaSayfa implements ActionListener {
    JFrame frame = new JFrame();
    JButton button = new JButton();

    AnaSayfa(){

        button = new JButton("buton");
        button.setBounds(200,200,100,50);
        button.setFocusable(false);
        button.addActionListener(this);
        frame.add(button);

        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if  (e.getSource() ==  button){
            frame.dispose();
            ProfilSayfası profilSayfası = new ProfilSayfası();
        }

    }
}

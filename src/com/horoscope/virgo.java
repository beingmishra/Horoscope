package com.horoscope;

import javax.swing.*;
import java.awt.*;

public class virgo {
    public static void main(String[] args) {
        JFrame fr = new JFrame();

        JLabel header = new JLabel("Virgo");
        header.setBounds(120,50,350,30);
        header.setFont(new Font("Virgo",Font.BOLD,22));
        fr.add(header);

        JLabel horo = new JLabel("Today's Horoscpe :");
        horo.setBounds(16,100,180,30);
        JTextArea horoT = new JTextArea("The fairer sex will find pleasure in both the kitchen and" +
                "\nthe dining table. Expect to host the closest in the evening " +
                "\nfor some food and drinks. You might just go all mushy and" +
                "\ngaga over your beloved too, says Ganesha. Not that they" +
                "\nwould mind.");
        horoT.setBounds(16,130,312,100);

        JLabel sign = new JLabel("Your Zodiac Sign :");
        sign.setBounds(16,250,130,30);
        JLabel signlogo = new JLabel("♍");
        signlogo.setBounds(130,250,30,30);

        JLabel lc = new JLabel("Today's Lucky Color :");
        lc.setBounds(16,300,200,30);
        JTextArea color = new JTextArea();
        color.setBackground(Color.GRAY);
        color.setBounds(150,300,30,30);

        JLabel ln = new JLabel("Today's Lucky Number :");
        ln.setBounds(16,350,200,30);
        JLabel num = new JLabel("0");
        num.setBounds(165,350,30,30);


        fr.add(sign);
        fr.add(signlogo);
        fr.add(horo);
        fr.add(horoT);
        fr.add(lc);
        fr.add(ln);
        fr.add(color);
        fr.add(num);


        // Frame attributes
        fr.setSize(360,640);
        fr.setLayout(null);
        fr.setTitle("Horoscope");
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);
    }
}

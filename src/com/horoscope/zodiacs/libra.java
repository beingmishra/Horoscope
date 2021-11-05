package com.horoscope.zodiacs;

import javax.swing.*;
import java.awt.*;

public class libra {
    public static void main(String[] args) {
        JFrame fr = new JFrame();

        JLabel header = new JLabel("Libra");
        header.setBounds(120,50,350,30);
        header.setFont(new Font("Libra",Font.BOLD,22));
        fr.add(header);

        JLabel horo = new JLabel("Today's Horoscpe :");
        horo.setBounds(16,100,180,30);
        JTextArea horoT = new JTextArea("There is all possibility of a trip for business or pleasure" +
                "\ntoday. This journey will leave a long term impact on your" +
                "\nmemory and your life. You will win every ones heart by" +
                "\nyour powerful speech. You may forget your duty towards" +
                "\nyour family as you will show more inclination in trade" +
                "\nand business.");
        horoT.setBounds(16,130,312,100);

        JLabel sign = new JLabel("Your Zodiac Sign :");
        sign.setBounds(16,250,130,30);
        JLabel signlogo = new JLabel("♌");
        signlogo.setBounds(130,250,30,30);

        JLabel lc = new JLabel("Today's Lucky Color :");
        lc.setBounds(16,300,200,30);
        JTextArea color = new JTextArea();
        color.setBackground(Color.GREEN);
        color.setBounds(150,300,30,30);

        JLabel ln = new JLabel("Today's Lucky Number :");
        ln.setBounds(16,350,200,30);
        JLabel num = new JLabel("5");
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

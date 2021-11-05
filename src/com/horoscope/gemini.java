package com.horoscope;

import javax.swing.*;
import java.awt.*;

public class gemini {
    public static void main(String[] args) {
        JFrame fr = new JFrame();

        JLabel header = new JLabel("Gemini");
        header.setBounds(120,50,350,30);
        header.setFont(new Font("Gemini",Font.BOLD,22));
        fr.add(header);

        JLabel horo = new JLabel("Today's Horoscpe :");
        horo.setBounds(16,100,180,30);
        JTextArea horoT = new JTextArea("You will feel the need to break free from the shackles of " +
                "\nyour daily routine. You will try to complete all your work in " +
                "\none go and this will give rise to mental stress and worry." +
                "\nYou will be able to concentrate on your personal matters" +
                "\nin the day, busy as you will be with work related matters" +
                "\nin the only later on afternoon. Make sure that you do not" +
                "\nend up neglecting your family in pursuit of your goals");
        horoT.setBounds(16,130,312,130);

        JLabel sign = new JLabel("Your Zodiac Sign :");
        sign.setBounds(16,280,130,30);
        JLabel signlogo = new JLabel("♊");
        signlogo.setBounds(130,280,30,30);

        JLabel lc = new JLabel("Today's Lucky Color :");
        lc.setBounds(16,330,200,30);
        JTextArea color = new JTextArea();
        color.setBackground(Color.decode("#00d2ff"));
        color.setBounds(150,330,30,30);

        JLabel ln = new JLabel("Today's Lucky Number :");
        ln.setBounds(16,380,200,30);
        JLabel num = new JLabel("8");
        num.setBounds(165,380,30,30);


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

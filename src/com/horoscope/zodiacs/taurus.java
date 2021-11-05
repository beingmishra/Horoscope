package com.horoscope.zodiacs;

import javax.swing.*;
import java.awt.*;

public class taurus {
    public static void main(String[] args) {
        JFrame fr = new JFrame();

        JLabel header = new JLabel("Taurus");
        header.setBounds(120,50,350,30);
        header.setFont(new Font("Taurus",Font.BOLD,22));
        fr.add(header);

        JLabel horo = new JLabel("Today's Horoscpe :");
        horo.setBounds(16,100,180,30);
        JTextArea horoT = new JTextArea("You will be in a mood to dominate and boss over your" +
                "\nsubordinates and assistants as soon as you land at your" +
                "\nwork place. Ganesha urges you to get rid of this idea" +
                "\ninstantly. Otherwise you are likely to lose a lot of money" +
                "\nin store for you. You are likely to feel bored and listless" +
                "\nlater in the day. Take a break and go for a small pleasure" +
                "\ntrip to some attractive and picturesque spot. That should " +
                "\npep you up.");
        horoT.setBounds(16,130,312,130);

        JLabel sign = new JLabel("Your Zodiac Sign :");
        sign.setBounds(16,280,130,30);
        JLabel signlogo = new JLabel("♉");
        signlogo.setBounds(130,280,30,30);

        JLabel lc = new JLabel("Today's Lucky Color :");
        lc.setBounds(16,330,200,30);
        JTextArea color = new JTextArea();
        color.setBackground(Color.MAGENTA);
        color.setBounds(150,330,30,30);

        JLabel ln = new JLabel("Today's Lucky Number :");
        ln.setBounds(16,380,200,30);
        JLabel num = new JLabel("22");
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

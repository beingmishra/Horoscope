package com.horoscope;

import javax.swing.*;
import java.awt.*;

public class leo {
    public static void main(String[] args) {
        JFrame fr = new JFrame();

        JLabel header = new JLabel("Leo");
        header.setBounds(120,50,350,30);
        header.setFont(new Font("Leo",Font.BOLD,22));
        fr.add(header);

        JLabel horo = new JLabel("Today's Horoscpe :");
        horo.setBounds(16,100,180,30);
        JTextArea horoT = new JTextArea("Today, you will most certainly pay close attention to your" +
                "\npersonal appearance, says Ganesha. After all, no one" +
                "\never said looking good was a crime. At work, you shall" +
                "\nfind the resources to dig up a successful business" +
                "\ntactic. If you are a job aspirant, an interview in the" +
                "\nevening shall go well. Spend some time with your partner" +
                "\n— it takes little on your part, and will go a long way in" +
                "\nstrengthening your relationship, says Ganesha");
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

package com.horoscope;

import javax.swing.*;
import java.awt.*;

public class horoPage {
    public static void main(String[] args) {

        //Fetching Data from Homepage
        String Name = Homepage.Name();
        String Number = Homepage.Num();
        String Age = Homepage.Age();
        String HoroScope = Homepage.HoroScope();
        String ZodiacImage = Homepage.ZodiacImage();
        Color LuckyColor = Homepage.LuckyColor();
        String LuckyNumber = String.valueOf(Homepage.LuckyNumber());
        String ZodiacSign = Homepage.ZodiacSign();


        // Building Frames and components
        JFrame fr = new JFrame();

        ImageIcon img = new ImageIcon(Homepage.class.getResource(ZodiacImage));
        JLabel logo = new JLabel();
        logo.setIcon(img);
        logo.setBounds(0,0,345,194);
        fr.add(logo);

        JLabel name = new JLabel("Your name : " + Name);
        name.setBounds(16, 200, 300,30);
        JLabel mobile = new JLabel("Your number : " + Number);
        mobile.setBounds(16, 240, 300,30);
        JLabel age = new JLabel("Your age : " + Age);
        age.setBounds(16, 280, 100,30);

        JLabel sign = new JLabel("Your Zodiac Sign :");
        sign.setBounds(16,320,130,30);
        JLabel signlogo = new JLabel(ZodiacSign);
        signlogo.setBounds(130,320,30,30);

        JLabel lc = new JLabel("Today's Lucky Color :");
        lc.setBounds(16,360,200,30);
        JTextArea color = new JTextArea();
        color.setBackground(LuckyColor);
        color.setBounds(150,360,30,30);

        JLabel ln = new JLabel("Today's Lucky Number :");
        ln.setBounds(16,400,200,30);
        JLabel num = new JLabel(LuckyNumber);
        num.setBounds(165,400,30,30);

        JLabel horo = new JLabel("Today's Horoscpe :");
        horo.setBounds(16,440,180,30);
        JTextArea horoT = new JTextArea(HoroScope);
        horoT.setBounds(16,480,312,130);


        // Adding components in frame
        fr.add(name);
        fr.add(num);
        fr.add(mobile);
        fr.add(age);
        fr.add(sign);
        fr.add(signlogo);
        fr.add(horo);
        fr.add(horoT);
        fr.add(lc);
        fr.add(ln);
        fr.add(color);
        fr.add(num);
        fr.add(logo);


        // Setting up frame attributes
        fr.setSize(360,660);
        fr.setLayout(null);
        fr.setTitle("Horoscope");
        fr.setResizable(false);
        fr.setLocationRelativeTo(null);
        fr.getContentPane().setBackground(Color.white);
        fr.setVisible(true);
    }
}

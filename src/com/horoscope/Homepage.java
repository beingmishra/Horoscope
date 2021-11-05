package com.horoscope;

import com.horoscope.zodiacs.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;


public class Homepage {
    public static void main(String[] args) {

        JFrame fr = new JFrame();

        ImageIcon img = new ImageIcon(Homepage.class.getResource("images/logo.png"));
        JLabel logo = new JLabel();
        logo.setIcon(img);
        logo.setBounds(220,50,90,90);
        fr.add(logo);

        JLabel header = new JLabel("Welcome to Ganesha Speaks");

        header.setBounds(120,150,350,30);
        header.setFont(new Font("Welcome to Ganesha Fortune",Font.BOLD,22));
        /*FUQ tera compiler tatti bc  chorr*/
        fr.add(header);

        JLabel Name = new JLabel("* Name : ");
        Name.setBounds(50,200, 100, 30);
        JTextField nameT = new JTextField();
        nameT.setBounds(150,200,300,30);

        JLabel Mobile = new JLabel("* Mobile : ");
        Mobile.setBounds(50,250, 100, 30);
        JTextField mobileT = new JTextField();
        mobileT.setBounds(150,250,300,30);

        JLabel dob = new JLabel("* D.O.B. : ");
        dob.setBounds(50,300, 100, 30);
        JTextField day = new JTextField("1");
        day.setBounds(150,300,40,30);
        JTextField month = new JTextField("6");
        month.setBounds(210,300,75,30);
        JTextField year = new JTextField("1996");
        year.setBounds(305,300,60,30);

        JCheckBox agree = new JCheckBox("I agree to accept the terms and conditions.");
        agree.setBounds(50,350,300,50);

        JButton submit = new JButton("Submit");
        submit.setBounds(90,400,100,50);
        submit.setBackground(Color.orange);

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameT.getText();
                String mobile = mobileT.getText();

                String yearBox = year.getText();
                String monthBox = month.getText();
                String dayBox = day.getText();
                LocalDate inputDate = LocalDate.of(Integer.parseInt(yearBox), Integer.parseInt(monthBox), Integer.parseInt(dayBox));
                getSymbol(inputDate);

                fr.dispose();

            }
        });

        // Adding components in frame
        fr.add(header);
        fr.add(Name);
        fr.add(nameT);
        fr.add(Mobile);
        fr.add(mobileT);
        fr.add(dob);
        fr.add(day);
        fr.add(month);
        fr.add(year);
        fr.add(agree);
        fr.add(submit);

        // Frame attributes
        fr.setSize(550,600);
        fr.setLayout(null);
        fr.setTitle("Horoscope");
        fr.setVisible(true);
    }

    public static void getSymbol(LocalDate date) {
        if (date.getMonthValue() == 12) {
            if (date.getDayOfMonth() < 22)
                sagittarius.main(new String[10]);
            else
                capricon.main(new String[10]);

        } else if (date.getMonthValue() == 1) {
            if (date.getDayOfMonth() < 20) {
                capricon.main(new String[10]);
            } else {
                aquarius.main(new String[10]);
            }
        } else if (date.getMonthValue() == 2) {
            if (date.getDayOfMonth() < 19) {
                aquarius.main(new String[10]);
            } else
                pisces.main(new String[10]);
        } else if (date.getMonthValue() == 3) {
            if (date.getDayOfMonth() < 21)
                pisces.main(new String[10]);
            else
                aries.main(new String[10]);
        } else if (date.getMonthValue() == 4) {
            if (date.getDayOfMonth() < 20)
                aries.main(new String[10]);
            else
                taurus.main(new String[10]);
        } else if (date.getMonthValue() == 5) {
            if (date.getDayOfMonth() < 21)
                taurus.main(new String[10]);
            else
                gemini.main(new String[10]);
        } else if (date.getMonthValue() == 6) {
            if (date.getDayOfMonth() < 21)
                gemini.main(new String[10]);
            else
                cancer.main(new String[10]);
        } else if (date.getMonthValue() == 7) {
            if (date.getDayOfMonth() < 23)
                cancer.main(new String[10]);
            else
                leo.main(new String[10]);
        } else if (date.getMonthValue() == 8) {
            if (date.getDayOfMonth() < 23)
                leo.main(new String[10]);
            else
                virgo.main(new String[10]);
        } else if (date.getMonthValue() == 9) {
            if (date.getDayOfMonth() < 23)
                virgo.main(new String[10]);
            else
                libra.main(new String[10]);
        } else if (date.getMonthValue() == 10) {
            if (date.getDayOfMonth() < 23)
                libra.main(new String[10]);
            else
                scorpio.main(new String[10]);
        } else if (date.getMonthValue() == 11) {
            if (date.getDayOfMonth() < 22)
                scorpio.main(new String[10]);
            else
                sagittarius.main(new String[10]);
        }else {
            System.out.println("");
        }
    }

}

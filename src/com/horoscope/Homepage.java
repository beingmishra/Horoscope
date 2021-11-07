package com.horoscope;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.Period;


public class Homepage {

    // Initializing Global Variables
    static String name, num, age, ZodiacName, ZodiacSign, ZodiacImage, HoroScope;
    static int LuckyNumber;
    static Color LuckyColor = null;

    public static void main(String[] args) {

        // Building Frames and components
        JFrame fr = new JFrame();

        ImageIcon img = new ImageIcon(Homepage.class.getResource("images/logo.png"));
        JLabel logo = new JLabel();
        logo.setIcon(img);
        logo.setBounds(125,50,90,90);
        fr.add(logo);

        JLabel header = new JLabel("Welcome to Ganesha Fortune");
        header.setBounds(25,150,350,30);
        header.setFont(new Font("Welcome to Ganesha Fortune",Font.BOLD,22));
        fr.add(header);

        final JLabel[] Name = {new JLabel("* Name : ")};
        Name[0].setBounds(16,200, 100, 30);
        JTextField nameT = new JTextField();
        nameT.setBounds(80,200,250,30);

        JLabel Mobile = new JLabel("* Mobile : ");
        Mobile.setBounds(16,250, 100, 30);
        JTextField mobileT = new JTextField();
        mobileT.setBounds(80,250,250,30);

        JLabel dob = new JLabel("* D.O.B. : ");
        dob.setBounds(16,300, 100, 30);
        JTextField day = new JTextField("1");
        day.setBounds(80,300,30,30);
        JTextField month = new JTextField("6");
        month.setBounds(130,300,30,30);
        JTextField year = new JTextField("1996");
        year.setBounds(180,300,60,30);

        JCheckBox agree = new JCheckBox("I agree to accept the terms and conditions.");
        agree.setBounds(16,350,300,50);
        agree.setBackground(Color.white);

        JButton submit = new JButton("Submit");
        submit.setBounds(0,400,345,50);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.white);

        // ActionListener on Submit Button
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (agree.isSelected()==true){
                    name = nameT.getText();
                    num = mobileT.getText();

                    String yearBox = year.getText();
                    String monthBox = month.getText();
                    String dayBox = day.getText();
                    LocalDate inputDate = LocalDate.of(Integer.parseInt(yearBox), Integer.parseInt(monthBox), Integer.parseInt(dayBox));
                    Period p = Period.between(inputDate, LocalDate.now());
                    age = String.valueOf(p.getYears());

                    ZodiacName = getSymbol(inputDate);
                    HoroScope = getDescription(ZodiacName);
                    ZodiacImage = getImage(ZodiacName);
                    LuckyColor = getColor(ZodiacName);
                    LuckyNumber = getNumber(ZodiacName);
                    ZodiacSign = getSign(ZodiacName);

                    horoPage.main(new String[10]);
                    fr.dispose();
                }else{
                    JOptionPane.showMessageDialog(fr,"Please agree to Terms & Conditions","Alert",JOptionPane.WARNING_MESSAGE);
                }


            }
        });

        // Adding components in frame
        fr.add(header);
        fr.add(Name[0]);
        fr.add(nameT);
        fr.add(Mobile);
        fr.add(mobileT);
        fr.add(dob);
        fr.add(day);
        fr.add(month);
        fr.add(year);
        fr.add(agree);
        fr.add(submit);

        // Setting up frame attributes
        fr.setSize(360,500);
        fr.setLayout(null);
        fr.setTitle("Horoscope");
        fr.setLocationRelativeTo(null);
        fr.setResizable(false);
        fr.getContentPane().setBackground(Color.white);
        fr.setVisible(true);
    }

    //Methods to Fetch Data

    public static String getSymbol(LocalDate date) {
        String symbol = "";
        if (date.getMonthValue() == 12) {
            if (date.getDayOfMonth() < 22)
                symbol = "Sagittarius";
            else
                symbol = "Capricorn";

        } else if (date.getMonthValue() == 1) {
            if (date.getDayOfMonth() < 20) {
                symbol = "Capricorn";
            } else {
                symbol = "Aquarius";
            }
        } else if (date.getMonthValue() == 2) {
            if (date.getDayOfMonth() < 19) {
                symbol = "Aquarius";
            } else
                symbol = "Pisces";
        } else if (date.getMonthValue() == 3) {
            if (date.getDayOfMonth() < 21)
                symbol = "Pisces";
            else
                symbol = "Aries";
        } else if (date.getMonthValue() == 4) {
            if (date.getDayOfMonth() < 20)
                symbol = "Aries";
            else
                symbol = "Taurus";
        } else if (date.getMonthValue() == 5) {
            if (date.getDayOfMonth() < 21)
                symbol = "Taurus";
            else
                symbol = "Gemini";
        } else if (date.getMonthValue() == 6) {
            if (date.getDayOfMonth() < 21)
                symbol = "Gemini";
            else
                symbol = "Cancer";
        } else if (date.getMonthValue() == 7) {
            if (date.getDayOfMonth() < 23)
                symbol = "Cancer";
            else
                symbol = "Leo";
        } else if (date.getMonthValue() == 8) {
            if (date.getDayOfMonth() < 23)
                symbol = "Leo";
            else
                symbol = "Virgo";
        } else if (date.getMonthValue() == 9) {
            if (date.getDayOfMonth() < 23)
                symbol = "Virgo";
            else
                symbol = "Libra";
        } else if (date.getMonthValue() == 10) {
            if (date.getDayOfMonth() < 23)
                symbol = "Libra";
            else
                symbol = "Scorpio";
        } else if (date.getMonthValue() == 11) {
            if (date.getDayOfMonth() < 22)
                symbol = "Scorpio";
            else
                symbol = "Sagittarius";
        }
        return symbol;
    }

    public static String getDescription(String symbol) {
        String description = "";
        switch (ZodiacName) {
            case "Sagittarius":
                description = todayHoro.sagittarius();
                break;
            case "Aries":
                description = todayHoro.aries();
                break;
            case "Taurus":
                description = todayHoro.taurus();
                break;
            case "Gemini":
                description = todayHoro.gemini();
                break;
            case "Cancer":
                description = todayHoro.cacncer();
                break;
            case "Leo":
                description = todayHoro.leo();
                break;
            case "Virgo":
                description = todayHoro.virgo();
                break;
            case "Libra":
                description = todayHoro.libra();
                break;
            case "Scorpio":
                description = todayHoro.scorpio();
                break;
            case "Capricorn":
                description = todayHoro.capricorn();
                break;
            case "Aquarius":
                description = todayHoro.aquarius();
                break;
            case "Pisces":
                description = todayHoro.pisces();
                break;
            default:
        }
        return description;
    }

    public static String getImage(String symbol) {
        String image = "";
        switch (ZodiacName) {
            case "Sagittarius":
                image = "images/sagittarius.png";
                break;
            case "Aries":
                image = "images/aries.png";
                break;
            case "Taurus":
                image = "images/taurus.png";
                break;
            case "Gemini":
                image = "images/gemini.png";
                break;
            case "Cancer":
                image = "images/cancer.png";
                break;
            case "Leo":
                image = "images/leo.png";
                break;
            case "Virgo":
                image = "images/virgo.png";
                break;
            case "Libra":
                image = "images/libra.png";
                break;
            case "Scorpio":
                image = "images/scorpio.png";
                break;
            case "Capricorn":
                image = "images/capricorn.png";
                break;
            case "Aquarius":
                image = "images/aquarius.png";
                break;
            case "Pisces":
                image = "images/pisces.png";
                break;
            default:
        }
        return image;
    }

    public static Color getColor(String symbol) {
        Color color = null;
        switch (ZodiacName) {
            case "Sagittarius":
                color = Color.pink;
                break;
            case "Aries":
                color = Color.BLUE;
                break;
            case "Taurus":
                color = Color.MAGENTA;
                break;
            case "Gemini":
                color = Color.GRAY;
                break;
            case "Cancer":
                color = Color.RED;
                break;
            case "Leo":
                color = Color.orange;
                break;
            case "Virgo":
                color = Color.white;
                break;
            case "Libra":
                color = Color.black;
                break;
            case "Scorpio":
                color = Color.CYAN;
                break;
            case "Capricorn":
                color = Color.RED;
                break;
            case "Aquarius":
                color = Color.GREEN;
                break;
            case "Pisces":
                color = Color.BLACK;
                break;
            default:
        }
        return color;
    }

    public static int getNumber(String symbol) {
        int num = 0;
        switch (ZodiacName) {
            case "Sagittarius":
                num = 6;
                break;
            case "Aries":
                num = 4;
                break;
            case "Taurus":
                num = 22;
                break;
            case "Gemini":
                num = 13;
                break;
            case "Cancer":
                num = 9;
                break;
            case "Leo":
                num = 3;
                break;
            case "Virgo":
                num = 2;
                break;
            case "Libra":
                num = 5;
                break;
            case "Scorpio":
                num = 11;
                break;
            case "Capricorn":
                num = 15;
                break;
            case "Aquarius":
                num = 1;
                break;
            case "Pisces":
                num = 7;
                break;
            default:
        }
        return num;
    }

    public static String getSign(String symbol) {
        String sign = "";
        switch (ZodiacName) {
            case "Sagittarius":
                sign = "♐";
                break;
            case "Aries":
                sign = "♈";
                break;
            case "Taurus":
                sign = "♉";
                break;
            case "Gemini":
                sign = "♊";
                break;
            case "Cancer":
                sign = "♋";
                break;
            case "Leo":
                sign = "♌";
                break;
            case "Virgo":
                sign = "♍";
                break;
            case "Libra":
                sign = "♎";
                break;
            case "Scorpio":
                sign = "♏";
                break;
            case "Capricorn":
                sign = "♑";
                break;
            case "Aquarius":
                sign = "♒";
                break;
            case "Pisces":
                sign = "♓";
                break;
            default:
        }
        return sign;
    }

    public static String Name(){
        return name;
    }

    public static String Num(){
        return num;
    }

    public static String Age(){
        return age;
    }

    public static String HoroScope(){
        return HoroScope;
    }

    public static String ZodiacImage(){
        return ZodiacImage;
    }

    public static Color LuckyColor(){
        return LuckyColor;
    }

    public static int LuckyNumber(){
        return LuckyNumber;
    }

    public static String ZodiacSign(){
        return ZodiacSign;
    }

}

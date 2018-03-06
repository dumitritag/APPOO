package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class Person implements FlowerVisitor{
    private String name;
    private double money;


    public void setMoney(double money) {
        this.money = money;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){

        return name;

    }

    public double getMoney(){

        return money;

    }

    public void transaction(double money){

        this.money+=money;

    }

    public double calculate(Flowers flowers){

        return flowers.getPrice();

    }

    JFrame editorFrame;

    ImageIcon imageIcon;

    BufferedImage image;

    JLabel jLabel;

    @Override
    public void view() {

        editorFrame = new JFrame("MintFlower");

        editorFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        image=null;

        try{

            image = ImageIO.read(new File("D:/mintflower.jpg"));

        }

        catch (Exception e)

        {

            e.printStackTrace();

            System.exit(1);

        }

        imageIcon = new ImageIcon(image);

        jLabel = new JLabel();

        jLabel.setIcon(imageIcon);

        editorFrame.getContentPane().add(jLabel, BorderLayout.CENTER);

        editorFrame.pack();

        editorFrame.setLocationRelativeTo(null);

        editorFrame.setVisible(true);
    }

}


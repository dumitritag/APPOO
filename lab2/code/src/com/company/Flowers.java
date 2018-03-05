package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

class Flowers implements Flower{

    private int amount;
    private double price;
    private String name;


    public Flowers(int amount, double price, String name){

        this.amount=amount;
        this.price=price;
        this.name=name;

    }

    public double accept(FlowerVisitor flowerVisitor, int amount, double userMoney, boolean isOwner){
        if(!isOwner){

            if(amount>this.amount){
                System.out.println("Nu avem atât de multe flori în stoc!");
                return 0;

            }
            int actualAmount=checkInventory(amount);

            double actualPrice=actualAmount*flowerVisitor.calculate(this);

            if(userMoney<actualPrice){
                System.out.println("Nu aveți suficienți bani pentru a efectua această tranzacție!");
                return 0;

            }

            if(actualAmount>0){

                System.out.print("Ați cumpărat "+actualAmount+" flori de ");

                System.out.printf("%.2f",actualPrice);

                System.out.println("lei.");

                System.out.println();

                System.out.println("Acum sunt "+getAmount()+" flori în stoc.");

            }

            return actualPrice;

        }

        else{

            double orderPrice=amount*flowerVisitor.calculate(this);

            if(userMoney<orderPrice){

                System.out.println("Nu aveți suficienți bani pentru a efectua această tranzacție!");

                return 0;

            }

            else{

                this.amount+=amount;

                System.out.print("Ați cumpărat "+amount+" flori de");

                System.out.printf("%.2f",orderPrice);

                System.out.println("lei.");

                System.out.println();

                System.out.println("Acum sunt "+getAmount()+" flori în stoc.");

            }

            return orderPrice;

        }

    }

    public double getPrice(){

        return this.price;

    }

    public void setPrice(double price){

        this.price=price;

        System.out.println("Prețul a fost schimbat în"+this.price+"lei");

    }

    public int getAmount(){

        return this.amount;

    }

    public int checkInventory(int amount){

        int actualBought=0;

        for(int i=0;i<amount;i++){

            if(this.amount>0){

                this.amount--;

                actualBought++;

            }

        }

        if(this.amount==0){

            System.out.println("Aceste flori nu sunt în stoc!");

        }

        return actualBought;

    }
    JFrame editorFrame;

    ImageIcon imageIcon;

    BufferedImage image;

    JLabel jLabel;

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

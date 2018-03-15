package com.company;


class Flowers implements Flower{

    private int amount;
    private double price;
    private String name;


    public Flowers(int amount, double price, String name){

        this.amount=amount;
        this.price=price;
        this.name=name;

    }

    public double buyFlowers(FlowersPrice flowersPrice, int amount, double userMoney){

            if(amount>this.amount){
                System.out.println("Nu avem atât de multe flori în stoc!");
                return 0;

            }
            int actualAmount=checkInventory(amount);

            double actualPrice=actualAmount*flowersPrice.calculate(this);

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


    public double getPrice(){

        return this.price;

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

}

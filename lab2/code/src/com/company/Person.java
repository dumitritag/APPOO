package com.company;

public class Person{
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


}


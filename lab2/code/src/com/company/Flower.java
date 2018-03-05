package com.company;

public interface Flower {
    public double accept( FlowerVisitor flowerVisitor, int amount, double userMoney, boolean isOwner);
    public void view();

}
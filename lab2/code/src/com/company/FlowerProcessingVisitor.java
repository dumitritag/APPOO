package com.company;

public class FlowerProcessingVisitor implements FlowerVisitor {
    public double calculate(Flowers flowers){

        return flowers.getPrice();

    }
}

package com.company;

public class Lenovo implements Laptop
{
    @Override
    public void modelName() {
        System.out.println("Lenovo Yoga Slim 7");
    }

    @Override
    public void getPrice() {
        System.out.println("Price of Lenovo Yoga SLim 7 is 70000");
    }
}

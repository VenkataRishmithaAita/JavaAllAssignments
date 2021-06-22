package com.company;


public class Acer implements Laptop
{
    @Override
    public void modelName()
    {
        System.out.println("ACER Aspiron 1515-56");
    }
    @Override
    public void getPrice()
    {
        System.out.println("Price of ACER Aspiron 1515-56 is 56000");
    }
}


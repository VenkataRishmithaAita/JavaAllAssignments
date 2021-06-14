package com.company.solid_principles;


public abstract class Laptop {
    String brand_name;
    public Laptop(String brand_name)
    {
        this.brand_name=brand_name;
    }
    public abstract void getSystemMemory();
    public abstract void getAvailableMemory();
}




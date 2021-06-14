package com.company.voilationCode;


public abstract class ViolationLaptop
{
    String brand_name;
    public ViolationLaptop(String brand_name)
    {
        this.brand_name=brand_name;
    }
    public abstract void getSystemMemory();
    public abstract void getAvailableMemory();
    public void getScreenSize()
    {
        System.out.println("Screen size"+15.4);
    }
    public void getDisplayType()
    {
        System.out.println("LCD In Plane Switching");
    }
}



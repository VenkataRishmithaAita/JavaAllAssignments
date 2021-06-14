package com.company.solid_principles;
public class ACER extends Laptop implements Screen
{
    public ACER()
    {
        super("ACER");
    }
    public void getSystemMemory()
    {
        System.out.println("System Memory is "+4+"GB");
    }
    public void getAvailableMemory()
    {
        System.out.println("Available memory is "+2+"GB");
    }

    @Override
    public void getScreenSize() {
        System.out.println("Screen Size "+15.6+" inch");
    }
}



package com.company.solid_principles;
public class NEWACER extends ACER
{
    public void getSystemMemory()
    {
        System.out.println("System memory  is "+8+"GB");
    }

    @Override
    public void getAvailableMemory() {
        System.out.println("Available memory is "+7+"GB");
    }
}



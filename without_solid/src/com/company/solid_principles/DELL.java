package com.company.solid_principles;

public class DELL extends Laptop implements FingerPrintSensor,Screen
{
    public DELL()
    {
        super("DELL");
    }
    public void getSystemMemory()
    {
        System.out.println("System Memory is "+8+"GB");
    }
    public void getAvailableMemory()
    {
        System.out.println("Available memory is "+6+"GB");
    }

    @Override
    public void getScreenSize() {
        System.out.println("Screen Size "+12+" inch");

    }

    @Override
    public void fingerPrintSensor() {
        System.out.println("DELL Laptop has Finger Print Sensor");
    }
}




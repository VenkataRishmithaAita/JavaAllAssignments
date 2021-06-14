package com.company.voilationCode;
public class ACER extends ViolationLaptop implements ExtraFeatures
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
        System.out.println("Available Memory is "+2+"GB");
    }
    public void touchScreen()
    {
        System.out.println("Touch Screen Available");
    }
    public void fingerPrintSensor()
    {
        System.out.println("Finger Print sensor Available");
    }
}


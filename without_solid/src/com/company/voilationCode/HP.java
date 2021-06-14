package com.company.voilationCode;
public class HP extends ViolationLaptop
{
    public HP()
    {
        super("HP");
    }
    public void getSystemMemory()
    {
        System.out.println("System Memory is "+4+"GB");
    }
    public void getAvailableMemory()
    {
        System.out.println("Available Memory is "+3+"GB");
    }
}

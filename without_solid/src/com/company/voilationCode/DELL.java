package com.company.voilationCode;
public class DELL extends ViolationLaptop
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
        System.out.println("Available Memory is "+6+"GB");
    }
}

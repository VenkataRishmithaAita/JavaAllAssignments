package com.company.solid_principles;
public class HP extends Laptop implements TouchScreen,Screen {
    public HP() {
        super("HP");
    }

    public void getSystemMemory() {
        System.out.println("System Memory is " + 4 + "GB");
    }

    public void getAvailableMemory() {
        System.out.println("Available memory is " + 3 + "GB");
    }

    @Override
    public void getScreenSize() {
        System.out.println("Screen Size "+11+" inch");
    }

    @Override
    public void touchScreen() {
        System.out.println("HP Laptop has touch screen feature");
    }
}

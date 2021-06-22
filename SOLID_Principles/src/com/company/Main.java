package com.company;

import java.util.Arrays;

interface Features
{
    public void getFeatures();
}
class KnownFeatures implements Features
{
    public void getFeatures()
    {
        System.out.println("Operating System used is "+"Windows");
        System.out.println("Generation of Operating System is "+10);
        System.out.println("No of cores in Laptop is "+4);

    }
}
class GivenFeatures
{
    public static Features getFeaturesThing()
    {
        return new KnownFeatures();
    }
}
interface TouchScreen
{
    public void touchScreen();
}
interface FingerPrintSensor
{
    public void fingerPrintSensor();
}

abstract class Laptop {
    String brand_name;
    public Laptop(String brand_name)
    {
        this.brand_name=brand_name;
    }
    public abstract void getSystemMemory();
    public abstract void getAvailableMemory();
    }
    class Screen
    {
        public void getScreenSize()
        {
            System.out.println("Screen Size "+15.6+" inch");
        }
    }
class DELL extends Laptop implements FingerPrintSensor
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
    public void fingerPrintSensor() {
        System.out.println("DELL Laptop has Finger Print Sensor");
    }
}
class HP extends Laptop implements TouchScreen {
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
    public void touchScreen() {
        System.out.println("HP Laptop has touch screen feature");
    }
}
    class ACER extends Laptop
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

}
class newACER extends ACER
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

public class Main {

    public static void main(String[] args) {
	ACER acer_lap=new ACER();
	acer_lap.getSystemMemory();
	acer_lap.getAvailableMemory();
		/*the LSP states that in an object-oriented program,
	if we substitute a superclass object reference with an object of any of its subclasses,
	the program should not break.*/
        System.out.println();
        ACER new_lap=new newACER();
	    new_lap.getSystemMemory();
	    new_lap.getAvailableMemory();
        System.out.println();
	    Features feat_temp=GivenFeatures.getFeaturesThing();
	    feat_temp.getFeatures();
	    System.out.println();
	    Screen sc=new Screen();
	    sc.getScreenSize();
    }
}

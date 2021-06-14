package com.company;

import java.sql.SQLOutput;
import java.util.Arrays;

class KnownFeatures {
    public void getFeatures() {
         int no_of_cores=4;
        System.out.println(no_of_cores);
        System.out.println("Operating System used is " + "Windows");
        System.out.println("Generation of Operating System" + 10);
    }
}
class GivenFeatures
{
    public static KnownFeatures getFeaturesThings()
    {
     return new KnownFeatures();
    }
}
interface ExtraFeatures
{
    public void touchScreen();
    public void fingerPrintSensor();
}
abstract class Laptop
{
    String brand_name;
    public Laptop(String brand_name)
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
class DELL extends Laptop
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
class HP extends Laptop
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
class ACER extends Laptop implements ExtraFeatures
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
class NEWACER extends ACER
{
    public void getSystemMemory()
    {
        System.out.println("System Memory is "+8+"GB");
    }
    public void getAvailableMemory()
    {
        System.out.println("Available Memory is "+7+"GB");
    }
    public void screenType()
    {
        System.out.println("LCD Screen");
    }
}
public class Main
{
    public static void main(String[] args) {
        ACER acer_temp=new ACER();
        acer_temp.getSystemMemory();
        acer_temp.getAvailableMemory();
        acer_temp.touchScreen();
        acer_temp.fingerPrintSensor();

        System.out.println();
        ACER new_acer =new NEWACER();
        new_acer.getSystemMemory();
        new_acer.getAvailableMemory();
        new_acer.touchScreen();
        new_acer.fingerPrintSensor();
        //new_acer.screenType();

        System.out.println();

    }
}
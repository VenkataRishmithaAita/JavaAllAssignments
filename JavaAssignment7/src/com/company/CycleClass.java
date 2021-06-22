package com.company;

public class CycleClass {
public void balance()
{
    System.out.println("balance method of CycleClass");
}
}
class Unicycle extends CycleClass
{

    public void balance()
    {
        System.out.println("balance method of Unicycle");
    }
}
class Bicycle extends CycleClass
{

    public void balance()
    {
        System.out.println("balance method of Bicycle");
    }
}
class Tricycle extends CycleClass
{
    public void balance()
    {
        System.out.println("balance method of Tricycle");
    }
}

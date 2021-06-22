package com.company;
public class Factories
{
    public CycleClass getCycleClass(String cycleType)
    {
        if(cycleType=="Unicycle")
        {
            return new Unicycle();
        }
        else if(cycleType=="Bicycle")
        {
            return new Bicycle();
        }
        else if(cycleType=="Tricycle")
        {
            return new Tricycle();
        }
        return null;
    }
}
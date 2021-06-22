package com.company;

public class ConstructorOverloading {
    ConstructorOverloading(String param)
    {
        this();
        System.out.println("This is "+param+" "+"constrcutor");
    }
    ConstructorOverloading()
    {
        System.out.println("This is default constructor");
    }

}

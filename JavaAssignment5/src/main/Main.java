package com.company;
import data.*;
import singleton.*;

public class Main
{
    String temp;
    public static void main(String[] args) {
        Variable temp_variable= new Variable();
        temp_variable.getInstantVariables();
        //temp_variable.getLocalVariables();
        StaticAndNonStatic temp_staticandnonstatic=new StaticAndNonStatic();
        temp_staticandnonstatic.printString();
       // temp_staticandnonstatic=getObjects(temp);


    }
}
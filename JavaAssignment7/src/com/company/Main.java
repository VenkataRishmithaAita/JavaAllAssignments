package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	/*Rodent rodent_obj[]=new Rodent();
	rodent_obj[0]=new Mouse();
	rodent_obj[1]=new Gerbil();
	rodent_obj[2]=new Hamster();
    for(int temp=0;temp<3;temp++)
    {
        rodent_obj[temp].getColor();
        rodent_obj[temp].getSize();
        rodent_obj[temp].getFoundPlace();
    } */

        CycleClass[] c =new CycleClass[3];
        c[0]=new Unicycle();
        c[1]=new Bicycle();
        c[2]=new Tricycle();
        c[0].balance();
        c[1].balance();
        c[2].balance();
        Unicycle uni=(Unicycle)c[0];
        uni.balance();
        Bicycle bi=(Bicycle)c[1];
        bi.balance();


        Factories cycleFactory=new Factories();
        CycleClass cycle1=cycleFactory.getCycleClass("Unicycle");
        cycle1.balance();
        CycleClass cycle2=cycleFactory.getCycleClass("Bicycle");
        cycle2.balance();
        CycleClass cycle3=cycleFactory.getCycleClass("Tricycle");
        cycle3.balance();
        System.out.println();



        InterfaceAsArguments in= new InterfaceAsArguments();
        PracticingInterfaces pr=new PracticingInterfaces();
        in.passingInterfaceOne(pr);
        in.passingInterfaceTwo(pr);
        in.passingInterfaceThree(pr);
        in.passingInteraceCombine(pr);
        System.out.println();


        System.out.println();

    SecondOuterClass sout=new SecondOuterClass();
    SecondOuterClass.SecondInnerClass sin=sout.new SecondInnerClass();
    sin.getMessage("getMessage is a method in SecondInnerClass which is inheriting FirstInnerClass");
    }

}

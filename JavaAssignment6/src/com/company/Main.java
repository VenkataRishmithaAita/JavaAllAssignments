package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        long limit = 10000000;
        long i;
        VampireNumbers temp_Vampire = new VampireNumbers();
        int n = 1;
       for (i = 0; i < limit; i++) {
            if (temp_Vampire.checkIfVampire(i) && n <= 100) {
                System.out.println(n+" "+i);
                n++;
            }
        }
        System.out.println();
        ConstructorOverloading co=new ConstructorOverloading("Parameterized");
        System.out.println();
        PracticeConstructors arrayobject[]=new PracticeConstructors[20];
        for(int k=0;k<20;k++)
        {
            arrayobject[k]= new PracticeConstructors("Passing this message");
        }

    }
}

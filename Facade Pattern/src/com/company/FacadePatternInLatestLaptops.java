package com.company;
public class FacadePatternInLatestLaptops
{
    LatestLaptop latestLaptops= new LatestLaptop();
    FacadePatternInLatestLaptops() {
        System.out.println("Latest Laptops Available with their prices:");
        latestLaptops.getLatestDellModel();
        System.out.println();
        latestLaptops.getLatestAcerModel();
        System.out.println();
        latestLaptops.getLatestLenovoModel();
        System.out.println();
        latestLaptops.getLatestHPModel();
        System.out.println();
        latestLaptops.getLatestAppleModel();
    }
}

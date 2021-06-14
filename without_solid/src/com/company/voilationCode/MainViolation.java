package com.company.voilationCode;


public class MainViolation {
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
        FixedFeatures fixed_temp =new FixedFeatures();
        fixed_temp.getFeatures();
        System.out.println();
        VariableFeatures variable_temp=new VariableFeatures();
        variable_temp.getFeatures();
    }
}

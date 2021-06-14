package com.company.solid_principles;


import java.util.Arrays;

public class Main1 {

    public static void main(String[] args) {
        ACER acer_lap = new ACER();
        acer_lap.getSystemMemory();
        acer_lap.getAvailableMemory();
        acer_lap.getScreenSize();
		/*the LSP states that in an object-oriented program,
	if we substitute a superclass object reference with an object of any of its subclasses,
	the program should not break.*/
        System.out.println();
        ACER new_lap = new NEWACER();
        new_lap.getSystemMemory();
        new_lap.getAvailableMemory();
        System.out.println();
        Features fixed_features= new FixedFeatures();
        Features variable_features=new VariableFeatures();
        fixed_features.getFeatures();
        System.out.println();
        variable_features.getFeatures();
        System.out.println();
        HP temp_hp=new HP();
        temp_hp.getScreenSize();
        temp_hp.getSystemMemory();
        System.out.println();
        DELL temp_dell=new DELL();
        temp_dell.getAvailableMemory();

    }
}

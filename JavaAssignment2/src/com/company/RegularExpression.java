package com.company;

public class RegularExpression {
    public void checkALlAlphabetsInString(String input_string)
    {
        input_string=input_string.toLowerCase();
        if(input_string.replaceAll("[^[a-z]]","").replaceAll("(.)(?=.*\\1)","").length()==26)
            System.out.println("Given input string "+input_string+" contains all alphabets");
        else
            System.out.println("Given input string " + input_string+" doesn't contain all alphabets");
    }
}

package com.company;
import java.util.regex.*;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String input=sc.nextLine();
       /* Pattern pattern =Pattern.compile("^[A-Z].*\\.");
        Matcher matching=pattern.matcher(input);*/
        if(Pattern.matches("^[A-Z].*\\.",input))
        {
            System.out.println("The Given Sentence:"+" "+input+" "+"starts with Capital Letter and ends with a period");
        }
        else if(Pattern.matches("^[A-Z].*",input)) {
            System.out.println("The Given Sentence:" + " " + input + " " + "starts with Capital Letter but doesn't end with period");
        }
        else if(Pattern.matches("\\.",input)) {
            System.out.println("The Given Sentence" + " " + input + " " + "Ends with period but doesn't starts with Capital Letter");
        }
        else {
            System.out.println("The Given Sentence" + " " + input + " " + " either doesnn't start with a Capital Letter or doesn't end with a period");
        }
    }
}

package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        String input_str=sc.next();

        CountArray  ca= new CountArray();
        ca.checkAllAlphabets(input_str);
        RegularExpression re=new RegularExpression();
        re.checkALlAlphabetsInString(input_str);

    }
}
package com.company;
import java.util.Locale;
import java.util.Scanner;
import java.util.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) throws NullPointerException,IllegalArgumentException
    {
        Scanner sc=new Scanner(System.in);
            int diffYears;
            LocalDate signupDate,presentDate,newsignUpMinus,newsignUpPlus;
            final DateTimeFormatter formatType=DateTimeFormatter.ofPattern("dd-MM-yyyy");
           signupDate=LocalDate.parse("04-02-2016",formatType);
           presentDate=LocalDate.parse("04-04-2017",formatType);
           if(presentDate.compareTo(signupDate)>0)
            {
                diffYears=presentDate.getYear()-signupDate.getYear();
                newsignUpMinus=signupDate.plusYears(diffYears).minusDays(30);
                newsignUpPlus=signupDate.plusYears(diffYears).plusDays(30);
                if(presentDate.compareTo(newsignUpPlus)>0)
                {
                    System.out.println(newsignUpMinus.format(formatType)+" "+newsignUpPlus.format(formatType));
                }
                else
                {
                    System.out.println(newsignUpMinus.format(formatType)+" "+presentDate.format(formatType));

                }
            }
            else
            {
                System.out.println("No range");
            }
    }
}
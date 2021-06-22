package com.company;
import java.util.Scanner;
class AgeException extends Exception
{
    AgeException(String s) {
        super(s);
    }
}
class VerifyEmail extends Exception
{
    VerifyEmail(String s) {
        super(s);
    }
}
class ContainsNumber extends Exception
{
ContainsNumber(String s){
    super(s);}
}
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner();
        int age=sc.nextInt();
        String name=sc.next();
        String email=sc.next();
        try
        {
            if(age<18)
                throw new AgeException("Age is not sufficient for voting");
            if(email.indexOf('@')<7)
                throw new VerifyEmail("Email should have minumum length of 6");
            if(name.contains("[0-9]+"))
                throw new ContainsNumber("Name contains numbers");
        }
        catch(Exception message)
        {
            System.out.print(message);
        }
        finally
        {
            System.out.println("Closing the main method");
        }
    }
    }
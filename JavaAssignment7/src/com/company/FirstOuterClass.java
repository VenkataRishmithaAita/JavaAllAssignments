package com.company;

public class FirstOuterClass {
    public  class FirstInnerClass
    {

        FirstInnerClass(String msg)
        {
            System.out.println(msg);
        }
    }
}
class SecondOuterClass
{
    class SecondInnerClass extends FirstOuterClass.FirstInnerClass
    {

        //   super("This");
        SecondInnerClass()
        {
            new FirstOuterClass().super("This is FirstInnerClass non-default constructor");
        }
        public void getMessage(String msg)
        {
            System.out.println(msg);
        }
        }
}

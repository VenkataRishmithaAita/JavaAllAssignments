package com.company;
interface InterfaceOne
{
    public void methodOneOfInterfaceOne();
    public void methodTwoOfInterfaceOne();
}
interface InterfaceTwo
{
    public void methodOneOfInterfaceTwo();
    public void methodTwoOfInterfaceTwo();
}
interface InterfaceThree
{
    public void methodOneofInterfaceThree();
    public void methodTwoofInterfaceThree();
}
interface Combine extends InterfaceOne,InterfaceTwo,InterfaceThree
{
    public void newOfCombine();
}
public class PracticingInterfaces implements Combine
{
    public void methodOneOfInterfaceOne()
    {
        System.out.println("Method-1 of interface-One");
    }

    public void methodTwoOfInterfaceOne()
    {

        System.out.println("Method-2 of interface-One");
    }
    public void methodOneOfInterfaceTwo()
    {
        System.out.println("Method-1 of interface-Two");
    }
    public void methodTwoOfInterfaceTwo()
    {

        System.out.println("Method-2 of interface-Two");
    }
    public void methodOneofInterfaceThree()
    {
        System.out.println("Method-1 of interface-Three");
    }
    public void methodTwoofInterfaceThree()
    {

        System.out.println("Method-2 of interface-Three");
    }
    public void newOfCombine()
    {
        System.out.println("Combined method of interface-Combine");
    }

}
class InterfaceAsArguments
{
    public void passingInterfaceOne(InterfaceOne i1)
    {
        i1.methodOneOfInterfaceOne();
        i1.methodTwoOfInterfaceOne();
    }
    public void passingInterfaceTwo(InterfaceTwo i2)
    {
        i2.methodTwoOfInterfaceTwo();
        i2.methodOneOfInterfaceTwo();
    }
    public void passingInterfaceThree(InterfaceThree i3)
    {
        i3.methodOneofInterfaceThree();
        i3.methodTwoofInterfaceThree();
    }
    public void passingInteraceCombine(Combine c)
    {
        c.newOfCombine();
    }
}

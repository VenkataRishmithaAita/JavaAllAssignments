package com.company;

public abstract class Rodent {
    public abstract void getColor();
    public abstract void getSize();
    public abstract void getFoundPlace();
}
class Mouse extends Rodent
{
    Mouse()
    {
        System.out.println("Getting to know about Mouse ");
    }
    @Override
    public void getColor() {
        System.out.println("Color of Mouse is white to brown");
    }

    @Override
    public void getSize() {
        System.out.println("Typical size is 5-10 cm");
    }

    @Override
    public void getFoundPlace() {
        System.out.println("Mouses are found in Asia");
    }
}
class Gerbil extends Rodent {
    Gerbil()
    {
        System.out.println("Getting to know about Gerbil");
    }

    @Override
    public void getColor() {
        System.out.println("Color of Gerbil is Golden Agouti or Black");
    }

    @Override
    public void getSize() {
        System.out.println("Typical Size is 110-135 mm");
    }

    @Override
    public void getFoundPlace() {
        System.out.println("Gerbil are found in Africa");
    }
}
class Hamster extends Rodent
{
    Hamster() {
        System.out.println("Getting to know about Hamster");
    }

    @Override
    public void getColor() {
        System.out.println("Hamsters are of black, grey, brown, white, yellow, red or a mixture of several colors");
    }

    @Override
    public void getSize() {
        System.out.println("Size is in between 4.5-10 cm");
    }

    @Override
    public void getFoundPlace() {
        System.out.println("Hamsters are found in Syeria,China,Greece and Romania");
    }
}

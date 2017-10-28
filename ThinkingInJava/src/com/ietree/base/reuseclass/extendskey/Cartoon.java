package com.ietree.base.reuseclass.extendskey;

class Art
{
    Art()
    {
        System.out.println("Art constructor"); // 2
    }
}

class Drawing extends Art
{
    Drawing()
    {
        System.out.println("Drawing constructor"); // 3
    }
}

// output:
// Art constructor
// Drawing constructor
// Cartoon constructor
public class Cartoon extends Drawing
{
    public Cartoon()
    {
        System.out.println("Cartoon constructor"); // 4
    }

    public static void main(String[] args)
    {
        @SuppressWarnings("unused")
        Cartoon x = new Cartoon(); // 1
    }
}

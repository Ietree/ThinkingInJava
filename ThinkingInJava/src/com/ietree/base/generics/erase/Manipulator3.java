package com.ietree.base.generics.erase;

public class Manipulator3
{
    private Hasf obj;

    public Manipulator3(Hasf x)
    {
        obj = x;
    }

    public void manipulate()
    {
        obj.f();
    }
}

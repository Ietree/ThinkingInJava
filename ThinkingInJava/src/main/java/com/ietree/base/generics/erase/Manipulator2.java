package com.ietree.base.generics.erase;

public class Manipulator2<T extends Hasf>
{
    private T obj;

    public Manipulator2(T x)
    {
        obj = x;
    }

    public void manipulate()
    {
        obj.f();
    }
}

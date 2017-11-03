package com.ietree.base.generics.erase;

class Manipulator<T>
{
    private T obj;

    public Manipulator(T x)
    {
        obj = x;
    }

    public void manipulate()
    {
        // The method f() is undefined for the type T
        // obj.f();
    }
}

public class Manipulation
{
    public static void main(String[] args)
    {
        Hasf hf = new Hasf();
        Manipulator<Hasf> manipulator = new Manipulator<Hasf>(hf);
    }
}

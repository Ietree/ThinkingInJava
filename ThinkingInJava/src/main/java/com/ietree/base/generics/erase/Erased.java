package com.ietree.base.generics.erase;

public class Erased<T>
{
    private final static int SIZE = 100;

    public static void f(Object arg)
    {
        // if(arg instanceof T) {}
        // T var = new T();
        // T[] array = new T[SIZE];
        // T[] array1 = (T)new Object[SIZE];
    }
}

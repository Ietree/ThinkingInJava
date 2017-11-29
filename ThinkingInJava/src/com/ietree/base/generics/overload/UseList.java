package com.ietree.base.generics.overload;

import java.util.List;

public class UseList<W, T>
{
    void f1(List<T> v) {}
    void f2(List<W> v) {}
}

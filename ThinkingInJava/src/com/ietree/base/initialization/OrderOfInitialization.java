package com.ietree.base.initialization;

// 在类的内部，变量定义的先后顺序决定了初始化的顺序。即使变量定义散布于方法定义之间，它们仍旧会在任何方法（包括构造器）被调用之前得到初始化。
class Window
{
    Window(int maker)
    {
        System.out.println("Window(" + maker + ")");
    }
}

class House
{
    House()
    {
        System.out.println("House()"); // 4
        w3 = new Window(33); // 5
    }

    Window w1 = new Window(1); // 1

    Window w2 = new Window(2); // 2

    void f()
    {
        System.out.println("f()"); // 7
        @SuppressWarnings("unused")
        Window w4 = new Window(4); // 8
    }

    Window w3 = new Window(3); // 3
}

// output:
// Window(1)
// Window(2)
// Window(3)
// House()
// Window(33)
// f()
// Window(4)
public class OrderOfInitialization
{
    public static void main(String[] args)
    {
        House h = new House();
        h.f(); // 6
    }
}

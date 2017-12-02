package com.ietree.base.staticintialization;

/**
 * 初始化的顺序是先静态对象，而后是“非静态”对象，构造器可以看成是静态方法。
 */
class Bowl
{
    public Bowl(int marker)
    {
        System.out.println("Bowl(" + marker + ")");
    }

    void f1(int marker)
    {
        System.out.println("f1(" + marker + ")");
    }
}

class Table
{
    static Bowl bowl1 = new Bowl(1); //2

    public Table()
    {
        System.out.println("Table()"); //4
        bowl2.f1(1); //5
    }

    void f2(int marker)
    {
        System.out.println("f2(" + marker + ")");
    }

    static Bowl bowl2 = new Bowl(2); //3
}

class Cupboard
{
    Bowl bowl3 = new Bowl(3); //9 //14 //18

    static Bowl bowl4 = new Bowl(4); //7

    public Cupboard()
    {
        System.out.println("Cupboard()");//10 //15  //19
        bowl4.f1(2);//11 //16 //20
    }

    void f3(int marker)
    {
        System.out.println("f3(" + marker + ")");
    }

    static Bowl bowl5 = new Bowl(5); //8
}

//output:
//Bowl(1)
//Bowl(2)
//Table()
//f1(1)
//Bowl(4)
//Bowl(5)
//Bowl(3)
//Cupboard()
//f1(2)
//Creating new Cupboard() in main
//Bowl(3)
//Cupboard()
//f1(2)
//Creating new Cupboard() in main
//Bowl(3)
//Cupboard()
//f1(2)
//f2(1)
//f3(1)
public class StaticIntialization
{
    public static void main(String[] args)
    {
        System.out.println("Creating new Cupboard() in main");//12
        new Cupboard();//13
        System.out.println("Creating new Cupboard() in main");
        new Cupboard(); //17
        table.f2(1); //21
        cupboard.f3(1);//22
    }

    static Table table = new Table(); //1

    static Cupboard cupboard = new Cupboard(); //6
}

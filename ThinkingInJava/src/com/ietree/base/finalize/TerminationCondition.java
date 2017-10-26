/*
 * 项目名称 : ThinkingInJava 创建日期 : 2017年10月26日 修改历史 : 1. [2017年10月26日]创建文件 by Root
 */
package com.ietree.base.finalize;

class Book
{
    boolean checkedOut = false;

    Book(boolean checkOut)
    {
        checkedOut = checkOut;
    }

    void checkIn()
    {
        checkedOut = false;
    }

    protected void finalize()
    {
        if (checkedOut)
        {
            System.out.println("Error : checked out");
        }
        try
        {
            super.finalize();
        } catch (Throwable e)
        {
            e.printStackTrace();
        }
    }
}

public class TerminationCondition
{
    public static void main(String[] args)
    {
        Book novel = new Book(true);
        novel.checkIn();
        new Book(true);
        System.gc();
    }
}

package com.ietree.base.innerclass;

public class Parcel1
{
    class Contents
    {
        private int i = 11;

        public int value()
        {
            return i;
        }
    }

    class Destination
    {
        private String label;

        Destination(String whereTo)
        {
            label = whereTo;
        }

        String readLabel()
        {
            return label;
        }
    }

    public Destination to(String s)
    {
        return new Destination(s);
    }

    public Contents contents()
    {
        return new Contents();
    }

    public void ship(String dest)
    {
        Contents c = new Contents();
        Destination d = new Destination(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args)
    {
        Parcel1 p = new Parcel1();
        p.ship("Beijing");

        Parcel1.Contents c = p.contents();
        Parcel1.Destination d = p.to("shanghai");
    }
}

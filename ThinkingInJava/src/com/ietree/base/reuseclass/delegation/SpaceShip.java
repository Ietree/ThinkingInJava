package com.ietree.base.reuseclass.delegation;

class SpaceShipControls
{
    void up(int velocity) {}
    void down(int velocity) {}
    void left(int velocity) {}
    void right(int velocity) {}
    void forward(int velocity) {}
    void back(int velocity) {}
    void turboBoost() {}
}

public class SpaceShip extends SpaceShipControls 
{
    private String name;

    public SpaceShip(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return name;
    }
    
    public static void main(String[] args)
    {
        SpaceShip protector = new SpaceShip("NSEA Protector");
        protector.forward(100);
    }
}

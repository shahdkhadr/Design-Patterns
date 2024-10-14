package com.example.designpatterns.Decorator;
//concrete component
public class BasicOutfit implements Clothes{

    @Override
    public double cost() {
        return 30.0;
    }

    @Override
    public String description() {
        return "Basic Outfit";
    }
}

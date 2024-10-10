package com.example.designpatterns.Decorator;

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

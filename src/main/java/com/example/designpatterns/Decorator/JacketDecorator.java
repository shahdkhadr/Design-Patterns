package com.example.designpatterns.Decorator;

public class JacketDecorator extends ClothesDecorator{
    public JacketDecorator(Clothes clothes) {
        super(clothes);
    }

    @Override
    public double cost() {
        return clothes.cost() + 40.0;
    }

    @Override
    public String description() {
        return clothes.description() + ", Jacket";
    }
}

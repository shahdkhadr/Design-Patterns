package com.example.designpatterns.Decorator;
//ConcreteDecorator
public class HatDecorator extends ClothesDecorator{
    public HatDecorator(Clothes clothes) {
        super(clothes);
    }

    @Override
    public double cost(){
        return clothes.cost() + 10.0;
    }

    @Override
    public String description() {
        return clothes.description() + ", Hat";
    }
}

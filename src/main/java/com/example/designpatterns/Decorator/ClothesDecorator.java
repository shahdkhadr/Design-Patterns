package com.example.designpatterns.Decorator;

public class ClothesDecorator implements Clothes{

    protected Clothes clothes;

    public ClothesDecorator(Clothes clothes){
        this.clothes = clothes;
    }
    @Override
    public double cost() {
        return this.clothes.cost();
    }

    @Override
    public String description() {
        return this.clothes.description();
    }
}

package com.example.designpatterns.Factory;

public class Executer {
    public static void main(String[] args){
        Sandwich sandwich = SandwichFactory.createSandwich(SandwichFactory.CHEESE_BURGER);
        sandwich.prepare();
    }
}

package com.example.designpatterns.Decorator;

public class ClothingStore {
    public static void main(String[] args){
        Clothes outfit = new BasicOutfit();
        System.out.println("Description" + outfit.description());
        System.out.println("Cost: " + outfit.cost());

        outfit = new HatDecorator(outfit);
        System.out.println("Description" + outfit.description());
        System.out.println("Cost: " + outfit.cost());

        outfit = new JacketDecorator(outfit);
        System.out.println("Description: " + outfit.description());
        System.out.println("Cost: " + outfit.cost());
    }
}

package com.example.designpatterns.Builder;

public class Executer {
    public static void main(String[] args) {
        Car car = new Car.Builder().setBrand("x").build();
    }
}

package com.example.designpatterns.Factory;

public class Sandwich {
    private String name;
    private int calories;

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void prepare(){
        System.out.println(name + " is prepered with " + calories + " calories ");
    }
}

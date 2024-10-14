package com.example.designpatterns.Builder;
public class Car {
    private String brand;
    private String color;
    private int doors;
    // a public constactur to take the values from builder and asign it to car
    public Car(Builder B) {
        this.brand = B.brand;
        this.color = B.color;
        this.doors = B.doors;
    }
    // to asign the values to the builder
    public static class Builder{
        private String brand;
        private String color;
        private int doors;
        // iner class to build the car object
        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setDoors(int doors) {
            this.doors = doors;
            return this;
        }
        public Car build(){
            return new Car(this); // create and return new car using the builder itself by pass it
            // allowing the Car to be created with the configurations set in the Builder.
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", doors=" + doors +
                '}';
    }
}

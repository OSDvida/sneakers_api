package com.sneaker_store.domain;

public class Sneaker {
    private String name;
    private double price;
    private String unityMeasure;
    private double size;
    private String color;

    public Sneaker() {
    }

    public Sneaker(String name, double price, String unityMeasure, double size, String color) {
        this.name = name;
        this.price = price;
        this.unityMeasure = unityMeasure;
        this.size = size;
        this.color = color;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUnityMeasure() {
        return unityMeasure;
    }

    public void setUnityMeasure(String unityMeasure) {
        this.unityMeasure = unityMeasure;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

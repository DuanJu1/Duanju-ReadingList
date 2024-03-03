package com.duanju.arraylist;

public class Food {
    private String Food;
    private double price;
    private String desc;

    public Food() {
    }

    public Food(String food, double price, String desc) {
        Food = food;
        this.price = price;
        this.desc = desc;
    }

    public String getFood() {
        return Food;
    }

    public void setFood(String food) {
        Food = food;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}

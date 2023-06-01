package com.infy;

import java.sql.SQLOutput;

public class Food {
    public String foodName;
    public String cuisine;
    public String foodType;
    public int quantityAvailable;
    public double unitPrice;

    public void displayFood(){
        System.out.println("Food Neme: " +foodName);
        System.out.println("Cuisine: " +cuisine);
        System.out.println("Food Type: " +foodType);
        System.out.println("Quantity Available: " +quantityAvailable);
        System.out.println("Unit Price: " +unitPrice);
    }
}

class FoodTester{
    public static void main(String[] args) {
        Food foodtest = new Food();

        foodtest.foodName = "Tuwo";
        foodtest.cuisine = "local";
        foodtest.foodType = "Maize";
        foodtest.quantityAvailable = 2;
        foodtest.unitPrice = 1.99;

        foodtest.displayFood();
    }
}

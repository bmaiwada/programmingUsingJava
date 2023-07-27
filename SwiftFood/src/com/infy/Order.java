package com.infy;

public class Order {
    public int orferId;
    public String orderFood;
    public double totalPrice;
    public String status;

    public Order(int orId, String orFood, String stats, double total){
        this.orferId = orId;
        this.orderFood = orFood;
        this.totalPrice = total;
        this.status = stats;
    }

    public void displaceOrderDetails(){
        System.out.println("Order Details");
        System.out.println("Order Id: "+orferId);
        System.out.println("Ordered Food: "+orderFood);
        System.out.println("Order Status: "+status);
    };
    public double calculateTotalPrice(int unitPrice){
        double total = unitPrice * 0.05;
        return total;
    };
}

package com.infy;

public class Resturant {
    public String resturantName;
    public long resturantContact;
    public String resturantAddress;
    public float rating;

    public Resturant(String restName, long restContact, String restAdd, float rate){
        this.resturantName = restName;
        this.resturantContact = restContact;
        this.resturantAddress = restAdd;
        this.rating = rate;
    }
    public void displayResturantDetails(){
        System.out.println();
        System.out.println("Resturant Details");
        System.out.println("Resturant Name: "+resturantName);
        System.out.println("Resturant Rating: "+rating);
        System.out.println("Resturant Contact: "+resturantContact);
        System.out.println("Resturant Address: "+resturantAddress);
    }

}

package org.example;

public class Laptop {
    private String brand;
    private float price;
    private String Lid;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getLid() {
        return Lid;
    }

    public void setLid(String lid) {
        Lid = lid;
    }

    public Laptop(String brand,float price,String Lid) {
        this.brand = brand;
        this.price = price;
        this.Lid = Lid;
    }
}

package org.example;

public class Product {
    private String pName;
    private float price;

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Product(String pName,float price) {
        this.pName = pName;
        this.price = price;
    }
}

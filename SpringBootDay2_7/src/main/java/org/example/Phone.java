package org.example;

public class Phone {
    private String modelName;
    private String companyName;
    private float price;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Phone(String modelName,String companyName,float price) {
        this.modelName = modelName;
        this.companyName = companyName;
        this.price = price;
    }
}

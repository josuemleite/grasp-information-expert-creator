package model;

public class Product {

    private int id;
    private String description;
    private double price;

    public String getDescription() {
        return this.description;
    }
    
    public double getPrice() {
        return this.price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

package model;

public class Money extends Payment {

    private double discount;
    
    public Money(double discount) {
        this.discount = discount / 100;
    }
    
    @Override
    public double calculatePrice(double value) {
        return value - (value * this.discount);
    }
}
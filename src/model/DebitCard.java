package model;

public class DebitCard extends Payment {
    
    private double discount;
    
    public DebitCard(double discount) {
        this.discount = discount;
    }
    
    @Override
    public double calculatePrice(double value) {
        return value - (value * this.discount);
    }
}
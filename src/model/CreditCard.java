package model;

public class CreditCard extends Payment {

    double interest;
    
    public CreditCard(double interest) {
        this.interest = interest/100;
    }
    
    @Override
    public double calculatePrice(double value) {
        return value + (value * this.interest);
    }
}
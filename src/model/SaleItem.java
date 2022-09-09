/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author 12093156610
 */
public class SaleItem {
    
    private Product product;
    private int quantity;
    
    public SaleItem(int productId) {
        
        DataBase db = new DataBase();
        
        this.product = db.selectProduct(productId);
    }

    public double calculateSaleItem() {
        return getProduct().getPrice() * getQuantity();
    }
    
    @Override
    public String toString() {
        return getProduct().getDescription() + "  " + getQuantity() + "  " + "R$" + calculateSaleItem();
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

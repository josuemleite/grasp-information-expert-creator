/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 12093156610
 */
public class Sale {
    
    private double totalValue = 0.0;
    private ArrayList<SaleItem> sale = new ArrayList<>();
    
    public void addSaleItem(int productId, int quantity) {
        SaleItem item = new SaleItem(productId);
        item.setQuantity(quantity);
        sale.add(item);
        totalValue += item.calculateSaleItem();
    }
    
    public double calculateSale() {
        double sum = 0.0;
        for (SaleItem saleItem : sale) {
            sum += saleItem.calculateSaleItem();
        }
        return sum;
    }
    
    public List<String> getSales() {
        List<String> formatedItens = new ArrayList<String>();
        
        for (SaleItem si : sale) {
            String formatItem =
                    si.getProduct().getId() + " " +
                    si.getProduct().getDescription() + " " +
                    si.getProduct().getPrice() + " " +
                    si.getQuantity() + " " +
                    si.calculateSaleItem();
            formatedItens.add(formatItem);
        }
        
        return formatedItens;
    }
}

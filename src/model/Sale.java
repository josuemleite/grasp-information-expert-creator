package model;

import java.util.ArrayList;
import java.util.List;

public class Sale {
    
    private ArrayList<SaleItem> sale = new ArrayList<SaleItem>();
    
    private Payment payment;
    
    public void setPaymentForm(String paymentForm) {
        DataBase db = new DataBase();
        this.payment = db.selectPaymentForm(paymentForm);
    }
    
    public Payment getPaymentForm() {
        return this.payment;
    }
    
    public void addSaleItem(int productId, int quantity) {
        SaleItem item = new SaleItem(productId, quantity);
        sale.add(item);
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

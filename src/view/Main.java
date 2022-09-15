package view;

import model.Sale;

public class Main {
    public static void main(String[] args) {
        Sale sale = new Sale();
        sale.addSaleItem(1, 3);
        sale.addSaleItem(2, 5);
        sale.addSaleItem(3, 1);
        sale.addSaleItem(4, 1);
        
        for (String si : sale.getSales()) {
            System.out.println(si);
        }
        System.out.println("Total: " + sale.calculateSale());
    }
}

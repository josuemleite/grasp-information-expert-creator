/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import model.Product;
import model.Sale;
import model.SaleItem;

/**
 *
 * @author 12093156610
 */
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

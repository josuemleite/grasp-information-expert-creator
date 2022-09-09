/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author 12093156610
 */
public class DataBase {
    
    private Map<Integer, String[]> products;
    
    public DataBase() {
        products = new HashMap<Integer, String[]>();
        
        products.put(1, new String[] {"Arroz", "10"});
        products.put(2, new String[] {"Feijão", "14"});
        products.put(3, new String[] {"Farinha", "6"});
    }
    
    public Product selectProduct(int productId) {
        
        if (products.containsKey(productId)) {
            Product p = new Product();
            p.setId(productId);
            
            String[] values = products.get(productId);
            p.setDescription(values[0]);
            p.setPrice(Integer.parseInt(values[1]));
            
            return p;
        }
        
        Product invalid = new Product();
        invalid.setDescription("Invalid Product");
        invalid.setPrice(0);
        
        return invalid;
    }
}

package model;

import java.util.HashMap;
import java.util.Map;

public class DataBase {
    
    private Map<Integer, String[]> products = new HashMap<>();
    
    private Map<String, Payment> payment = new HashMap();
    
    public DataBase() {
        products.put(1, new String[] {"Arroz", "10"});
        products.put(2, new String[] {"Feijão", "14"});
        products.put(3, new String[] {"Farinha", "6"});
        
        CreditCard cc = new CreditCard(5);
        DebitCard dc = new DebitCard(0);
        Money m = new Money(5);
        
        payment.put("cc", cc);
        payment.put("dc", dc);
        payment.put("m", m);
    }
    
    public String[] selectProduct(Integer productId) {
        if (!this.products.containsKey(productId)) {
            return new String[]{"Produto inválido!", "0"};
        }
        
        return this.products.get(productId);
    }
    
    Payment selectPaymentForm(String form) {
        return payment.get(form);
    }
}

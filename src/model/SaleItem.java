package model;

public class SaleItem {
    
    private Product product;
    private int quantity;
    
    public SaleItem(int productId, int quantity) {
        this.quantity = quantity;
        
        DataBase db = new DataBase();
        String[] productData = db.selectProduct(productId);
        
        product = new Product();
        product.setDescription(productData[0]);
        product.setPrice(Double.parseDouble(productData[1]));
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

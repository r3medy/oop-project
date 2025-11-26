package models;
import enums.*;

public class Product {
    private static int productId = 0;
    private String name;
    private Category category;
    private double unitPrice;
    private int stockQuantity;
    // TODO: add lowStockThreshold

    public Product(String name, double unitPrice, int stockQuantity, Category category) {
        productId += 1;
        this.name = name;
        this.unitPrice = unitPrice;
        this.stockQuantity = stockQuantity;
        this.category = category;
    }

    // -- Methods
    public void increaseStock(int increment) {
        if(increment <= 0) return;
        this.stockQuantity += increment;
    }
    public void decreaseStock(int decrement) {
        if(decrement <= 0 && stockQuantity >= decrement) return;
        this.stockQuantity -= decrement;
    }
    // May be removed
    public void productInformation() {
        System.out.println("Product ID     :: " + productId);
        System.out.println("Product Name   :: " + name);
        System.out.println("Product Type   :: " + this.getProductType());
        System.out.println("Unit Price     :: " + unitPrice);
        System.out.println("Stock Quantity :: " + stockQuantity);
        System.out.println("Category       :: " + category);
    }

    // -- Getters
    public String getName() { return name; }
    public double getUnitPrice() { return unitPrice; }
    public int getStockQuantity() { return stockQuantity; }
    public Category getCategory() { return category; }
    public String getProductType() { return "Non-Perishable"; }

    // -- Setters
    public void setName(String name) { this.name = name; }
    public void setUnitPrice(double unitPrice) {
        if(unitPrice < 0 || unitPrice > 100) return;
        this.unitPrice = unitPrice;
    }
    public void setStockQuantity(int stockQuantity) {
        if(stockQuantity < 0 || stockQuantity > 100) return;
        this.stockQuantity = stockQuantity;
    }
    public void setCategory(Category category) { this.category = category; }
}
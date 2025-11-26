package models;
import enums.*;
import java.time.LocalDate;

public class PerishableProduct extends Product {
    private LocalDate expiryDate;
    public PerishableProduct(String name, double unitPrice, int stockQuantity, Category category, LocalDate expiryDate) {
        super(name, unitPrice, stockQuantity, category);
        this.expiryDate = expiryDate;
    }

    // -- Getters
    public LocalDate getExpiryDate() { return expiryDate; }
    @Override
    public String getProductType() { return "Perishable"; }
}

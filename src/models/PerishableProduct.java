package models;
import interfaces.Category;
import java.time.LocalDate;

public class PerishableProduct extends Product {
    private final LocalDate expiryDate;
    public PerishableProduct(String name, double unitPrice, int stockQuantity, Category category, LocalDate expiryDate) {
        super(name, unitPrice, stockQuantity, category);
        this.expiryDate = expiryDate;
    }

    // -- Getters
    public LocalDate getExpiryDate() { return expiryDate; }
    @Override
    public String getProductType() { return "Perishable"; }
}

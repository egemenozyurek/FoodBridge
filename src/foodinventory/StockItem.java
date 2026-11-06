/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodinventory;

import java.io.Serializable;

/**
 *
 * @author egeme
 */
public class StockItem implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private String stockId;
    private String name;
    private String category;
    private int quantity;
    private String expiryDate;
    private String storageType;

    public StockItem(String stockId, String name, String category, int quantity, String expiryDate, String storageType) {
        this.stockId = stockId;
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.expiryDate = expiryDate;
        this.storageType = storageType;
    }

    public String getStockId() {
        return stockId;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public String getStorageType() {
        return storageType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public boolean isLowStock(int threshold){
        return quantity < threshold;
    }
    
    public String displayDetails(){
        return String.format("%-5s %-15s %-10s %4d  %s  %s",
                stockId, name, category, quantity, expiryDate, storageType);
    }
    
}

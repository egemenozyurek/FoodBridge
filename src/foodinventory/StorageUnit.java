/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodinventory;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author egeme
 */
public abstract class StorageUnit implements TemperatureControlled, Serializable {
    
    private static final long serialVersionUID = 1L; 
    
    protected String unitId;
    protected String location;
    protected int capacity;
    protected double temperature;
    protected ArrayList<StockItem> stockItems;

    public StorageUnit() {
        this("", "", 0, 0.0);
    }

    public StorageUnit(String unitId, String location, int capacity, double temperature) {
        this.unitId = unitId;
        this.location = location;
        this.capacity = capacity;
        this.temperature = temperature;
        this.stockItems = new ArrayList<>();
    }

    public String getUnitId() {
        return unitId;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getTemperature() {
        return temperature;
    }

    @Override
    public abstract boolean canStore(StockItem item);

    @Override
    public int getFreeSpace() {
        int used = 0;
        for(StockItem s : stockItems){
            used += s.getQuantity();
        }
        return capacity - used;
    }
    
    public boolean addStock(StockItem item){
        if(canStore(item)) {
            stockItems.add(item);
            return true;
        }
        return false;
    }
    
    public String displayDetails() {
        int used = capacity - getFreeSpace();
        return getClass().getSimpleName().toUpperCase() + " " + unitId + " | " + location
                + " | " + temperature + " C | " + used + "/" + capacity;
    }

    @Override
    public void setTemperature(double temperature){
        this.temperature = temperature;
    }
}

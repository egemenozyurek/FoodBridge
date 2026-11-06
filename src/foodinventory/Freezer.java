/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodinventory;

/**
 *
 * @author egeme
 */
public class Freezer extends StorageUnit{
    
    private static final long serialVerionUID = 1L;
    
    private String defrostDate;
    
    public Freezer(String unitId, String location, int capacity, double temperature) {
        super(unitId, location, capacity, temperature);
        this.defrostDate = "not set";
    }

    /** Overloaded: default capacity 80 and -18  C. */
    public Freezer(String unitId, String location) {
        this(unitId, location, 80, -18.0);
    }

    public String getDefrostDate() {
        return defrostDate;
    }

    public void setDefrostDate(String defrostDate) {
        this.defrostDate = defrostDate;
    }
    
    public String displayDetails(){
        return super.displayDetails() + " | defrost " + defrostDate;
    }

    @Override
    public boolean canStore(StockItem item) {
        return item.getStorageType().equals("Frozen")
                && getFreeSpace() >= item.getQuantity();
    }
    
}

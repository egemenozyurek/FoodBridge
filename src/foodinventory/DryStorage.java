/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodinventory;

/**
 *
 * @author egeme
 */
public class DryStorage extends StorageUnit {
    
    private static final long serialVersionUID = 1L;
    
    private int shelfCount;

    public DryStorage(String unitId, String location, int capacity, int shelfCount){
        super(unitId, location, capacity, 20.0);
    }

    public DryStorage(String unitId, String location){
        this(unitId, location, 300, 6);
    }

    public int getShelfCOunt() {
        return shelfCount;
    }

    public void setShelfCOunt(int shelfCOunt) {
        this.shelfCount = shelfCOunt;
    }
    

    @Override
    public boolean canStore(StockItem item) {
        return item.getStorageType().equals("Ambient")
                && getFreeSpace() >= item.getQuantity();
    }
    @Override
    public String displayDetails(){
        return super.displayDetails() + " | " + shelfCount + " shelves";
    }
    
    
}

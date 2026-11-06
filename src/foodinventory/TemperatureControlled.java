/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package foodinventory;

/**
 *
 * @author egeme
 */
public interface TemperatureControlled {
    boolean canStore(StockItem item);
    
    int getFreeSpace();
    
    void setTemperature(double temperature);
    
    double getTemperature();
    
}

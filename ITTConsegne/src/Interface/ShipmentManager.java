/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Delivery.Delivery;
import Recipient.Recipient;
import Shipment.Shipment;
import java.util.ArrayList;

/**
 *
 * @author Marco
 */
public interface ShipmentManager {
    
    public ArrayList<Shipment> read();
    public boolean addShipment(String tracking, float weight, String name, String street, int cap, String city);
    
}
